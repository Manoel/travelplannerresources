package com.example.application.user;

import org.springframework.stereotype.Service;

@Service
public class UserApplicationService {
	
	public void createAccount(CreateAccountCommand cmd) {
		System.out.println("Account created " + cmd.getEmail() + " " + cmd.getPassword());
	}

}
