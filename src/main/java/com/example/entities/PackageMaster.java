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
@Table(name="Packages")
public class PackageMaster {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="packageId")
	private int packageId;
	
	@Column(name="packageName")
	private String packageName;
	
	@Column(name="packageimgpath")
	private String packageimgpath;
	
	
	@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "packageId", referencedColumnName = "packageId")
    private Set<DateMaster> dates;


	public PackageMaster(int packageId, String packageName, String packageimgpath, Set<DateMaster> dates) {
		super();
		this.packageId = packageId;
		this.packageName = packageName;
		this.packageimgpath = packageimgpath;
		this.dates = dates;
	}


	public PackageMaster() {
		super();
	}


	public int getPackageId() {
		return packageId;
	}


	public void setPackageId(int packageId) {
		this.packageId = packageId;
	}


	public String getPackageName() {
		return packageName;
	}


	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}


	public String getPackageimgpath() {
		return packageimgpath;
	}


	public void setPackageimgpath(String packageimgpath) {
		this.packageimgpath = packageimgpath;
	}


	public Set<DateMaster> getDates() {
		return dates;
	}


	public void setDates(Set<DateMaster> dates) {
		this.dates = dates;
	}

	

}
