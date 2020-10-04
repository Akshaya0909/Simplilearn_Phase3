package com.api.sportyshoes.dto;

import java.util.Date;

//import java.util.Date;


//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
//@JsonIgnoreProperties(ignoreUnknown = true)
//@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class NameInfoResponse {
	
	private String firstname;
	private String lastname;
	private String name;
	private double price;
	private Date dateOfPurchase;
	private String categoryName;
	private int qty;
	
	
	
	//public NameInfoResponse(String firstname,String lastname,String Productname) {
		//this.firstname = firstname;
		//this.lastname = lastname;
		//this.Productname = Productname;
	//}

	//public NameInfoResponse(String firstname,String lastname,String Productname,double price,Date dateofPurchase,int qty) {
		//super();
		//this.firstname = firstname;
		//this.lastname = lastname;
		//this.Productname = Productname;
		//this.price = price;
		//this.dateofPurchase = dateofPurchase;
		//this.qty = qty;
		
	//}
	
	//public NameInfoResponse(String firstname,String lastname,String Productname,double price,String category_name,int qty) {
		//this.firstname = firstname;
		//this.lastname = lastname;
		//this.Productname = Productname;
		//this.price = price;
		//this.category_name = category_name;
		//this.qty = qty;
		
	//}



}
