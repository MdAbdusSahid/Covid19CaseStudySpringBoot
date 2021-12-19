package com.Covid19CaseStudyFinal.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Covid19CaseStudyFinal.entity.Vaccine;
import com.Covid19CaseStudyFinal.exception.AllException;
import com.Covid19CaseStudyFinal.repository.VaccineRepository;



@Service
public class VaccineServiceImpl implements VaccineService {

	@Autowired
	public VaccineRepository vaccineRepository;

	public Vaccine addVaccine(Vaccine vaccine) {
			return vaccineRepository.save(vaccine);
	}
	public Vaccine findByVaccineId(Integer vaccineId) {
		
			return vaccineRepository.findById(vaccineId).get();		
	}

	public Vaccine updateVaccine(Vaccine vaccine) {
		if (vaccine.getVaccineId() == 0 || vaccine.getVaccineName().isEmpty() || vaccine.getDescription().isEmpty()) {
			throw new AllException("Fill all the credential");
		}
		try {
			vaccine = vaccineRepository.save(vaccine);
			return vaccine;
		} catch (IllegalArgumentException e) {
			throw new AllException("Please give proper data" + e.getMessage());
		} catch (Exception e) {
			throw new AllException("Something went wrong" + e.getMessage());
		}
	}

	public void deleteVaccineById(Integer vaccineId) {
		try {
			vaccineRepository.deleteById(vaccineId);
		} catch (IllegalArgumentException e) {
			throw new AllException("Please give proper vaccine id" + e.getMessage());
		} catch (Exception e) {
			throw new AllException("invalid vaccine ID");
		}
	}

	@Override
	public List<Vaccine> getAllVaccine() {
		List<Vaccine> vaccine = new ArrayList<Vaccine>();
		vaccineRepository.findAll().forEach(vac -> vaccine.add(vac));
		return vaccine;
	}

}
