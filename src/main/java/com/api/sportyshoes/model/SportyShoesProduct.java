package com.api.sportyshoes.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TemporalType;

//import org.springframework.data.jpa.repository.Temporal;
import javax.persistence.Temporal;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name = "SportProduct")
@Getter
@Setter
@NoArgsConstructor
@ToString

public class SportyShoesProduct {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private long ID;
	@Column(name = "name")
	private String name;
	@Column(name = "price")
	private double price;
	@Temporal(TemporalType.DATE)
	@Column(name = "dateOfPurchase")
	private java.util.Date dateOfPurchase;
	@Column(name = "categoryName")
	private String categoryName;
	@Column(name = "qty")
	private int qty;
	
	
	

}
