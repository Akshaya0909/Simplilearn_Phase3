package com.api.sportyshoes.service;

//import java.util.Date;
//import java.util.Date;
//import java.sql.Date;
import java.util.List;

//import com.api.sportyshoes.dto.CategoryInfoResponse;
//import com.api.sportyshoes.dto.DateInfoResponse;

//import org.springframework.data.jpa.repository.Query;

import com.api.sportyshoes.dto.NameInfoResponse;
import com.api.sportyshoes.model.SportyShoesUsers;

public interface SportyShoesUsersService {
	
	public SportyShoesUsers createUser(SportyShoesUsers user);
	public void deleteSportyShoesUsersbyId(long id);
	public SportyShoesUsers updateUser(SportyShoesUsers user);
	public SportyShoesUsers getSportyShoesUsersbyId(long id);
	public List<SportyShoesUsers> getAllSportyShoesUser();
	public List<SportyShoesUsers> getAllSportyShoesUserByAge(int age);
	public List<SportyShoesUsers> getAllSportyShoesUserByName(String firstname);
	public List<SportyShoesUsers> getAllSportyShoesUserByDate(java.util.Date dateAdded);
	
	
	public List<NameInfoResponse> getJoinInformation();
	//public List<NameInfoResponse> getJoinInformationbyCategory(String categoryName);
	//public List<NameInfoResponse> getJoinInformationbyDateofPurchase(Date dateOfPurchase);
	//public List<NameInfoResponse> getJoinInformationbyDateandCategory(Date date_of_purchase,String category_name);

	


	
	

}
