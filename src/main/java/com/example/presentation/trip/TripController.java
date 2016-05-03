package com.example.presentation.trip;

import java.util.UUID;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.application.trip.TripApplicationService;
import com.example.application.trip.UpdateTripCommand;
import com.example.domain.model.trip.TripId;
import com.example.query.model.Pagination;
import com.example.query.model.QueryResult;
import com.example.query.model.trip.TripFilter;
import com.example.query.model.trip.TripQueryModel;

@RestController
public class TripController {

	private TripApplicationService service;

	@Autowired
	public TripController(TripApplicationService service) {
		this.service = service;
	}

	@RequestMapping(value = "/trip/{tripId}", method = RequestMethod.PUT, consumes = "application/json")
	public void update(@PathVariable String tripId, @RequestBody @NotNull @Valid UpdateTripCommand cmd) {
		service.update(cmd);
	}
	
	
    @RequestMapping(value = "/trip/{tripId}", method = RequestMethod.DELETE)
    public void delete(@PathVariable String tripId)  {
        service.remove(new TripId(UUID.fromString(tripId)));
    }

	@RequestMapping(value = "/trip", produces = "application/json")
	public QueryResult<TripQueryModel> getTrips(@RequestParam("destination") String destination,
			@RequestParam("start") String start, @RequestParam("currentPage") int currentPage,
			@RequestParam("itemsPerPage") int itemsPerPage) {

		System.out.println("Destination - start - end: " + destination + " - " + start + " - ");

		QueryResult<TripQueryModel> trips = service.find(new Pagination(currentPage, itemsPerPage),
				new TripFilter(null, null, null, null));

		return trips;
	}

}
