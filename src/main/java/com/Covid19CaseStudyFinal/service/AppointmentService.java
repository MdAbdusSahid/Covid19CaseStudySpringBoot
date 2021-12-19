package com.Covid19CaseStudyFinal.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.Covid19CaseStudyFinal.entity.Appointment;

@Component
public interface AppointmentService {

	public Appointment addAppointment(Appointment app);
	public Appointment updateAppointment(Appointment app);
	public void deleteAppointment(long bookingid);
	public Appointment getAppointment(long bookingid);
	public List<Appointment> getAllAppointment();
}
