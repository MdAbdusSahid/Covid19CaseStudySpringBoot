package com.Covid19CaseStudyFinal.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.Covid19CaseStudyFinal.entity.VaccinationCenter;

@Component
public interface VaccinationCenterService {
	public VaccinationCenter addVaccineCenter(VaccinationCenter center);
	public VaccinationCenter updateVaccineCenter(VaccinationCenter center);
	public void deleteVaccineCenter(int code);
	public VaccinationCenter getVaccineCenter(int code);
	public List<VaccinationCenter> getAllVaccineCenters();

}
