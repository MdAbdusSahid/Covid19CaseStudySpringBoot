package com.Covid19CaseStudyFinal.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="vaccine_registration")

public class VaccineRegistration {
	

	@Id
	private long mobileno;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private LocalDate dateofregistration;
	
	
	public VaccineRegistration() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public VaccineRegistration(long mobileno, LocalDate dateofregistration) {
		super();
		this.mobileno = mobileno;
		this.dateofregistration = dateofregistration;
	}
	

	public long getMobileno() {
		return mobileno;
	}
	
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public LocalDate getDateofregistration() {
		return dateofregistration;
	}
	public void setDateofregistration(LocalDate dateofregistration) {
		this.dateofregistration = dateofregistration;
	}
	
	}

