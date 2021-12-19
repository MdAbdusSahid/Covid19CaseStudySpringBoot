package com.Covid19CaseStudyFinal.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "vaccination_appointment")
public class Appointment {

	@Id
	@Column(name = "Booking_Id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long bookingid;
	@Column(name = "Mobile_Number")
	private long mobileno;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	@Column(name = "Date_Of_Booking")
	private LocalDate dateofbooking;



	@Enumerated(EnumType.STRING)
	private Slot slot;

	public Appointment(long bookingid, long mobileno, LocalDate dateofbooking, Slot slot) {
		super();
		this.bookingid = bookingid;
		this.mobileno = mobileno;
		this.dateofbooking = dateofbooking;
		this.slot = slot;
	}

	public Appointment() {
		super();
	}

	public long getBookingid() {
		return bookingid;
	}

	public void setBookingid(long bookingid) {
		this.bookingid = bookingid;
	}

	public long getMobileno() {
		return mobileno;
	}

	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}

	public LocalDate getDateofbooking() {
		return dateofbooking;
	}

	public void setDateofbooking(LocalDate dateofbooking) {
		this.dateofbooking = dateofbooking;
	}

	

	public Slot getSlot() {
		return slot;
	}

	public void setSlot(Slot slot) {
		this.slot = slot;
	}

}
