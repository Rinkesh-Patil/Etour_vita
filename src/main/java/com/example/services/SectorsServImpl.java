package com.example.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Sectors;
import com.example.repositories.SectorsRepository;
@Service
public class SectorsServImpl implements SectorService{
	@Autowired
	SectorsRepository srep;
	
	@Override
	public List<Sectors> getSector() {
		return srep.findAll();
	}

	@Override
	public Sectors addSector(Sectors sect) {
		
		return srep.save(sect);
	}

	@Override
	public Optional<Sectors> getById(int id) {
		return srep.findById(id);
		
	}

	@Override
	public void remove(int id) {
		srep.deleteById(id);
		
	}

}
