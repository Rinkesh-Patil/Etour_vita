package com.example.repositories;




import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.entities.Passengers;
@Repository
@Transactional
public interface PassengersRepository extends JpaRepository<Passengers, Integer>{

	
	@Query(value="select * from passengers where customerid = :id",nativeQuery = true)
	public Optional<Passengers> getinfo(@Param("id") int id);
     
	
	@Query(value = "SELECT mobile,password FROM customers WHERE mobile = :mobile AND password = :password", nativeQuery = true)
	List<String> findByuserName(@Param("mobile") String mobile, @Param("password") String password);
}
