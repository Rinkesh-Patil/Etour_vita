package com.example.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Sectors;
import com.example.services.SectorService;

@RestController
@CrossOrigin("*")
public class SectorController {
	@Autowired
	SectorService manager;
	
	@GetMapping("tour/sectors")
	public List<Sectors> showSectors()
	{
		return manager.getSector();
	}
	
	@GetMapping("tour/sectors/{id}")
	public Optional<Sectors> getSector(@PathVariable int id)
	{
		return manager.getById(id);
	}
	
	@PostMapping("tour/sectors")
	public void add(@RequestBody Sectors s)
	{
		manager.addSector(s);
	}
	
	@PostMapping("tour/sectors/{id}")
	public void removeSector(@PathVariable int id)
	{
		manager.remove(id);
	}
	
	
	

}
