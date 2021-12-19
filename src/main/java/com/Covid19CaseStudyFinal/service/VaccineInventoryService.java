package com.Covid19CaseStudyFinal.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.Covid19CaseStudyFinal.entity.VaccineInventory;

@Component
public interface VaccineInventoryService {

	
	public VaccineInventory updateVaccineInventory(VaccineInventory inv);

	public void deleteVaccineInventory(int id);

	public VaccineInventory getVaccineInventoryByCenter(int id);

	public List<VaccineInventory> getAllVaccineInventory();
	
	public VaccineInventory addVaccineInventory(VaccineInventory inv);
}