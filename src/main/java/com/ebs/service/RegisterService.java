package com.ebs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebs.bean.User;
import com.ebs.repo.UserRepo;

@Service
public class RegisterService {

	@Autowired
	UserRepo repo;
	
    public boolean Register(User user) {
		repo.save(user);
		return true;
	}

}
