package com.nic.usermanagement.model;

import com.fasterxml.jackson.annotation.JsonView;

public class AjaxResponseBody {

	@JsonView(Views.Public.class)
	String msg;

	@JsonView(Views.Public.class)
	String code;

	//@JsonView(Views.Public.class)
	//List<User> result;

	//getters and setters
}
