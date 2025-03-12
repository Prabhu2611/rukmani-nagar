package com.soft.nagar.model;

import java.util.Date;

import com.soft.nagar.enums.Nagar;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Resident {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "resident_id")
	Long id;
	
	private String name;
	
	private Date dob;
	
	private String mobileNumber;
	
	private int plotNumber;
	
	private String address;
	
	private Nagar nagar;
	
	private Integer pincode;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public int getPlotNumber() {
		return plotNumber;
	}

	public void setPlotNumber(int plotNumber) {
		this.plotNumber = plotNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Nagar getNagar() {
		return nagar;
	}

	public void setNagar(Nagar nagar) {
		this.nagar = nagar;
	}

	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	
	
}
