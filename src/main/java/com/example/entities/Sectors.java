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
@Table(name="Sectors")
public class Sectors {
	
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name="sectorId")
 private int sectorId ;
 
 @Column(name="sectorName")
 private String sectorName;
 
 @Column(name="sectorImgPath")
 private String sectorImgPath;
 
 @OneToMany(cascade = CascadeType.ALL)
 @JoinColumn(name = "sectorId", referencedColumnName="sectorId")
 private Set<SubSector> subsector;
  
}
