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
	

}
