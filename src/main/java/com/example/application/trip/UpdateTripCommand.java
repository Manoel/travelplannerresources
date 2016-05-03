package com.example.application.trip;

import java.util.Date;

import javax.validation.constraints.NotNull;

public class UpdateTripCommand {
	
	@NotNull
	private String id;
	
	@NotNull
	private String destination;
	
	@NotNull
	private Date start;
	
	@NotNull
	private Date end;
	
	@NotNull
	private String comment;

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
	
	
	

}
