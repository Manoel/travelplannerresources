package com.example.presentation.user;

import java.util.Date;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.application.user.CreateAccountCommand;
import com.example.application.user.LoginCommand;
import com.example.application.user.UserApplicationService;

@RestController
public class UserController {

	private UserApplicationService service;

	@Autowired
	public UserController(UserApplicationService service) {
		this.service = service;
	}
	
	@RequestMapping("/user")
	public LoginCommand login(@NotNull @Valid LoginCommand cmd) {
		System.out.println(new Date() + ": GET USER " + cmd);
		return cmd;
	}

	@RequestMapping(method = RequestMethod.POST)
	public void createAccount(@NotNull @Valid CreateAccountCommand cmd) {
		service.createAccount(cmd);
	}

}
