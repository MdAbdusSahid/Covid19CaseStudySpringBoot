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

import com.Covid19CaseStudyFinal.entity.Vaccine;
import com.Covid19CaseStudyFinal.service.VaccineService;



@RestController
@RequestMapping(value = "/vaccine")
public class VaccineController {
	@Autowired
	private VaccineService vaccineService;

	@PostMapping("/add")
	private Vaccine addVaccine(@RequestBody Vaccine vaccine) {
		return vaccineService.addVaccine(vaccine);

	}

	@PutMapping("/update")
	private Vaccine updateVaccine(@RequestBody Vaccine vaccine) {
		return vaccineService.updateVaccine(vaccine);

	}

	@DeleteMapping("/delete/{vaccineId}")
	private void deleteVaccine(@PathVariable Integer vaccineId) {
		vaccineService.deleteVaccineById(vaccineId);

	}

	@GetMapping("/vaccines")
	private List<Vaccine> getAllVaccine() {
		return vaccineService.getAllVaccine();
	}
	
		@GetMapping("/vaccines/{vaccineId}")
		private Vaccine findByVaccineId(@PathVariable Integer vaccineId) {
			return vaccineService.findByVaccineId(vaccineId);
	}
	

}
