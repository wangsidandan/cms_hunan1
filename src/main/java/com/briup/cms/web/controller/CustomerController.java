package com.briup.cms.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.cms.model.Customer;
import com.briup.cms.service.ICustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private ICustomerService customerService;
	
	@GetMapping("/findAll")
	public List<Customer> findAll() {
		List<Customer> customers = customerService.findAll();
		return customers;
	}
}
