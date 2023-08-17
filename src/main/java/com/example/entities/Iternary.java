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
@Table(name="Iternary")
public class Iternary {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="iterneryid")
	private int iterneryid;
	
	@Column(name="day")
	private String day;
	
	@Column(name="description")
	private String description;
	
	@Column(name="subSectorId")
	private String subSectorId;
}
