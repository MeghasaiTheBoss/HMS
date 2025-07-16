package com.hms.services;

import org.springframework.stereotype.Service;

import com.hms.entities.Patient;

@Service
public class PatientService 
{
	
	public boolean validateData(String email, String password)
	{
		return false;
	}

	public void deletePatient(Long id) 
	{
		// TODO Auto-generated method stub
		
	}

	public Patient getPatientById(Long id) 
	{
		// TODO Auto-generated method stub
		return null;
	}

	public void updatePatient(Long id, Patient patient) 
	{
		// TODO Auto-generated method stub
		
	}

	public void addPatient(Patient patient) 
	{
		// TODO Auto-generated method stub
		
	}

	public Object getAllPatients() 
	{
		// TODO Auto-generated method stub
		return null;
	}

}
