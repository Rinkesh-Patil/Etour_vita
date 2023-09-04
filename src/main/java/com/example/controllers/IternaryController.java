package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Iternary;
import com.example.services.IternaryService;

@RestController
@CrossOrigin("*")
public class IternaryController {
	
	@Autowired
	IternaryService manager;
	
	@GetMapping(value="api/Iternary")
	public List<Iternary> showIternary()
	{
		return manager.getIternary();
	}
	
	@GetMapping(value="api/Iternary/{id}")
	public List<Iternary> getIternary(@PathVariable int id)
	{
		return manager.getIternaryById(id);
	}
	
	@PostMapping(value="api/Iternary")
	public Iternary addIternary(@RequestBody Iternary i)
	{
		return manager.addIternary(i);
	}
	
	
	@DeleteMapping(value="api/Iternary/{id}")
	public void RemoveIternary( @PathVariable int id)
	{
		manager.deleteIternary(id);
		
	}

}
