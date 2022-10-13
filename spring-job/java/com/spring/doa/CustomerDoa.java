package com.spring.doa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.model.Customer;

public interface CustomerDoa extends JpaRepository <Customer, Integer> {

}
