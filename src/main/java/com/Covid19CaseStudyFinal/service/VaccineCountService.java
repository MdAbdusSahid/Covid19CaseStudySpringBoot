package com.Covid19CaseStudyFinal.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.Covid19CaseStudyFinal.entity.VaccineCount;

@Component
public interface VaccineCountService {

	public VaccineCount addVaccineCount(VaccineCount vaccineCount);

	public List<VaccineCount> getAllVaccine();

	public VaccineCount getQuantity(Integer quantity);

	public VaccineCount getPrice(Integer price);

}