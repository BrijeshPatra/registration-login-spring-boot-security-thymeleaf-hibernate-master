package com.springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.springboot.model.User;
import com.springboot.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
