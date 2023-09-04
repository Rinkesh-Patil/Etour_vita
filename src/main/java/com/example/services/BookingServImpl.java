package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Bookings;
import com.example.repositories.BookingRepository;



@Service
public class BookingServImpl implements BookingService {
    @Autowired
	private BookingRepository repo;
	@Override
	public void createBooking(Bookings booking) {
	
		repo.save(booking);
	}

	@Override
	public List<Bookings> getBookings() {
		return repo.findAll();
	}

	@Override
	public Bookings getBookingsbyid(int id) {
		return repo.findById(id).orElse(null);
		
	}

	@Override
	public void deletebking(int id) {
		repo.deleteById(id);
		
	}

	
}
