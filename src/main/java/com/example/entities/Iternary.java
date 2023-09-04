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
	
	@Column(name="description",length=2000)
	private String description;
	
	@Column(name="packageid")
	private int packageid;
	
	@Column(name="itrimgpath")
	private String itrimgpath;

	public Iternary(int iterneryid, String day, String description, int packageid, String itrimgpath) {
		super();
		this.iterneryid = iterneryid;
		this.day = day;
		this.description = description;
		this.packageid = packageid;
		this.itrimgpath = itrimgpath;
	}

	public Iternary() {
		super();
	}

	public int getIterneryid() {
		return iterneryid;
	}

	public void setIterneryid(int iterneryid) {
		this.iterneryid = iterneryid;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPackageid() {
		return packageid;
	}

	public void setPackageid(int packageid) {
		this.packageid = packageid;
	}

	public String getItrimgpath() {
		return itrimgpath;
	}

	public void setItrimgpath(String itrimgpath) {
		this.itrimgpath = itrimgpath;
	}

	
	
	
}
