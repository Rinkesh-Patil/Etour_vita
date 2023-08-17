package com.example.entities;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Bookings")
public class Bookings {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="bookingid")
	private int bookingid;
	
	@Column(name="Bookingdate")
	private String bookingdate;
	
	@Column(name="customerid")
	private int customerid;
	
	@Column(name="packageid")
	private int packageid;
	
	@Column(name="Passangers")
	private int totalpassanger;
	
	@Column(name="Touramount")
	private double totalcost;
	
	@Column(name="Taxes") 
	private double totalgstcost;
	
	@Column(name="Totalamount")
	private double totalfinalcost; 
	
	@Column(name="Flag")
	private int flag;
	 
	 @OneToMany(cascade = CascadeType.ALL)
	    @JoinColumn(name = "booking_id", referencedColumnName = "bookingid")
	    private Set<Passengers> passengers;

}
