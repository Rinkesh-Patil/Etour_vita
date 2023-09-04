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

import com.example.entities.SubSector;
import com.example.services.SubSectorService;

@CrossOrigin("*")
@RestController
public class SubSectorController {

	@Autowired
	SubSectorService service;
	
	@GetMapping(value="api/SubSector")
	public  List<SubSector> showsubsector(){
		return service.getAllSubSectors();
	}
	
	@GetMapping(value="api/SubSector/{id}")
	public  List<SubSector> getsubsector(@PathVariable int id){
		return service.getSubSectorsById(id);
	}
	
	@DeleteMapping(value="api/SubSector/{id}")
	public void removesubsector(@PathVariable int id){
	         service.deleteSubSector(id);
	}
	
	@PostMapping(value="api/SubSector")
	public void add(@RequestBody SubSector b) {
		service.saveSubSector(b);
	}
	
}
