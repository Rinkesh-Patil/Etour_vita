package com.example.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.DateMaster;
import com.example.repositories.DateMasterRepository;
@Service
public class DateMasterServImpl implements DateMasterService {
	@Autowired
	DateMasterRepository repository;
	

	@Override
	public List<DateMaster> getDateMaster() {
		
		return repository.findAll();
	}

	@Override
	public Optional<DateMaster> getDateMaster(int id) {
		
		return repository.findById(id);
	}

	@Override
	public void delete(int id) {
		repository.deleteById(id);
		
	}

	@Override
	public void addDate(DateMaster e) {
	repository.save(e);
		
	}

}
