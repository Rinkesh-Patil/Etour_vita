package com.example.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.entities.PackageMaster;
//import com.example.entities.SubSector;

import jakarta.transaction.Transactional;
@Repository
@Transactional
public interface PackageMasterRepository extends JpaRepository<PackageMaster, Integer> {
//	@Modifying
//	@Query("update  PackageMaster pm set pm.name = :name,e.email = :email, e.department=:department where e.id = :id")
//	void update(@Param("name") String name,@Param("email") String email,@Param("department") String department, @Param("id") int id);
	@Modifying
	@Query(value = "select * from packages where sub_sector_id= :subsectorid",nativeQuery = true)
	List<PackageMaster> findBySubSectorId(@Param("subsectorid") int id);
}
