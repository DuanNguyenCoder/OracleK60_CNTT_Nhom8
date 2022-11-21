package com.example.demo.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "discount")
public class discount {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;
	public int percent;
	
	@Column(name = "todate")
	public Date toDate;
	
	@OneToMany(mappedBy = "idDiscount")
	public List<Product> product;
}
