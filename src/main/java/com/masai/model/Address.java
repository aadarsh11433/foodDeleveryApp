package com.masai.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Service
@Entity
public class Address {

	@Id
	private int addressID;
	private String buildingName;
	private String street;
	private String area;
	private String city;
	private String state;
	private String country;
	private String pincode;
	
	@OneToOne
	private Restaurant restaurant;
	
	@OneToOne
	private Customer customer;
	
}
