package com.example.demo.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "detailsbill")
public class detailsBill {
	
	@ManyToOne
	@JoinColumn(name = "idbill")
	public bill idBill;
	
	public int quantity;
	
	@ManyToOne
	@JoinColumn(name = "idproduct")
	public Product  idProduct;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
public int id;



}
