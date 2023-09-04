package com.example.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.entities.Customers;

@Repository
@Transactional
public interface CustomerRepository extends JpaRepository<Customers, Integer> {

    @Modifying
    @Transactional
    @Query(value="UPDATE Customers c SET c.password = :pass WHERE c.customerId = :id",nativeQuery=true)
    void updateCustomerPass(@Param("pass") String pass, @Param("id") Integer id);

    @Modifying
    @Transactional
    @Query(value="UPDATE Customers c SET c.email = :email WHERE c.customerId = :id",nativeQuery=true)
    void updateCustomerEmail(@Param("email") String email, @Param("id") Integer id);

    @Modifying
    @Transactional
    @Query(value="UPDATE Customers c SET c.firstname = :fName WHERE c.customerId = :id", nativeQuery=true)
    void updateCustomerFirstName(@Param("fName") String firstName, @Param("id") Integer id);

    @Query(value="SELECT c.password FROM Customers c WHERE c.customerId = :id",nativeQuery=true)
    Optional<Customers> fetchCustomerpass(@Param("id") int id);

    @Query(value="SELECT c.mobile FROM Customers c WHERE c.customerId = :id", nativeQuery=true)
    Optional<Customers> fetchCustomerMobile(@Param("id") int id);
    
    @Query(value="SELECT * FROM Customers c WHERE c.mobile = :mob and c.password = :password", nativeQuery=true)
    Optional<Customers> getCustomerByMobileAndPassword(@Param("mob") String mobile, @Param("password") String password);

    
}