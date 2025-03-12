package com.soft.nagar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soft.nagar.model.Resident;
import com.soft.nagar.repository.ResidentRepository;

@Service
public class ResidentService {

	@Autowired
	ResidentRepository residentRepository;
	
	public void addResident(Resident resident) {
		residentRepository.save(resident);
	}

	public Resident getResidentById(Long id) {
		return (residentRepository.findById(id)).orElse(null);
	}

	
}
