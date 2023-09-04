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

import com.example.entities.Bookings;
import com.example.services.BookingService;

@RestController
@CrossOrigin("*")
public class BookingController {
	@Autowired
	private  BookingService manager;
	
	@GetMapping(value = "api/Booking")
	public List<Bookings> showbookings()
	{
		return manager.getBookings();
	}
	
	@GetMapping(value = "api/Booking/{id}")
	public Bookings getbook(@PathVariable int id)
	{
		return manager.getBookingsbyid(id);
		
	}
	
	@DeleteMapping(value = "api/Booking/{id}")
	public void removebook(@PathVariable int id)
	{
		manager.deletebking(id);
	}
	
	@PostMapping(value = "api/Booking")
	public void add(@RequestBody Bookings b)
	{
		manager.createBooking(b);
	}
}
