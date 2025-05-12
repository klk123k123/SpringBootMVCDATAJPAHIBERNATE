package com.example.demo.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.mvc.Entity.Customer;

@Repository
public interface Customerrepo extends JpaRepository<Customer,Integer> {

}
