package com.briup.cms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.cms.mapper.CategoryMapper;
import com.briup.cms.mapper.CustomerMapper;
import com.briup.cms.model.Customer;
import com.briup.cms.model.CustomerExample;
import com.briup.cms.service.ICustomerService;
@Service
public class CustomerServiceImpl implements ICustomerService{
	@Autowired
	private CustomerMapper customerMapper;
	@Override
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		return customerMapper.selectByExample(new CustomerExample());
	}

}
