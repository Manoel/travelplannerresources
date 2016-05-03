package com.example.query.model.trip;

import java.util.Date;

public class TripFilter {
	
	private String destination;
	
	private Date start;
	
	private Date end;
	
	private String userId;

	public TripFilter(String destination, Date start, Date end, String userId) {
		super();
		this.destination = destination;
		this.start = start;
		this.end = end;
		this.userId = userId;
	}

	public String getDestination() {
		return destination;
	}

	public Date getStart() {
		return start;
	}

	public Date getEnd() {
		return end;
	}

	public String getUserId() {
		return userId;
	}
	
}
