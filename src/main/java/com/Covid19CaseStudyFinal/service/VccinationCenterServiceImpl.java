package com.Covid19CaseStudyFinal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Covid19CaseStudyFinal.entity.VaccinationCenter;
import com.Covid19CaseStudyFinal.exception.VaccinationCenterServiceException;
import com.Covid19CaseStudyFinal.repository.VaccinationCenterRepository;

@Service("vaccinationCenterService")
public class VccinationCenterServiceImpl implements VaccinationCenterService {

	@Autowired
	public VaccinationCenterRepository vaccinationcenterrepository;

	@Override
	public VaccinationCenter addVaccineCenter(VaccinationCenter center) {
		
	
			return vaccinationcenterrepository.save(center);
			}

	@Override
	public VaccinationCenter updateVaccineCenter(VaccinationCenter center) {
		
			return vaccinationcenterrepository.save(center);
		
	}

	public void deleteVaccineCenter(int code) {
		
			vaccinationcenterrepository.deleteById(code);
		
	}

	@Override
	public VaccinationCenter getVaccineCenter(int code) {
		
			return vaccinationcenterrepository.findById(code).get();
		
	}

	@Override
	public List<VaccinationCenter> getAllVaccineCenters() {

		
			return vaccinationcenterrepository.findAll();
		
	}

}
