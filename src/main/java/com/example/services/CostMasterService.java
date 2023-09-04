package com.example.services;

import java.util.List;
import java.util.Optional;

//import org.springframework.stereotype.Service;

import com.example.entities.CostMaster;

public interface CostMasterService {
	
	void save(CostMaster ref);
	List<CostMaster> getAllCostMaster();
	void delete(int id);
	public Optional<CostMaster> getCostMastercostbyid(int id);
	Optional<CostMaster> getCostByPackid(int id);
}

