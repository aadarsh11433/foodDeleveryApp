package com.masai.model;

import java.time.LocalDateTime;
import java.util.List;

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
public class OrderDetails {

	@Id
	private int orderId;
	private LocalDateTime time;
	private String status;
	
	@OneToOne
	private FoodCart cart;
	
}
