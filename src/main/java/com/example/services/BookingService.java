package com.example.services;

import java.util.List;



import com.example.entities.Bookings;
public interface BookingService {
	void createBooking(Bookings booking);
	List<Bookings> getBookings();
	Bookings getBookingsbyid(int id);
//	void update(int bookingId, Bookings booking);
	void deletebking(int id);

}
