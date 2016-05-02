package com.example.domain.model.trip;

import java.util.UUID;

import com.example.domain.KeyIdentity;

public class TripId extends KeyIdentity<UUID> {
	
	public TripId(UUID value) {
		super(value);
	}

}
