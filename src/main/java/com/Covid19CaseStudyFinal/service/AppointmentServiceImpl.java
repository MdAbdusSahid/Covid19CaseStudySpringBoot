package com.Covid19CaseStudyFinal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Covid19CaseStudyFinal.entity.Appointment;
//import com.Covid19CaseStudyFinal.exception.BookingException;
import com.Covid19CaseStudyFinal.repository.AppointmentRepository;

@Service("appointmentService")
public class AppointmentServiceImpl implements AppointmentService {

	@Autowired
	private AppointmentRepository appointmentRepository;
	
	@Override
	public Appointment addAppointment(Appointment app) {
		return appointmentRepository.save(app);
	}

	@Override
	public Appointment updateAppointment(Appointment app) {
		return appointmentRepository.save(app);
	}

	@Override
	public void deleteAppointment(long bookingid) {
		appointmentRepository.deleteById(bookingid);
	}

	@Override
	public Appointment getAppointment(long bookingid) {
		return appointmentRepository.findById(bookingid).get();
	}
	
	@Override
	public List<Appointment> getAllAppointment() {
		return appointmentRepository.findAll();
	}
}
