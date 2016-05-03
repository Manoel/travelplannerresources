package com.example.infrastructure.persistence.trip;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.example.domain.model.trip.Trip;
import com.example.domain.model.trip.TripId;
import com.example.domain.model.trip.TripRepository;

@Repository
public class JdbcTripRepository extends JdbcDaoSupport implements TripRepository {

	@Autowired
	public JdbcTripRepository(DataSource dataSource) {
		setDataSource(dataSource);
	}

	@Override
	public Trip load(TripId id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Trip trip) {
		String insert = "INSERT INTO TRAVELPLANNER.TRIP(ID, START_DATE, END_DATE, DESTINATION, COMMENT, USER_ID) "
				+ " VALUES(?, ?, ?, ?, ?, ?)";

		getJdbcTemplate().update(insert, trip.getKey().value().toString(), trip.getStart(), trip.getEnd(),
				trip.getDestination(), trip.getComment(), trip.getUserId().value().toString());
	}

	@Override
	public void remove(TripId tripId) {
		String delete = "DELETE FROM TRAVELPLANNER.TRIP T WHERE T.ID = ?";

		getJdbcTemplate().update(delete, tripId.value().toString());
	}

	@Override
	public void update(Trip trip) {
		String update = "UPDATE TRAVELPLANNER.TRIP T SET T.START_DATE = ?, "
				+ "T.END_DATE = ?, T.DESTINATION = ?, T.COMMENT = ? WHERE T.ID = ?";

		getJdbcTemplate().update(update, trip.getStart(), trip.getEnd(), trip.getDestination(), trip.getComment(),
				trip.getKey().value().toString());
	}

}
