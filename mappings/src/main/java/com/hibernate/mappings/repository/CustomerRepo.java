package com.hibernate.mappings.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.hibernate.mappings.dto.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long> {

}
