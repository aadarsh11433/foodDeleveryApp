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
public class Customer {

	@Id
	private int customerId;
	private String firstName;
	private String lastName;
	private String gender;
	private String mobile;
	private String email;
	private int age;
	
	@OneToOne
	private Address address;
	
}
