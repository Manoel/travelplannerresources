package com.example.infrastructure.persistence.trip;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import org.springframework.jdbc.core.RowMapper;

import com.example.query.model.trip.TripQueryModel;

public class TripQueryModelRowMapper implements RowMapper<TripQueryModel> {

	@Override
	public TripQueryModel mapRow(ResultSet resultSet, int index) throws SQLException {

		String id = resultSet.getString("ID");
		
		String destination = resultSet.getString("DESTINATION");

		Date start = resultSet.getDate("START_DATE");

		Date end = resultSet.getDate("END_DATE");

		String comment = resultSet.getString("COMMENT");

		String email = resultSet.getString("EMAIL");

		return new TripQueryModel(id, destination, start, end, comment, email);
	}

}
