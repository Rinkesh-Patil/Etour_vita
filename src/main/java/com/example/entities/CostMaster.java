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
	
	@Column(name="packageid")
	private int packageid;
	
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

	public int getCostId() {
		return costId;
	}

	public void setCostId(int costId) {
		this.costId = costId;
	}

	public int getSubSectorId() {
		return subSectorId;
	}

	public void setSubSectorId(int subSectorId) {
		this.subSectorId = subSectorId;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getPackageid() {
		return packageid;
	}

	public void setPackageid(int packageid) {
		this.packageid = packageid;
	}

	public double getSinglePersonCost() {
		return singlePersonCost;
	}

	public void setSinglePersonCost(double singlePersonCost) {
		this.singlePersonCost = singlePersonCost;
	}

	public double getExtraPersonCost() {
		return extraPersonCost;
	}

	public void setExtraPersonCost(double extraPersonCost) {
		this.extraPersonCost = extraPersonCost;
	}

	public double getChildWithBed() {
		return childWithBed;
	}

	public void setChildWithBed(double childWithBed) {
		this.childWithBed = childWithBed;
	}

	public String getValidFrom() {
		return validFrom;
	}

	public void setValidFrom(String validFrom) {
		this.validFrom = validFrom;
	}

	public String getValidTo() {
		return validTo;
	}

	public void setValidTo(String validTo) {
		this.validTo = validTo;
	}

	public CostMaster(int costId, int subSectorId, double cost, int packageid, double singlePersonCost,
			double extraPersonCost, double childWithBed, String validFrom, String validTo) {
		super();
		this.costId = costId;
		this.subSectorId = subSectorId;
		this.cost = cost;
		this.packageid = packageid;
		this.singlePersonCost = singlePersonCost;
		this.extraPersonCost = extraPersonCost;
		this.childWithBed = childWithBed;
		this.validFrom = validFrom;
		this.validTo = validTo;
	}

	public CostMaster() {
		super();
	}
	

}
