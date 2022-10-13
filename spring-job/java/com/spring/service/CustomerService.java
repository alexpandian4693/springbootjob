package com.spring.service;

import java.sql.Date;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import org.slf4j.Logger; 
import org.slf4j.LoggerFactory; 

import com.spring.doa.CustomerDoa;
import com.spring.model.Customer;


@Service
public class CustomerService {
	@Autowired
	private CustomerDoa doa;
	 Logger logger 
     = LoggerFactory.getLogger(CustomerService.class); 
	
	@Scheduled(fixedRate = 5000)
	public void addtojob() {
		Customer customer = new Customer();
		customer.setName("customer" + new Random().nextInt(123));
		customer.setPhone("customer" + new Random().nextInt(123));
		customer.setEmail("customer" + new Random().nextInt(123));
		customer.setCity("customer" + new Random().nextInt(123));
		doa.save(customer);
		
		System.out.println("add service call in" + new Random().nextInt(4348));
		
	}
	@Scheduled (cron = "0/15 * * * * *" )
	public void fetchDBjob() {
		List<Customer> customer=doa.findAll();
		System.out.println("fetch service call in" + new Random().nextInt(4348));
		System.out.println("no of record fetched" + customer.size());
		logger.info("Customers : {}", customer);
		
	}

}
