package com.Covid19CaseStudyFinal.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Member {
	@Id
	private int id;

	public Member() {
		super();
// TODO Auto-generated constructor stub
	}

	private boolean dose1status;
	private boolean dose2status;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private LocalDate dose1date;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private LocalDate dose2date;

//private Vaccine vaccine;
	@OneToOne(cascade = CascadeType.ALL)
	private IdCard idCard;

	public Member(int id, boolean dose1status, boolean dose2status, LocalDate dose1date, LocalDate dose2date,
			IdCard idCard) {
		super();
		this.id = id;
		this.dose1status = dose1status;
		this.dose2status = dose2status;
		this.dose1date = dose1date;
		this.dose2date = dose2date;
		this.idCard = idCard;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isDose1status() {
		return dose1status;
	}

	public void setDose1status(boolean dose1status) {
		this.dose1status = dose1status;
	}

	public boolean isDose2status() {
		return dose2status;
	}

	public void setDose2status(boolean dose2status) {
		this.dose2status = dose2status;
	}

	public LocalDate getDose1date() {
		return dose1date;
	}

	public void setDose1date(LocalDate dose1date) {
		this.dose1date = dose1date;
	}

	public LocalDate getDose2date() {
		return dose2date;
	}

	public void setDose2date(LocalDate dose2date) {
		this.dose2date = dose2date;
	}

	public IdCard getIdCard() {
		return idCard;
	}

	public void setIdCard(IdCard idCard) {
		this.idCard = idCard;
	}

}