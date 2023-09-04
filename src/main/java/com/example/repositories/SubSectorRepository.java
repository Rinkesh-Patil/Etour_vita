package com.example.repositories;
//import java.util.List;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.entities.SubSector;

@Repository
@Transactional
public interface SubSectorRepository extends JpaRepository<SubSector, Integer> {
	
	@Modifying
	@Query(value = "select * from sub_sector where sector_id= :sectorid",nativeQuery = true)
	List<SubSector> findBySubSectorId(@Param("sectorid") int id);
	
	

}
