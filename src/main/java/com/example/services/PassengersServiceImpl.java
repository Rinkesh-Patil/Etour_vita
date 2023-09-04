package com.example.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Passengers;
import com.example.repositories.PassengersRepository;
@Service
public class PassengersServiceImpl implements PassengersService {
	@Autowired
	private PassengersRepository passRepo;

	@Override
	public void addPassengers(Passengers passenger) {
		passRepo.save(passenger);
		
	}

	@Override
	public List<Passengers> getAll() {
		return passRepo.findAll();
	}

	@Override
	public void delete(int id) {
		passRepo.deleteById(id);;
		
	}
	@Override
	public List<String> findByMobPass(String mobile, String password) {
		// TODO Auto-generated method stub
		return passRepo.findByuserName(mobile, password);
	}

//	@Override
//	public void update(Passengers passenger, int id) {
//		// TODO Auto-generated method stub
//		
//	}

	@Override
	public Optional<Passengers> getPassengerById(int id) {
		return passRepo.findById(id);
	}

	@Override
	public Optional<Passengers> getPassInfoByCustid(int id) {
		
		return passRepo.getinfo(id) ;
	}
        
}
