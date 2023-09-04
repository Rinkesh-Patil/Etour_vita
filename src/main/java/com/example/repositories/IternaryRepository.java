package com.example.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.entities.Iternary;
//import com.example.entities.SubSector;

public interface IternaryRepository extends JpaRepository<Iternary, Integer> {

	@Modifying
	@Query(value="select * from iternary where packageid = :id",nativeQuery = true)
	List<Iternary> findByPackageId(@Param("id") int id);
	
}
