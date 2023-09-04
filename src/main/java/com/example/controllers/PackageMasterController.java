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

import com.example.entities.PackageMaster;
//import com.example.entities.SubSector;
import com.example.services.PackageMasterService;

@RestController
@CrossOrigin("*") 
public class PackageMasterController {
 @Autowired
 private PackageMasterService manager;
 
 @GetMapping(value="api/PackageMaster")
 public List<PackageMaster> showProduct(){
	 return manager.getPackages();
 }
  @GetMapping(value="api/packageMaster/{id}")
  public Optional<PackageMaster> getPack(@PathVariable int id){
	  Optional<PackageMaster> pm =manager.getPackages(id);
	  return pm;
  }
  //delete
 @DeleteMapping(value="api/PackageMaster/{id}")
 public void removepackage(@PathVariable int id) {
	 manager.delete(id);
 }
 
 @GetMapping(value="api/package/{id}")
	public  List<PackageMaster> getpackages(@PathVariable int id){
		return manager.getSubSectorsById(id);
	}
 //post
 @PostMapping(value="api/PackageMaster")
 public void addpackage(@RequestBody PackageMaster pm) {
	 manager.addPackages(pm);
 }
 
 
}
