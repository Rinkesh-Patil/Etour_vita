package com.example.controllers;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Customers;
import com.example.services.CustomersService;

@RestController
@CrossOrigin("*")
public class CustomerController {


	@Autowired
	private CustomersService serv;
	
	@PostMapping("/api/CustomerController")
	public void addCustomers(@RequestBody Customers cust)
	{
		serv.createCustomers(cust);
	}
	
	@GetMapping("/api/CustomerController")
	List<Customers> getallCustomers(){
		 return serv.getCustomers();
	}
	
	

	@GetMapping("/api/CustomerByid/{Id}")
	public Optional<Customers> getCustomersbyid(@PathVariable int Id)
	{
		return serv.getCustomersbyid(Id);
	}
	
	@GetMapping("/api/FetchCustomerPass/{Id}")
	public Optional<Customers> getCustomersbypass(@PathVariable int Id)
	{
		return serv.getCustomerspass(Id);
	}
	
	@DeleteMapping("/api/CustomerController/{Id}")
	void deleteCustomers(@PathVariable int Id) {
		serv.deleteCustomers(Id);
		
		
	}
	
	@PutMapping("/api/UpdateCustomerPass/{Id}")
	void updateCustomerPass(@PathVariable Integer Id,@RequestBody Customers customer ) {
		serv.putCustomersPass(customer.getPassword(), Id);
	}
	
	@PutMapping("/api/CustomerEmail/{Id}")
	void putCustomersEmail(@PathVariable Integer Id,@RequestBody Customers customer ) {
		serv.putCustomersEmail(customer.getEmail(),Id);
	}
	
	@PutMapping("/api/CustomerFirstName/{Id}")
	void putCustomersFirstName(@PathVariable Integer Id,@RequestBody Customers customer ) {
		serv.putCustomersFirstName(customer.getFirstname(),Id);
	}
	
	@GetMapping("/api/GetCustomerMobile/{Id}")
	public Optional <Customers> getCustomerMobile(@PathVariable int Id) {
		return serv.getCustomersmobile(Id);
	}
	

	@GetMapping("/api/CustomerLoginValidation/{mobile}/{password}")
    public Optional <Customers>  getCustomerbymobile(@PathVariable String mobile,@PathVariable String password,@RequestBody Customers customer){
		return serv.getcustomerbymob(mobile, password);
    }
}