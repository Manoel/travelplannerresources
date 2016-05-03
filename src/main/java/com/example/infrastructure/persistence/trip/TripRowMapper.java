package com.example.infrastructure.persistence.trip;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.domain.model.trip.Trip;

public class TripRowMapper implements RowMapper<Trip> {

	@Override
	public Trip mapRow(ResultSet arg0, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
