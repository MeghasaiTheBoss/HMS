package com.hms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hms.entities.Bill;

@Repository
public interface BillingRepository extends JpaRepository<Bill, Long> {

}
