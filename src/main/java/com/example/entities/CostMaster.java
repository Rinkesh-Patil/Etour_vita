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
@Table(name="CostMaster")
public class CostMaster {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="costId")
	private int costId;
	
	@Column(name="subSectorId")
    private int subSectorId;
	
	@Column(name="cost")
	private double cost;
	
	@Column(name="singlePersonCost")
	private double singlePersonCost;
	
	@Column(name="extraPersonCost")
	private double extraPersonCost;
	
	@Column(name="childWithBed")
	private double childWithBed;
	
	@Column(name="validFrom")
	private String validFrom;
	
	@Column(name="validTo")
	private String validTo;

}
