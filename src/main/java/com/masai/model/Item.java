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
public class Item {

	@Id
	private int itemId;
	private String itemName;
	private double cost;
	private int quantity; 
	
	@OneToOne
	private Category category;
	
	@OneToMany
	private List<Restaurant> restros;
}
