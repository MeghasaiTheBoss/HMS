package com.hms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hms.entities.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> 
{

}
