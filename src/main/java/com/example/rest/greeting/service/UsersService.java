package com.example.rest.greeting.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.example.rest.greeting.entity.Users;
import com.example.rest.greeting.repository.UsersRepository;

@Service
public class UsersService {
	@Autowired
	private UsersRepository userRepository;

	public List<Users> getAll(){
		return userRepository.findAll();
	}
}
