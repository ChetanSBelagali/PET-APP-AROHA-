package com.aroha.pet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aroha.pet.model.CPojo;

@Repository
public interface CRepo extends JpaRepository<CPojo, Long>{
	
	

}
