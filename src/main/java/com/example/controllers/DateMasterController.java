package com.example.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.DateMaster;
import com.example.services.DateMasterService;



@RestController  
@CrossOrigin("*")
public class DateMasterController
{
	@Autowired
	private DateMasterService manager;

	@GetMapping(value = "api/DateMaster")
	 public List<DateMaster> showDates()
	 {
	
		  return manager.getDateMaster(); 
		
	 }
	
	@GetMapping(value = "api/DateMaster/{id}")
	 public Optional<DateMaster> getPro(@PathVariable int id)
	 {
		Optional<DateMaster> DM=manager.getDateMaster(id);
		return DM;
	 }

	@DeleteMapping(value = "api/DateMaster/{id}")
	 public void removeemp(@PathVariable int id)
	 {
		manager.delete(id);
	 }
	
	
	@PostMapping(value = "api/DateMaster")
	 public void addDate(@RequestBody DateMaster Date)
	 {
		
		manager.addDate(Date);
	 }
}
