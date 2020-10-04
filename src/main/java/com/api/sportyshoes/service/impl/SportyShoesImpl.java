package com.api.sportyshoes.service.impl;

//import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.api.sportyshoes.dto.CategoryInfoResponse;
//import com.api.sportyshoes.dto.DateInfoResponse;
import com.api.sportyshoes.dto.NameInfoResponse;
import com.api.sportyshoes.model.SportyShoesProduct;
import com.api.sportyshoes.model.SportyShoesUsers;
import com.api.sportyshoes.repository.SportyShoesProductRepository;
import com.api.sportyshoes.repository.SportyShoesUsersRepository;
import com.api.sportyshoes.service.SportyShoesProductService;
import com.api.sportyshoes.service.SportyShoesUsersService;


@Service
public class SportyShoesImpl implements SportyShoesProductService, SportyShoesUsersService{
	
	@Autowired
	private SportyShoesProductRepository productrepository;
	@Autowired
	private SportyShoesUsersRepository usersrepository;

	@Override
	public SportyShoesUsers createUser(SportyShoesUsers user) {
		return usersrepository.save(user);
	}

	@Override
	public void deleteSportyShoesUsersbyId(long id) {
		usersrepository.deleteById(id);	
	}

	@Override
	public SportyShoesUsers updateUser(SportyShoesUsers user) {
		return usersrepository.save(user);
	}

	@Override
	public SportyShoesUsers getSportyShoesUsersbyId(long id) {
		return usersrepository.findById(id).get();
	}

	@Override
	public List<SportyShoesUsers> getAllSportyShoesUser() {
		return usersrepository.findAll();
	}

	@Override
	public List<SportyShoesUsers> getAllSportyShoesUserByAge(int age) {
		return usersrepository.findByAge(age);
	}

	@Override
	public List<SportyShoesUsers> getAllSportyShoesUserByName(String firstname) {
		return usersrepository.findByFirstname(firstname);
	}

	@Override
	public List<SportyShoesUsers> getAllSportyShoesUserByDate(java.util.Date dateAdded) {
		return usersrepository.findByDateAdded(dateAdded);
	}

	@Override
	public List<NameInfoResponse> getJoinInformation() {
		return usersrepository.getJoinInformation();
	}

	//@Override
	//public List<NameInfoResponse> getJoinInformationbyCategory(String categoryName) {
		//return usersrepository.getJoinInformationbyCategory(categoryName);
	//}

	
	

	@Override
	public SportyShoesProduct createSportyShoesProduct(SportyShoesProduct product) {
		return productrepository.save(product);
	}

	@Override
	public void deleteSportyShoesProductbyId(long id) {
		 productrepository.deleteById(id);
	}

	@Override
	public SportyShoesProduct updateProduct(SportyShoesProduct product) {
		return productrepository.save(product);
	}

	@Override
	public SportyShoesProduct getSportyShoesProductbyId(long id) {
		return productrepository.findById(id).get();
	}

	@Override
	public List<SportyShoesProduct> getAllSportyShoesProduct() {
		return productrepository.findAll();
	}

	@Override
	public List<SportyShoesProduct> getAllSportyShoesProductByPrice(double price) {
		return productrepository.findByPrice(price);
	}

	@Override
	public List<SportyShoesProduct> getAllSportyShoesProductByName(String name) {
		return productrepository.findByName(name);
	}

	@Override
	public List<SportyShoesProduct> getAllSportyShoesProductByDateOfPurchase(java.util.Date dateOfPurchase) {
		return productrepository.findByDateOfPurchase(dateOfPurchase);
	}

	@Override
	public List<SportyShoesProduct> getAllSportyShoesProductByCategoryName(String categoryName) {
		return productrepository.findByCategoryName(categoryName);
	}

	@Override
	public List<SportyShoesProduct> getAllSportyShoesProductByqty(int qty) {
		return productrepository.findByqty(qty);
	}

	//@Override
	//public List<NameInfoResponse> getJoinInformationbyDateofPurchase(java.util.Date dateOfPurchase) {
		//return usersrepository.getJoinInformationbyDateofPurchase(dateOfPurchase);
	//}
	
}
	
	