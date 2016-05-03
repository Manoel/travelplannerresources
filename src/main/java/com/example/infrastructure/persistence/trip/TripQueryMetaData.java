package com.example.infrastructure.persistence.trip;

import java.util.ArrayList;
import java.util.List;

import com.example.query.model.trip.TripFilter;

// TODO: have to consider the user id
public class TripQueryMetaData {

	private String whereClause;

	private Object[] queryParameters;

	public TripQueryMetaData(TripFilter filter) {
		createMetaData(filter);
	}

	public String getWhereClause() {
		return whereClause;
	}

	public Object[] getQueryParameters() {
		return queryParameters;
	}

	private void createMetaData(TripFilter filter) {
		StringBuilder sb = new StringBuilder();
		String connector = " AND ";

		List<Object> parameters = new ArrayList<>();

		if (filter != null && filter.getDestination() != null && !filter.getDestination().trim().equals("")) {
			sb.append(connector);
			sb.append(" UPPER(t.destination) LIKE ? ");

			parameters.add("%" + filter.getDestination().trim().toUpperCase() + "%");
		}

		if (filter != null && filter.getStart() != null) {
			sb.append(connector);
			sb.append(" t.start_date >= ? ");

			parameters.add(filter.getStart());
		}

		if (filter != null && filter.getEnd() != null) {
			sb.append(connector);
			sb.append(" t.end_date <= ? ");

			parameters.add(filter.getEnd());
		}

		whereClause = " WHERE 1 = 1 " + sb.toString();

		queryParameters = parameters.toArray();
	}

}
