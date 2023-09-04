package com.example.services;

import java.util.List;
import java.util.Optional;

import com.example.entities.Sectors;

public interface SectorService {
	public List<Sectors> getSector();
	public Sectors addSector(Sectors sect);
	public Optional<Sectors> getById(int id);
	public void remove(int id);
	
}
