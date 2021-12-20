package com.Covid19CaseStudyFinal.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.Covid19CaseStudyFinal.entity.VaccineRegistration;

@Component
public interface VaccineRegistrationService {
	
	public VaccineRegistration addVaccineRegistration (VaccineRegistration reg);
	
	public VaccineRegistration updateVaccineRegistration (VaccineRegistration reg);
	
	public void deleteVaccineRegistration (long mobileno);
	
	public VaccineRegistration getVaccineRegistration (long mobileno);
	
	public VaccineRegistration getAllMember(long mobileno);
	
	public List<VaccineRegistration> getAllVaccineRegistrations();

}