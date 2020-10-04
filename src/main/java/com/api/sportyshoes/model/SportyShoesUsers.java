package com.api.sportyshoes.model;

//import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TemporalType;

//import org.springframework.data.jpa.repository.Temporal;
import javax.persistence.Temporal;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "SportyShoesUsers")
@Getter
@Setter
@NoArgsConstructor
@ToString

public class SportyShoesUsers {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private long ID;
	
	@Column(name = "firstname")
	private String firstname;
	
	@Column(name = "lastname")
	private String lastname;
	
	@Column(name = "address")
	private String address;

	@Column(name = "age")
	private int age;

	//@Column(name = "date_added")
	@Temporal(TemporalType.DATE)
	
	@Column(name = "dateAdded")
	private java.util.Date dateAdded;  
	private String password;
	private String role;
	private boolean enabled;
	
	@OneToMany(targetEntity=SportyShoesProduct.class,cascade = CascadeType.ALL)
	@JoinColumn(name="userproduct_fk",referencedColumnName="ID")
	
	private List<SportyShoesProduct> products;


}
