package com.Covid19CaseStudyFinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Covid19CaseStudyFinal.entity.VaccinationCenter;

@Repository
public interface VaccinationCenterRepository extends JpaRepository<VaccinationCenter, Integer> {

	/*
	 * public VaccinationCenter addVaccineCenter(VaccinationCenter center); public
	 * VaccinationCenter updateVaccineCenter(VaccinationCenter center); public
	 * boolean deleteVaccineCenter(VaccinationCenter center); public
	 * VaccinationCenter getVaccineCenter(int centerid); public
	 * List<VaccinationCenter> getAllVaccineCenters();
	 */

}
