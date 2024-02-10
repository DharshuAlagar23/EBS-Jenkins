package com.ebs.bean;

public class Response {

	String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Response() {
		super();
	}

	public Response(String message) {
		super();
		this.message = message;
	}
	
}
