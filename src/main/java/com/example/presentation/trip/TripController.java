package com.example.presentation.trip;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.application.trip.TripApplicationService;
import com.example.query.model.QueryResult;
import com.example.query.model.trip.TripQueryModel;

@RestController
public class TripController {

	private TripApplicationService service;

	@Autowired
	public TripController(TripApplicationService service) {
		this.service = service;
	}
	
	@RequestMapping(value = "/trip", produces="application/json")
	public QueryResult<TripQueryModel> getTrips(@RequestParam("destination") String destination, @RequestParam("start") String start) {
		System.out.println("Destination - start - end: " + destination + " - " + start + " - " );
		return new QueryResult<TripQueryModel>(new ArrayList<>(), 0);
		
	}

}
