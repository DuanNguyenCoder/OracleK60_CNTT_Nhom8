package com.example.demo.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "categories")
public class category {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	public int id;
	public String name;
	
	@OneToMany(mappedBy = "idCate" )
	public List<detailsCategories> detailsCate;
	
	
}
