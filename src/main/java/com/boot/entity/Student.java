package com.boot.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Student {
       @Id
       @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;
	
	private String name;
	 
	private String city;
	
	private int mark;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name= "Address")
	List<Address> adrs;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public List<Address> getAdrs() {
		return adrs;
	}

	public void setAdrs(List<Address> adrs) {
		this.adrs = adrs;
	}
	
	
	
	
	
	
	
	
	
	
	
}
