package com.example.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Passengers;
import com.example.services.PassengersService;

@RestController
@CrossOrigin("*")
public class PassengersController {
     @Autowired
	private PassengersService passService;
     
     @GetMapping("/api/getpassinfo/{id}")
     public Optional<Passengers> getPassInfo(@PathVariable int id) {
    	 Optional<Passengers> info = passService.getPassInfoByCustid(id);
    	 return info;
      }
     
     @PostMapping("/api/passenger")
     public void addPass(@RequestBody Passengers pass) {
    	 passService.addPassengers(pass);	 
     }
     @GetMapping("/api/CustomerController/login")
 	public ResponseEntity<List<String>> authCustomer(@RequestParam String mobile, @RequestParam String password) {
 	    List<String> result = passService.findByMobPass(mobile, password);

 	    if (result != null && !result.isEmpty()) {
 	        return ResponseEntity.ok(result);
 	    } else {
 	        return ResponseEntity.notFound().build();
 	    }
 	}
     
     @GetMapping("/api/getPassenger/{id}")
     public Optional<Passengers> getPassengerById(@PathVariable int id){
    	 Optional<Passengers> p = passService.getPassengerById(id);
    	 return p;
    	 
     }
     @GetMapping("/api/getAllPassengers")
     public List<Passengers> getAllPassengers(){
    	 return passService.getAll();
     }
     

}
