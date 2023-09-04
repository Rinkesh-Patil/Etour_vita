package com.example.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Customers;
import com.example.repositories.CustomerRepository;


@Service
public class CustomersServImpl implements CustomersService {
	
	@Autowired
	CustomerRepository repo;

	@Override
	public void createCustomers(Customers customer) {
		repo.save(customer);
		
	}

	@Override
	public List<Customers> getCustomers() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Optional<Customers> getCustomersbyid(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}


	@Override
	public Optional<Customers> getCustomerspass(int id) {
		// TODO Auto-generated method stub
		return repo.fetchCustomerpass(id);
	}


	@Override
	public void deleteCustomers(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		
	}

	
	
	@Override
	public void putCustomersEmail(String email, int id) {
		// TODO Auto-generated method stub
		repo.updateCustomerEmail(email, id);
		
	}
	
	@Override
	public void putCustomersFirstName(String FirstName, int id) {
		// TODO Auto-generated method stub
		repo.updateCustomerFirstName(FirstName, id);
		
	}

	@Override
	public void putCustomersPass(String pass, int id) {
		// TODO Auto-generated method stub
		repo.updateCustomerPass(pass, id);
	}

	@Override
	public Optional<Customers> getCustomersmobile(int id) {
		// TODO Auto-generated method stub
		return repo.fetchCustomerMobile(id);
	}

	public Optional<Customers> getcustomerbymob(String mobile, String password) {
		// TODO Auto-generated method stub
		return repo.getCustomerByMobileAndPassword(mobile,password);
	}

	

	
	
}