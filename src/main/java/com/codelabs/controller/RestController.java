package com.codelabs.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api/v1")
public class RestController {
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String getHome() {
		return "Home Page";
	}
	
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String getUserPage() {
		return "User Page";
	}
	
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String getAdminPage() {
		return "Admin Page";
	}
	
}
