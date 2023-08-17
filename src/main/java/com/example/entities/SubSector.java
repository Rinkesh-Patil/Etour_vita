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
@Table(name="SubSector")
public class SubSector {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="subSectorId")
    private int subSectorId;
	
	@Column(name="subSectorName")
    private String subSectorName;
	
	@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "subSectorId", referencedColumnName = "subSectorId")
    private Set<PackageMaster> packages;
    
}
