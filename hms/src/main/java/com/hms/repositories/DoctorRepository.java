package com.hms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hms.entities.Doctor;
@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> 
{
	
}
