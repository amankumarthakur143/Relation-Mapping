package com.boot.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int eid;
	private String name;
	private int age;
	private long mob;

	/*
	 * @OneToOne (cascade = CascadeType.ALL)
	 * 
	 * @JoinColumn(name = "Address") private Address addredd;
	 */
	private Address addredd;
	 
	public int getEid() { 
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public Address getAddredd() {
		return addredd;
	}
	public void setAddredd(Address addredd) {
		this.addredd = addredd;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getMob() {
		return mob;
	}
	public void setMob(long mob) {
		this.mob = mob;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", age=" + age + ", mob=" + mob + ", addredd=" + addredd
				+ "]";
	}
	
	
	
	
}
