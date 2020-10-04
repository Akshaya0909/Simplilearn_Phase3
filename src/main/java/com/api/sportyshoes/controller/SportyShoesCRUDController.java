package com.api.sportyshoes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.api.sportyshoes.model.SportyShoesProduct;
import com.api.sportyshoes.model.SportyShoesUsers;

import com.api.sportyshoes.service.SportyShoesProductService;

import com.api.sportyshoes.service.SportyShoesUsersService;


@RestController
public class SportyShoesCRUDController {
	
	@Autowired
	private SportyShoesUsersService userservice;
	@Autowired
	private SportyShoesProductService productservice;


	@PostMapping("/user")
	public SportyShoesUsers createSportyShoesUser(@RequestBody SportyShoesUsers user)
	{
		return userservice.createUser(user);
	}
	
	@PutMapping("/user")
	public SportyShoesUsers updateUser(@RequestBody SportyShoesUsers user)
	{
		return userservice.updateUser(user);
	}
	
	@GetMapping("/user/{id}")
	public SportyShoesUsers getSportyShoesUsersbyId(@PathVariable long id) {
		return userservice.getSportyShoesUsersbyId(id);
		
	}
	@DeleteMapping("/user/{id}")
	public void deleteSportyShoesUsersbyId(@PathVariable long id) {
		userservice.deleteSportyShoesUsersbyId(id);
	}
	
	
		
		
	
		
		@PostMapping("/product")
		public SportyShoesProduct createSportyShoesProduct(@RequestBody SportyShoesProduct product)
		{
			return productservice.createSportyShoesProduct(product);
		}
		
		@PutMapping("/product")
		public SportyShoesProduct updateProduct(@RequestBody SportyShoesProduct product)
		{
			return productservice.updateProduct(product);
		}
		
		@GetMapping("/product/{id}")
		public SportyShoesProduct getSportyShoesProductbyId(@PathVariable long id) {
			return productservice.getSportyShoesProductbyId(id);
			
		}
		@DeleteMapping("/product/{id}")
		public void deleteSportyShoesProductbyId(@PathVariable long id) {
			productservice.deleteSportyShoesProductbyId(id);
		
}
	}

