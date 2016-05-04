package com.example.infrastructure.persistence.trip;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Component;

import com.example.query.model.Pagination;
import com.example.query.model.QueryResult;
import com.example.query.model.trip.TripFilter;
import com.example.query.model.trip.TripFinder;
import com.example.query.model.trip.TripQueryModel;

@Component
public class JdbcTripFinder extends JdbcDaoSupport implements TripFinder {

	@Autowired
	public JdbcTripFinder(DataSource dataSource) {
		setDataSource(dataSource);
	}

	@Override
	public QueryResult<TripQueryModel> find(Pagination pagination, TripFilter filter) {
		int limit = pagination.getItemsPerPage();

		int offset = pagination.getItemsPerPage() * (pagination.getCurrentPage() - 1);

		TripQueryMetaData queryMetaData = new TripQueryMetaData(filter);

		String query = "SELECT T.ID ID, T.DESTINATION DESTINATION, "
				+ "TO_CHAR(T.START_DATE, 'YYYY-MM-DD') START_DATE, TO_CHAR(T.END_DATE, 'YYYY-MM-DD') END_DATE, "
				+ "T.COMMENT COMMENT, U.EMAIL EMAIL, U.ID USER_ID " 
				+ "FROM TRAVELPLANNER.TRIP T INNER JOIN TRAVELPLANNER.USER U "
				+ "ON T.USER_ID = U.ID " + queryMetaData.getWhereClause()
				+ "ORDER BY T.DESTINATION, T.START_DATE DESC LIMIT " + limit + " OFFSET " + offset;

		String queryCount = "SELECT count(*) " + "FROM TRAVELPLANNER.TRIP T INNER JOIN TRAVELPLANNER.USER U "
				+ "ON T.USER_ID = U.ID " + queryMetaData.getWhereClause();

		List<TripQueryModel> queryModels = getJdbcTemplate().query(query, new TripQueryModelRowMapper(),
				queryMetaData.getQueryParameters());

		int totalItems = getJdbcTemplate().queryForObject(queryCount, queryMetaData.getQueryParameters(),
				Integer.class);

		return new QueryResult<>(queryModels, totalItems);
	}

}
