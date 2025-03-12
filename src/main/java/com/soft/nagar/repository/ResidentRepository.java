package com.soft.nagar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.soft.nagar.model.Resident;

@Repository
public interface ResidentRepository extends JpaRepository<Resident, Long>{

}
