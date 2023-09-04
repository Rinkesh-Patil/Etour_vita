package com.example.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name="Date")
public class DateMaster {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="DepartureId")
	private int DepartureId;
	
	@Column(name="departDate")
	private String departDate;
	
	@Column(name="endDate")
	private String endDate;
	
	@Column(name="noOfDays")
	private int noOfDays;

	public int getDepartureId() {
		return DepartureId;
	}

	public void setDepartureId(int departureId) {
		DepartureId = departureId;
	}

	public String getDepartDate() {
		return departDate;
	}

	public void setDepartDate(String departDate) {
		this.departDate = departDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public int getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}

	public DateMaster(int departureId, String departDate, String endDate, int noOfDays) {
		super();
		DepartureId = departureId;
		this.departDate = departDate;
		this.endDate = endDate;
		this.noOfDays = noOfDays;
	}

	public DateMaster() {
		super();
	}
	

}
