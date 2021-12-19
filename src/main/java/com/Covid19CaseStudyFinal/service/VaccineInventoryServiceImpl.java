package com.Covid19CaseStudyFinal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.Covid19CaseStudyFinal.entity.VaccineInventory;
import com.Covid19CaseStudyFinal.exception.VaccineInventoryException;
import com.Covid19CaseStudyFinal.repository.VaccineInventoryRepository;

@Service("vaccineInventoryService")
public class VaccineInventoryServiceImpl implements VaccineInventoryService {
	@Autowired
	private VaccineInventoryRepository vaccineInventoryRepository;

	@Override
	public VaccineInventory updateVaccineInventory(VaccineInventory inv) {

		return vaccineInventoryRepository.save(inv);

	}

	@Override
	public void deleteVaccineInventory(int id) {
		vaccineInventoryRepository.deleteById(id);

	}

	@Override
	public VaccineInventory getVaccineInventoryByCenter(int id) {
		return vaccineInventoryRepository.findById(id).get();

	}

	@Override
	public List<VaccineInventory> getAllVaccineInventory() {
		return vaccineInventoryRepository.findAll();

	}

	@Override
	public VaccineInventory addVaccineInventory(VaccineInventory inv) {
		return vaccineInventoryRepository.save(inv);
	}

}
