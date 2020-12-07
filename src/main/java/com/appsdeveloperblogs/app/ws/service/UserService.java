package com.appsdeveloperblogs.app.ws.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.appsdeveloperblogs.app.ws.shared.dto.UserDto;

public interface UserService extends UserDetailsService {
	
	UserDto createUser(UserDto user);
	UserDto getUser(String email);

}
