package com.example.entities;

import java.util.Date;
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
	private Date bookingdate;
	
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

	public int getBookingid() {
		return bookingid;
	}

	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
	}

	public Date getBookingdate() {
		return bookingdate;
	}

	public void setBookingdate(Date bookingdate) {
		this.bookingdate = bookingdate;
	}

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public int getPackageid() {
		return packageid;
	}

	public void setPackageid(int packageid) {
		this.packageid = packageid;
	}

	public int getTotalpassanger() {
		return totalpassanger;
	}

	public void setTotalpassanger(int totalpassanger) {
		this.totalpassanger = totalpassanger;
	}

	public double getTotalcost() {
		return totalcost;
	}

	public void setTotalcost(double totalcost) {
		this.totalcost = totalcost;
	}

	public double getTotalgstcost() {
		return totalgstcost;
	}

	public void setTotalgstcost(double totalgstcost) {
		this.totalgstcost = totalgstcost;
	}

	public double getTotalfinalcost() {
		return totalfinalcost;
	}

	public void setTotalfinalcost(double totalfinalcost) {
		this.totalfinalcost = totalfinalcost;
	}

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public Set<Passengers> getPassengers() {
		return passengers;
	}

	public void setPassengers(Set<Passengers> passengers) {
		this.passengers = passengers;
	}

	public Bookings(int bookingid, Date bookingdate, int customerid, int packageid, int totalpassanger,
			double totalcost, double totalgstcost, double totalfinalcost, int flag, Set<Passengers> passengers) {
		super();
		this.bookingid = bookingid;
		this.bookingdate = bookingdate;
		this.customerid = customerid;
		this.packageid = packageid;
		this.totalpassanger = totalpassanger;
		this.totalcost = totalcost;
		this.totalgstcost = totalgstcost;
		this.totalfinalcost = totalfinalcost;
		this.flag = flag;
		this.passengers = passengers;
	}

	public Bookings() {
		super();
	}

	
	 

}
