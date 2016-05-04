package com.example.query.model.trip;

import com.example.query.model.QueryModel;

public class TripQueryModel implements QueryModel {
	
	private String id;
	
	private String destination;
	
	private String start;
	
	private String end;
	
	private String comment;
	
	private String userId;
	
	private String email;
	
	public TripQueryModel(String id, String destination, String start, String end, String comment, String userId, String email) {
		super();
		this.id = id;
		this.destination = destination;
		this.start = start;
		this.end = end;
		this.comment = comment;
		this.userId = userId;
		this.email = email;
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

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserID(String userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

}
