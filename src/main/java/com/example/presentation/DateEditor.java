package com.example.presentation;

import java.beans.PropertyEditorSupport;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEditor extends PropertyEditorSupport {

	public static final DateFormat DF = new SimpleDateFormat("yyyy-MM-dd");

	@Override
	public void setAsText(String value) {
		Date date = null;

		if (value != null && !value.trim().equals(""))
			date = parseDate(value);

		this.setValue(date);
	}

	@Override
	public String getAsText() {
		Date date = (Date) this.getValue();
		return date != null ? DF.format(date) : null;
	}

	private Date parseDate(String date) {
		try {
			return DF.parse(date);
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
	}
}
