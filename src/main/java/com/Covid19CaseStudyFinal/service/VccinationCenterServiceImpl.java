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
		if (center.getCode() == 0 || center.getCentername().isBlank() || center.getAddress().isBlank()
				|| center.getCity().isBlank() || center.getState().isBlank() || center.getPincode().isBlank()) {
			throw new VaccinationCenterServiceException("Please mention all details:");
		}
		try {
			return vaccinationcenterrepository.save(center);
		} catch (IllegalArgumentException e) {
			throw new VaccinationCenterServiceException("Please enter proper details: " + e.getMessage());
		} catch (Exception e) {
			throw new VaccinationCenterServiceException("Something is wrong center not added: " + e.getMessage());
		}
	}

	@Override
	public VaccinationCenter updateVaccineCenter(VaccinationCenter center) {
		if (center.getCode() == 0 || center.getCentername().isBlank() || center.getAddress().isBlank()
				|| center.getCity().isBlank() || center.getState().isBlank() || center.getPincode().isBlank()) {
			throw new VaccinationCenterServiceException("Please mention all details:");
		}
		try {
			return vaccinationcenterrepository.save(center);
		} catch (IllegalArgumentException e) {
			throw new VaccinationCenterServiceException("Please enter proper details: " + e.getMessage());
		} catch (Exception e) {
			throw new VaccinationCenterServiceException("Something is wrong center not update: " + e.getMessage());
		}
	}

	public void deleteVaccineCenter(int code) {
		if (code == 0) {
			throw new VaccinationCenterServiceException("Please mention all details:");
		}
		try {
			vaccinationcenterrepository.deleteById(code);
		} catch (IllegalArgumentException e) {
			throw new VaccinationCenterServiceException("Please enter proper details: " + e.getMessage());
		} catch (Exception e) {
			throw new VaccinationCenterServiceException("Something is wrong center not delete: " + e.getMessage());
		}
	}

	@Override
	public VaccinationCenter getVaccineCenter(int code) {
		try {
			return vaccinationcenterrepository.findById(code).get();
		} catch (IllegalArgumentException e) {
			throw new VaccinationCenterServiceException("Please enter code: " + e.getMessage());
		} catch (Exception e) {
			throw new VaccinationCenterServiceException("Please enter valid code : " + e.getMessage());
		}
	}

	@Override
	public List<VaccinationCenter> getAllVaccineCenters() {

		try {
			return vaccinationcenterrepository.findAll();
		} catch (IllegalArgumentException e) {
			throw new VaccinationCenterServiceException("Something is wrong : " + e.getMessage());
		} catch (Exception e) {
			throw new VaccinationCenterServiceException("Sorry no center available : " + e.getMessage());
		}

	}

}
