package com.example.demo.responsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.brand;

@Repository
public interface brandRepository extends JpaRepository<brand, Integer> {
	
	
}
