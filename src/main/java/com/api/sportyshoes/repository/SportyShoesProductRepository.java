package com.api.sportyshoes.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import com.api.sportyshoes.model.SportyShoesProduct;



public interface SportyShoesProductRepository extends JpaRepository<SportyShoesProduct,Long>{
  
	
	public List<SportyShoesProduct> findByName(String name);
	public List<SportyShoesProduct> findByPrice(double price);
	//public List<SportyShoesProduct> findByDate_of_Purchase(Date date_of_purchase);
	public List<SportyShoesProduct> findByCategoryName(String categoryName);
	public List<SportyShoesProduct> findByqty(int qty);
	public List<SportyShoesProduct> findByDateOfPurchase(java.util.Date dateOfPurchase);
	

	
	
	

	
}
