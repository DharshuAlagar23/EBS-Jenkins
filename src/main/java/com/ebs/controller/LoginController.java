package com.ebs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ebs.bean.Response;
import com.ebs.bean.User;
import com.ebs.service.LoginService;

@RestController
@CrossOrigin("http://localhost:4200/")
public class LoginController {

	@Autowired
	LoginService service;
	
	@RequestMapping("/login")
	public ResponseEntity<Response> performLogin(@RequestBody User user) {
		Response res=service.login(user);
			return ResponseEntity.ok(res);

	}
}
