package com.example.domain.model.trip;

import java.util.Date;
import java.util.UUID;

import com.example.domain.Entity;
import com.example.domain.model.user.UserId;

public class Trip extends Entity<TripId> {

	private String destination;

	private Date start;

	private Date end;

	private String comment;

	private UserId userId;

	public Trip(String id, String destination, Date start, Date end, String comment, UserId userId) {
		super(new TripId(UUID.fromString(id)));
		this.destination = destination;
		this.start = start;
		this.end = end;
		this.comment = comment;
		this.userId = userId;
	}
	
	public Trip(String id, String destination, Date start, Date end, String comment) {
		this(id, destination, start, end, comment, null);
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

	public UserId getUserId() {
		return userId;
	}

	public void setUserId(UserId userId) {
		this.userId = userId;
	}
	
}
