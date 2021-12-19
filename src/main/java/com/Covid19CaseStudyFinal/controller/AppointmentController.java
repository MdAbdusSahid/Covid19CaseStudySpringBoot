package com.Covid19CaseStudyFinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Covid19CaseStudyFinal.entity.Appointment;
//import com.Covid19CaseStudyFinal.exception.BookingException;
//import com.Covid19CaseStudyFinal.exception.ControllerBookingException;
import com.Covid19CaseStudyFinal.service.AppointmentService;

@RestController
@RequestMapping(value = "/appointment")
public class AppointmentController {

	@Autowired
	private AppointmentService appointmentService;
		
	@PostMapping("/add")
	public Appointment addAppointment(@RequestBody Appointment app) {
		return appointmentService.addAppointment(app);
	}
	
	@PutMapping("/update")
	public Appointment updateAppointment(@RequestBody Appointment app) {
		return appointmentService.updateAppointment(app);
	}
	
	@DeleteMapping("/delete/{bookingid}")
	public void deleteAppointment(@PathVariable long bookingid) {
		appointmentService.deleteAppointment(bookingid);
	}
	
	@GetMapping("/getappointment/{bookingid}")
	public Appointment getAppointment(@PathVariable long bookingid) {
		return appointmentService.getAppointment(bookingid);
	}
	
	@GetMapping("/allappointment")
	public List<Appointment> getAllAppointment() {
		return appointmentService.getAllAppointment();
	}
}
