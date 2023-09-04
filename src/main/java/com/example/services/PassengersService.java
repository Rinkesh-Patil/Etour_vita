package com.example.services;

import java.util.List;
import java.util.Optional;

import com.example.entities.Passengers;

public interface PassengersService {
	void addPassengers(Passengers passenger);
	List<Passengers> getAll();
	void delete(int id);
	//void update(Passengers passenger,int id);
	Optional<Passengers> getPassengerById(int id);
	Optional<Passengers> getPassInfoByCustid(int id);
	List<String> findByMobPass(String mobile, String password);

}
