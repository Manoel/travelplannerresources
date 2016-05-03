package com.example.query.model.trip;

import java.util.Date;

import com.example.query.model.QueryModel;

public class TripQueryModel implements QueryModel {
	
	private String id;
	
	private String destination;
	
	private Date start;
	
	private Date end;
	
	private String comment;
	
	private String user;
	
	public TripQueryModel(String id, String destination, Date start, Date end, String comment, String user) {
		super();
		this.id = id;
		this.destination = destination;
		this.start = start;
		this.end = end;
		this.comment = comment;
		this.user = user;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}
	

}
