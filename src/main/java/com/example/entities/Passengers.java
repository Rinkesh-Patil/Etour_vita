package com.example.entities;

import java.util.Date;

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
@Table(name="Passengers")
public class Passengers {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="paxId")
	private int paxId;
	
	@Column(name="paxName")
	private String paxName;
	
	@Column(name="paxBirthdate")
	private Date paxBirthdate;
	
	@Column(name="paxType")
	private String paxType;
	
	@Column(name="paxAmount")
	private Double paxAmount;
	
	@Column(name="packageid")
	private int packageid;
	
	@Column(name="customerid")
	private int customerid;

	public int getPaxId() {
		return paxId;
	}

	public void setPaxId(int paxId) {
		this.paxId = paxId;
	}

	public String getPaxName() {
		return paxName;
	}

	public void setPaxName(String paxName) {
		this.paxName = paxName;
	}

	public Date getPaxBirthdate() {
		return paxBirthdate;
	}

	public void setPaxBirthdate(Date paxBirthdate) {
		this.paxBirthdate = paxBirthdate;
	}

	public String getPaxType() {
		return paxType;
	}

	public void setPaxType(String paxType) {
		this.paxType = paxType;
	}

	public Double getPaxAmount() {
		return paxAmount;
	}

	public void setPaxAmount(Double paxAmount) {
		this.paxAmount = paxAmount;
	}

	public int getPackageid() {
		return packageid;
	}

	public void setPackageid(int packageid) {
		this.packageid = packageid;
	}

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public Passengers(int paxId, String paxName, Date paxBirthdate, String paxType, Double paxAmount, int packageid,
			int customerid) {
		super();
		this.paxId = paxId;
		this.paxName = paxName;
		this.paxBirthdate = paxBirthdate;
		this.paxType = paxType;
		this.paxAmount = paxAmount;
		this.packageid = packageid;
		this.customerid = customerid;
	}

	public Passengers() {
		super();
	}

	
}
