package com.hms.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Doctor 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long doctorId;
	
	private String name;
	
	private String specialization;
	
	private String contactNumber;
	
	public String availabilitySchedule;

	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Doctor(long doctorId, String name, String specialization, String contactNumber,
			String availabilitySchedule) {
		super();
		this.doctorId = doctorId;
		this.name = name;
		this.specialization = specialization;
		this.contactNumber = contactNumber;
		this.availabilitySchedule = availabilitySchedule;
	}

	public Doctor(String name, String specialization, String contactNumber, String availabilitySchedule) {
		super();
		this.name = name;
		this.specialization = specialization;
		this.contactNumber = contactNumber;
		this.availabilitySchedule = availabilitySchedule;
	}

	public long getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(long doctorId) {
		this.doctorId = doctorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getAvailabilitySchedule() {
		return availabilitySchedule;
	}

	public void setAvailabilitySchedule(String availabilitySchedule) {
		this.availabilitySchedule = availabilitySchedule;
	}
	
	
	
	
}
