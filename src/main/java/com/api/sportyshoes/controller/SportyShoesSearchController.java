package com.api.sportyshoes.controller;

//import java.util.Date;
import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.sportyshoes.dto.NameInfoResponse;
//import com.api.sportyshoes.dto.CategoryInfoResponse;
//import com.api.sportyshoes.dto.DateInfoResponse;
//import com.api.sportyshoes.dto.NameInfoResponse;
import com.api.sportyshoes.model.SportyShoesProduct;
import com.api.sportyshoes.model.SportyShoesUsers;
import com.api.sportyshoes.service.SportyShoesProductService;


import com.api.sportyshoes.service.SportyShoesUsersService;


@RestController
public class SportyShoesSearchController {
	
	@Autowired
	private SportyShoesUsersService userservice;
	@Autowired
	private SportyShoesProductService productservice;
	
	@GetMapping("/users")
	public List<SportyShoesUsers> getAllSportyShoesUser(){
		return userservice.getAllSportyShoesUser();
	}
	
	@GetMapping("/users/age/{age}")
	public List<SportyShoesUsers> getAllSportyShoesUserByAge(@PathVariable int age){
		return userservice.getAllSportyShoesUserByAge(age);
	}
	@GetMapping("/users/name/{firstname}")
	public List<SportyShoesUsers> getAllSportyShoesUserByName(@PathVariable("firstname") String firstname){
		return userservice.getAllSportyShoesUserByName(firstname);
	}
	
	@GetMapping("/users/date/{date}")
	public List<SportyShoesUsers> getAllSportyShoesUserByDate(@PathVariable Date date){
		return userservice.getAllSportyShoesUserByDate(date);
	}
	
	@GetMapping("/getInfo")
	public List<NameInfoResponse> getJoinInformation(){
		return userservice.getJoinInformation();
	}
	//@GetMapping("/getCategoryInfo/{categoryName}")
	//@RequestMapping(value="/getCategoryInfo/{categoryName}", method = RequestMethod.GET)
	//public @ResponseBody List<NameInfoResponse> getJoinInformationbyCategory(@PathVariable("categoryName") String categoryName){
		//return userservice.getJoinInformationbyCategory(categoryName);
	//}
	//@GetMapping("/getDateInfo/{dateOfPurchase}")
	
	//public List<NameInfoResponse> getJoinInformationbyDateofPurchase(@PathVariable("dateOfPurchase") Date dateOfPurchase){
		//return userservice.getJoinInformationbyDateofPurchase(dateOfPurchase);
	//}
	
	
	

	


	
	@GetMapping("/products")
	public List<SportyShoesProduct> getAllSportyShoesProduct() {
		return productservice.getAllSportyShoesProduct();
	}
	@GetMapping("/products/price/{price}")
	public List<SportyShoesProduct> getAllSportyShoesProductByPrice(@PathVariable double price) {
		return productservice.getAllSportyShoesProductByPrice(price);
	}
	@GetMapping("/products/name/{name}")
	public List<SportyShoesProduct> getAllSportyShoesProductByName(@PathVariable String name) {
		return productservice.getAllSportyShoesProductByName(name);
	}
	@GetMapping("/products/dateOfPurchase/{dateOfPurchase}")
	public List<SportyShoesProduct> getAllSportyShoesProductByDateOfPurchase(@PathVariable("dateOfPurchase") Date dateOfPurchase){
		return productservice.getAllSportyShoesProductByDateOfPurchase(dateOfPurchase);
	}
	
	@GetMapping("/products/category_name/{category_name}")
	public List<SportyShoesProduct> getAllSportyShoesProductByCategoryName(@PathVariable String category_name){
		return productservice.getAllSportyShoesProductByCategoryName(category_name);
	}
	@GetMapping("/products/qty/{qty}")
	public List<SportyShoesProduct> getAllSportyShoesProductByqty(@PathVariable int qty){
		return productservice.getAllSportyShoesProductByqty(qty);
		
	}
	
	

	
	
	
	

	

	
	





}
