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

import com.Covid19CaseStudyFinal.entity.VaccineInventory;
import com.Covid19CaseStudyFinal.service.VaccineInventoryService;
@RestController
@RequestMapping(value="/inventory")
public class VaccineInventoryController {
	
	@Autowired
	private VaccineInventoryService vaccineInventoryService;

	@PostMapping("/add")
	public VaccineInventory addVaccineInventory(@RequestBody VaccineInventory vaccineInventory) {
		return vaccineInventoryService.addVaccineInventory(vaccineInventory);


	}

	@PutMapping("/update")
	public VaccineInventory updateVaccineInventory(@RequestBody VaccineInventory vaccineInventory) {
	return vaccineInventoryService.updateVaccineInventory(vaccineInventory);


	}
	@DeleteMapping("/delete/{id}")
	public void deleteVaccineInventory(@PathVariable int id) {
	vaccineInventoryService.deleteVaccineInventory(id);


	}
	@GetMapping("/vaccineInventory/{id}")
	public VaccineInventory getVaccineInventoryByCenter(@PathVariable int id) {
	return vaccineInventoryService.getVaccineInventoryByCenter(id);

	}
	@GetMapping("/vaccineInventory")
	public List<VaccineInventory> getAllVaccineInventory(){
	return vaccineInventoryService.getAllVaccineInventory();
	}

}
