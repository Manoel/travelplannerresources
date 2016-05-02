package com.example.domain.model.user;

import java.util.UUID;

import com.example.domain.KeyIdentity;

public class UserId extends KeyIdentity<UUID> {
	
	public UserId(UUID value) {
		super(value);
	}

}
