package com.example.services;

import java.util.List;


import com.example.entities.SubSector;

public interface SubSectorService {

	    void saveSubSector(SubSector subSector);
	    List<SubSector> getSubSectorsById(int subSectorId);
	    List<SubSector> getAllSubSectors();
	    void deleteSubSector(int subSectorId);
}
