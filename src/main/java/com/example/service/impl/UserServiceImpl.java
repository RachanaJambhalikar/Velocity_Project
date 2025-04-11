package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Claim;
import com.example.entity.User;
import com.example.repository.UserRepository;
import com.example.service.UserService;

import jakarta.transaction.Transactional;

@Service
public class UserServiceImpl implements UserService{
	 @Autowired
	    private UserRepository userRepository;

	    @Transactional
	    @Override
	    public User addUser(User user) {
	        if (user.getClaims() != null) {
	            for (Claim claim : user.getClaims()) {
	                claim.setUser(user); // Set user in claim
	            }
	        }
	        return userRepository.save(user);
	    }
	}
