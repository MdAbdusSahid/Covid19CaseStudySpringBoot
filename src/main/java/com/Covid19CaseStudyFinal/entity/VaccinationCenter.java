package com.Covid19CaseStudyFinal.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class VaccinationCenter {
	
	
	@Id
	private int code;

	private String centername;
	private String address;
	private String city;
	private String state;
	private	String pincode;
	
		/*@OneToOne(cascade = CascadeType.ALL)
	private Appointment appointment;
	
	@OneToOne(cascade = CascadeType.ALL)
	private VaccineInventory vaccineInventory;*/
	
	public VaccinationCenter() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public VaccinationCenter(int code, String centername, String address, String city, String state, String pincode) {
		super();
		this.code = code;
		this.centername = centername;
		this.address = address;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		/*this.appointment=appointment;
		this.vaccineInventory=vaccineInventory;*/
	}
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getCentername() {
		return centername;
	}
	public void setCentername(String centername) {
		this.centername = centername;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	

		/*public Appointment getAppointment() {
		return appointment;
	}
	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}
	
	public VaccineInventory getVaccineInventory() {
		return vaccineInventory;
	}
	public void setVaccineInventory(VaccineInventory vaccineInventory) {
	this.vaccineInventory = vaccineInventory;
	}*/
	
	@Override
	public String toString() {
		return "VaccinationCenter [code=" + code + ", centername=" + centername + ", address=" + address + ", city="
				+ city + ", state=" + state + ", pincode=" + pincode + "]";
	}
	
	

}
