package com.example.services;

import java.util.List;
import java.util.Optional;

import com.example.entities.PackageMaster;
//import com.example.entities.SubSector;

public interface PackageMasterService {
	List<PackageMaster> getPackages();
	List<PackageMaster> getSubSectorsById(int subSectorId);
	Optional<PackageMaster> getPackages(int id);
	void delete(int id);
	void addPackages(PackageMaster p);
	void update(PackageMaster packages,int id);
	
	
}
