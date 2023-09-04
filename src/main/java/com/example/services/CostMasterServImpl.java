package com.example.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.CostMaster;
import com.example.repositories.CostMasterRepository;


@Service
public class CostMasterServImpl implements CostMasterService {
	
	@Autowired
	CostMasterRepository repo;

	@Override
	public void save(CostMaster ref) {
		// TODO Auto-generated method stub
		repo.save(ref);
	}

	@Override
	public List<CostMaster> getAllCostMaster() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	
	public void delete(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		
	}

	@Override
	public Optional<CostMaster> getCostMastercostbyid(int id) {
		// TODO Auto-generated method stub
		return repo.fetchCost(id);
	}

	@Override
	public Optional<CostMaster> getCostByPackid(int id) {
	
		return repo.findByPackageId(id);
	}




}

