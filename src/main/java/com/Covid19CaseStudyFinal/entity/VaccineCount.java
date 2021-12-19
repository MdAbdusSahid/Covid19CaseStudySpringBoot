package com.Covid19CaseStudyFinal.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class VaccineCount {
	@Id
	private int quantity;
	private int price;
	//@OneToOne(cascade = CascadeType.ALL)
	//private Vaccine vaccine;

	public VaccineCount() {
		super();
	}

//	@Override
//	public String toString() {
//		return "VaccineCount [vaccine=" + vaccine + ", quantity=" + quantity + ", price=" + price + "]";
//	}

	public VaccineCount( int quantity, int price) {
		super();
		//this.vaccine = vaccine;
		this.quantity = quantity;
		this.price = price;
	}

//	public Vaccine getVaccine() {
//		return vaccine;
//	}
//
//	public void setVaccine(Vaccine vaccine) {
//		this.vaccine = vaccine;
//	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(int quality) {
		this.quantity = quality;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = (int) price;
	}
}
