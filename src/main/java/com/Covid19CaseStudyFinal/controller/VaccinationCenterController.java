package com.Covid19CaseStudyFinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Covid19CaseStudyFinal.entity.VaccinationCenter;
import com.Covid19CaseStudyFinal.service.VaccinationCenterService;

@RestController
@RequestMapping("/abcd")
public class VaccinationCenterController {

	@Autowired
	private VaccinationCenterService service;

	@PostMapping("/add")
	public VaccinationCenter addVaccineCenter(@RequestBody VaccinationCenter center) {
		return service.addVaccineCenter(center);

	}

	@PutMapping("/update")
	public VaccinationCenter updateVaccineCenter(@RequestBody VaccinationCenter center) {
		return service.updateVaccineCenter(center);

	}

	@DeleteMapping("/delete/{code}")
	public void deleteVaccineCenter(@PathVariable int code) {
		service.deleteVaccineCenter(code);

	}

	@GetMapping("/centers")
	public List<VaccinationCenter> getAllVaccineCenters() {
		return service.getAllVaccineCenters();

	}

	@GetMapping("center/{code}")
	public VaccinationCenter getVaccineCenter(@PathVariable int code) {
		return service.getVaccineCenter(code);

	}

}
