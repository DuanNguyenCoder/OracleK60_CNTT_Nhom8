package com.example.demo.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	@Entity
	@Table(name = "brand")
	@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="id")
	public class brand {
		
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	public int id;
	
	public String name;
	
	@OneToMany(mappedBy = "idBrand")
	//@JsonManagedReference
	@JsonIgnore
	public List<Product> product;
	}

