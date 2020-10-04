package com.api.sportyshoes.service;

import java.util.List;


import com.api.sportyshoes.model.SportyShoesProduct;


public interface SportyShoesProductService {
	public SportyShoesProduct createSportyShoesProduct(SportyShoesProduct product);
	public void deleteSportyShoesProductbyId(long id);
	public SportyShoesProduct updateProduct(SportyShoesProduct product);
	public SportyShoesProduct getSportyShoesProductbyId(long id);
	public List<SportyShoesProduct> getAllSportyShoesProduct();
	public List<SportyShoesProduct> getAllSportyShoesProductByPrice(double price);
	public List<SportyShoesProduct> getAllSportyShoesProductByName(String name);
	public List<SportyShoesProduct> getAllSportyShoesProductByDateOfPurchase(java.util.Date dateOfPurchase);
	public List<SportyShoesProduct> getAllSportyShoesProductByCategoryName(String categoryName);
	public List<SportyShoesProduct> getAllSportyShoesProductByqty(int qty);
	
	
	
	
	
	
	


}