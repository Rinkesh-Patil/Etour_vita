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
	
	@Column(name="subsectorinfo",length=1000)
	private String subsectorinfo;
	
	@Column(name="subsectorImgPath")
	 private String subsectorImgPath;
	
	@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "subSectorId", referencedColumnName = "subSectorId")
    private Set<PackageMaster> packages;

	public SubSector(int subSectorId, String subSectorName, String subsectorinfo, String subsectorImgPath,
			Set<PackageMaster> packages) {
		super();
		this.subSectorId = subSectorId;
		this.subSectorName = subSectorName;
		this.subsectorinfo = subsectorinfo;
		this.subsectorImgPath = subsectorImgPath;
		this.packages = packages;
	}

	public int getSubSectorId() {
		return subSectorId;
	}

	public void setSubSectorId(int subSectorId) {
		this.subSectorId = subSectorId;
	}

	public String getSubSectorName() {
		return subSectorName;
	}

	public void setSubSectorName(String subSectorName) {
		this.subSectorName = subSectorName;
	}

	public String getSubsectorinfo() {
		return subsectorinfo;
	}

	public void setSubsectorinfo(String subsectorinfo) {
		this.subsectorinfo = subsectorinfo;
	}

	public String getSubsectorImgPath() {
		return subsectorImgPath;
	}

	public void setSubsectorImgPath(String subsectorImgPath) {
		this.subsectorImgPath = subsectorImgPath;
	}

	public Set<PackageMaster> getPackages() {
		return packages;
	}

	public void setPackages(Set<PackageMaster> packages) {
		this.packages = packages;
	}

	public SubSector() {
		super();
	}
	
	
    
}
