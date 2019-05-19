package com.lab.listinghome.model;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class House {
	
	@Id
	private int aid;
	private String username;
	private String city;
	private String address;
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "House [aid=" + aid + ",username=" + username +",city="+ city +",address="+ address +"]";
	}
	
}
