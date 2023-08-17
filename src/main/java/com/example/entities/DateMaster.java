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

}
