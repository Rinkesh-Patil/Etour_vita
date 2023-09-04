package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Iternary;
import com.example.repositories.IternaryRepository;

@Service
public class IternaryServImpl implements IternaryService {
	
	@Autowired
	IternaryRepository repo;

	@Override
	public Iternary addIternary(Iternary iternary) {
		// TODO Auto-generated method stub
		return repo.save(iternary);
	}

	@Override
	public List<Iternary> getIternary() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public List<Iternary> getIternaryById(int packId) {
		// TODO Auto-generated method stub
		return repo.findByPackageId(packId);
	}

//	@Override
//	public Iternary getIternaryByDay(String Day) {
//		// TODO Auto-generated method stub
//		return repo.findByDay(Day);
//	}

	@Override
	public void deleteIternary(int iternaryId) {
		// TODO Auto-generated method stub
		repo.deleteById(iternaryId);
		
	}
	
}
