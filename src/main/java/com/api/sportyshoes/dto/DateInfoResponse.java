package com.api.sportyshoes.dto;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class DateInfoResponse {
	private String firstname;
	private String lastname;
	private String Productname;
	private double price;
	private String category_name;
	private int qty;
	

}
