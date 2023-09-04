package com.example.services;

import java.util.List;


import com.example.entities.Iternary;

public interface IternaryService {
	
	Iternary addIternary(Iternary iternary);
	List<Iternary> getIternary();
	List<Iternary> getIternaryById(int packid);
//    Iternary getIternaryByDay(String Day);
    //Iternary updateIternary(Long iternaryId, Iternary iternary);
    void deleteIternary(int iternaryId);

}
