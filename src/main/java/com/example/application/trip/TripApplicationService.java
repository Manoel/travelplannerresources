package com.example.application.trip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.model.trip.Trip;
import com.example.domain.model.trip.TripId;
import com.example.domain.model.trip.TripRepository;
import com.example.query.model.Pagination;
import com.example.query.model.QueryResult;
import com.example.query.model.trip.TripFilter;
import com.example.query.model.trip.TripFinder;
import com.example.query.model.trip.TripQueryModel;

@Service
public class TripApplicationService {

	private TripRepository repository;

	private TripFinder finder;

	@Autowired
	public TripApplicationService(TripRepository repository, TripFinder finder) {
		super();
		this.repository = repository;
		this.finder = finder;
	}

	@Transactional
	public void update(UpdateTripCommand cmd) {
		Trip trip = new Trip(cmd.getId(), cmd.getDestination(), cmd.getStart(), cmd.getEnd(), cmd.getComment());
		repository.update(trip);
	}
	
	@Transactional
	public void remove(TripId tripId) {		
		repository.remove(tripId);
	}

	@Transactional(readOnly = true)
	public QueryResult<TripQueryModel> find(Pagination pagination, TripFilter filter) {
		return finder.find(pagination, filter);
	}

}
