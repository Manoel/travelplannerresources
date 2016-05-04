package com.example.application.trip;

import java.util.Date;

import javax.validation.constraints.NotNull;

public class AddTripCommand {
	
	@NotNull
	private Date start;
	
	@NotNull
	private Date end;
	
	@NotNull
	private String destination;
	
	@NotNull
	private String comment;
	
	// TODO: user id must be not null
//	@NotNull
	private String userId;

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

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
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

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	

}
