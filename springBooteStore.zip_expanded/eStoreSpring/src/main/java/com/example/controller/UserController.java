package com.example.controller;



import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.User;
import com.example.repository.UserRepository;

;

@RestController
@RequestMapping("/users");
public class UserController {
		@Autowired
		UserRepository usersRepo;
		User us = new User();
		
		
		@PostMapping(path="/login")
		public Response<User> loginUser(@RequestParam String email, String password) {
		     
			User usr = UserRepository.findByEmailAndPassword(email, password).get();
			Date dt = new Date();
			if(!usr.getFullName().isEmpty()) {
				return new Response<Users>(101, usr + " Logged in successfuly at "+dt, null);
			} else {
				return new Response(201, usr + " Authentication failed at  "+dt, null);
			} 
}
		
		@PostMapping(path="/add")
		public Response<User> addUser(@RequestParam String email, @RequestParam String password, @RequestParam String fullName, @RequestParam String street,  @RequestParam String city, @RequestParam String state, @RequestParam String zip, @RequestParam String country ,@RequestParam String pincode, @RequestParam String image, @RequestParam String contact) {
			Date dt = new Date();
			User usr = new User(email, password, fullName, street, city, state, country, pincode, image, contact);
			UserRepository.save();
			return Repsonse<User>(101, usr + " User Added Successful on  "+dt, null);
			
			
}
		
		

