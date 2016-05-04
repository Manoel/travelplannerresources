package com.example.application.trip;

import java.util.Date;

import javax.validation.constraints.NotNull;

public class UpdateTripCommand {
	
//	private static DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	
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
	
	@NotNull 
	private String userId;

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
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
//	public Date getStartDate() {
//		return parseDate(getStart());
//	}
//	
//	public Date getEndDate() {
//		return parseDate(getEnd());
//	}
//	
//	private Date parseDate(String date) {
//		try {
//			return df.parse(getStart());
//		} catch (ParseException e) {
//			throw new RuntimeException(e);
//		}
//	}	
}
