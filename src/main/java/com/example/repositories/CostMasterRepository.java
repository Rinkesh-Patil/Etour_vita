package com.example.repositories;

//import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.entities.CostMaster;
//import com.example.entities.Iternary;

@Repository
@Transactional
public interface CostMasterRepository extends JpaRepository<CostMaster, Integer> {
	
	
    @Modifying
    @Transactional
    @Query("SELECT cm FROM CostMaster cm WHERE cm.costId = :id")
    Optional<CostMaster> fetchCost(@Param("id") int id);

    @Query(value="select * from cost_master where packageid = :id",nativeQuery = true)
	Optional<CostMaster> findByPackageId(@Param("id") int id);

    
 

}

