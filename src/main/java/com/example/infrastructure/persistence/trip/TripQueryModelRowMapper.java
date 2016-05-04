package com.example.infrastructure.persistence.trip;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.query.model.trip.TripQueryModel;

public class TripQueryModelRowMapper implements RowMapper<TripQueryModel> {

	@Override
	public TripQueryModel mapRow(ResultSet resultSet, int index) throws SQLException {

		String id = resultSet.getString("ID");
		
		String destination = resultSet.getString("DESTINATION");

		String start = resultSet.getString("START_DATE");

		String end = resultSet.getString("END_DATE");

		String comment = resultSet.getString("COMMENT");

		String email = resultSet.getString("EMAIL");
		
		String user_id = resultSet.getString("USER_ID");

		return new TripQueryModel(id, destination, start, end, comment, user_id, email);
	}

}
