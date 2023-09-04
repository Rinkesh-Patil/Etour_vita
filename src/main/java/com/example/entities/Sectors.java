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
 
 @Column(name="sectorinfo",length=1000)
 private String sectorinfo;
 
 @OneToMany(cascade = CascadeType.ALL)
 @JoinColumn(name = "sectorId", referencedColumnName="sectorId")
 private Set<SubSector> subsector;

public int getSectorId() {
	return sectorId;
}

public void setSectorId(int sectorId) {
	this.sectorId = sectorId;
}

public String getSectorName() {
	return sectorName;
}

public void setSectorName(String sectorName) {
	this.sectorName = sectorName;
}

public String getSectorImgPath() {
	return sectorImgPath;
}

public void setSectorImgPath(String sectorImgPath) {
	this.sectorImgPath = sectorImgPath;
}

public String getSectorinfo() {
	return sectorinfo;
}

public void setSectorinfo(String sectorinfo) {
	this.sectorinfo = sectorinfo;
}

public Set<SubSector> getSubsector() {
	return subsector;
}

public void setSubsector(Set<SubSector> subsector) {
	this.subsector = subsector;
}

public Sectors(int sectorId, String sectorName, String sectorImgPath, String sectorinfo, Set<SubSector> subsector) {
	super();
	this.sectorId = sectorId;
	this.sectorName = sectorName;
	this.sectorImgPath = sectorImgPath;
	this.sectorinfo = sectorinfo;
	this.subsector = subsector;
}

public Sectors() {
	super();
}
 
  
}
