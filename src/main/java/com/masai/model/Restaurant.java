package com.masai.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
public class Restaurant {

	@Id
	private int restroId;
	private String restroName;
	private String managerName;
	private String contact;
	
	@OneToOne
	private Address address;
	
	@OneToMany
	private List<Item> items;
}
