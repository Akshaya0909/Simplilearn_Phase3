package com.api.sportyshoes.repository;

//import java.util.Date;
//import java.sql.Date;
import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.query.Param;

//import com.api.sportyshoes.dto.CategoryInfoResponse;
//import com.api.sportyshoes.dto.DateInfoResponse;
import com.api.sportyshoes.dto.NameInfoResponse;
import com.api.sportyshoes.model.SportyShoesUsers;

public interface SportyShoesUsersRepository extends JpaRepository<SportyShoesUsers,Long> {

	
	public List<SportyShoesUsers> findByFirstname(String firstname);
	public List<SportyShoesUsers> findByLastname(String lastname);
	public List<SportyShoesUsers> findByAge(int age);
	public List<SportyShoesUsers> findByDateAdded(java.util.Date dateAdded);
	//@Query(value="SELECT new com.api.sportyshoes.dto.NameInfoResponse(u.FIRSTNAME,u.LASTNAME,p.NAME,p.PRICE,p.DATE_OF_PURCHASE,p.CATEGORY_NAME,p.QTY) FROM SPORTY_SHOES_USERS u INNER JOIN SPORT_PRODUCT p ON u.ID= p.USERPRODUCT_FK WHERE p.CATEGORY_NAME = : categoryName",nativeQuery = true)
	//public List<NameInfoResponse> getJoinInformationbyCategory(@Param("categoryName") String categoryName);
	//@Query(value="SELECT new com.api.sportyshoes.dto.NameInfoResponse(u.FIRSTNAME,u.LASTNAME,p.NAME,p.PRICE,p.DATE_OF_PURCHASE,p.CATEGORY_NAME,p.QTY) FROM SPORTY_SHOES_USERS u INNER JOIN SPORT_PRODUCT p ON u.ID= p.USERPRODUCT_FK WHERE p.DATE_OF_PURCHASE = ?1",nativeQuery = true)
	//public List<NameInfoResponse> getJoinInformationbyDateofPurchase(Date dateOfPurchase);
	//@Query(value="SELECT new com.api.sportyshoes.dto.NameInfoResponse(u.FIRSTNAME,u.LASTNAME,p.NAME,p.CATEGORY_NAME,p.DATE_OF_PURCHASE,p.PRICE,p.QTY) FROM SPORTY_SHOES_USERS u INNER JOIN SPORT_PRODUCT p ON u.ID= p.USERPRODUCT_FK",nativeQuery = true)
	//public List<NameInfoResponse> getJoinInformation();
	@Query("SELECT new com.api.sportyshoes.dto.NameInfoResponse(u.firstname,u.lastname,p.name,p.price,p.dateOfPurchase,p.categoryName,p.qty) FROM SportyShoesUsers u JOIN u.products p")
	public List<NameInfoResponse> getJoinInformation();
	//@Query("SELECT new com.api.sportyshoes.dto.CategoryInfoResponse(u.fname,u.lname p.name,p.date_of_purchase,p.price,p.qty) FROM SportyShoesUsers u JOIN u.products p WHERE p.category_name=?1")
	//public List<CategoryInfoResponse> getJoinInformationbyCategory(String category_name);
	//@Query("SELECT new com.api.sportyshoes.dto.DateInfoResponse(u.fname,u.lname p.name,p.category_name,p.price,p.qty) FROM SportyShoesUsers u JOIN (SELECT u.products p WHERE p.date_of_purchase=?1)")
	//public List<DateInfoResponse> getJoinInformationbyDateofPurchase(Date date_of_purchase);
	//@Query("SELECT new com.api.sportyshoes.dto.NameInfoResponse(u.fname,u.lname p.name,p.price,p.qty) FROM SportyShoesUsers u JOIN u.products p WHERE p.date_of_purchase=?1 and p.category_name=?2")
	//public List<NameInfoResponse> getJoinInformationbyDateandCategory(Date date_of_purchase,String category_name);
	
	//@Query("SELECT u FROM SportyShoesUsers u WHERE u.firstname = :firstname")
    //public SportyShoesUsers getUserByUsername(@Param("firstname") String firstname);
	
	
	

	
}
