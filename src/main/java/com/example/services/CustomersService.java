package com.example.services;

import java.util.List;
import java.util.Optional;

import com.example.entities.Customers;

public interface CustomersService {
	void createCustomers(Customers customer);
	List<Customers> getCustomers();
	public Optional<Customers> getCustomersbyid(int id);
	void deleteCustomers(int id);
	
	void putCustomersPass(String pass,int id);
	void putCustomersEmail(String email,int id);
	void putCustomersFirstName(String FirstName,int id);
	public Optional<Customers> getCustomerspass(int id);
	Optional<Customers> getcustomerbymob(String mobile, String password);
	Optional<Customers> getCustomersmobile(int id);
	
	
}