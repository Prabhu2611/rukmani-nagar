package com.soft.nagar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soft.nagar.model.Resident;
import com.soft.nagar.service.ResidentService;

@RestController
@RequestMapping("/resident")
public class ResidentController {

	@Autowired
	ResidentService residentService;
	
	
	@PostMapping("/add")
	public void addResident(@RequestBody Resident resident) {
		residentService.addResident(resident);
	}
	
	@GetMapping("/get/{id}")
	public Resident getResidentBy(@PathVariable("id") Long id) {
		return residentService.getResidentById(id);
	}
}
