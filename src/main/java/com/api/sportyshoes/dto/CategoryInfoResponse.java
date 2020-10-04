package com.api.sportyshoes.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class CategoryInfoResponse {
	private String firstname;
	private String lastname;
	private String Productname;
	private double price;
	private Date dateofPurchase;
	private int qty;
	

}
