package com.example.domain.model.trip;

import com.example.domain.IRepository;

public interface TripRepository extends IRepository<Trip, TripId> {

	void add(Trip trip);
	
	void remove(TripId trip);
	
	void update(Trip trip);
	
}
