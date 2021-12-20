package com.Covid19CaseStudyFinal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.Covid19CaseStudyFinal.entity.VaccineRegistration;
import com.Covid19CaseStudyFinal.exception.ServiceBookingException;
import com.Covid19CaseStudyFinal.repository.VaccineRegistrationRepository;

@Service("vaccineRegistrationService")
public class VaccineRegistrationServiceImpl implements VaccineRegistrationService{

	@Autowired
	public VaccineRegistrationRepository vaccineRegistrationRepository;
	
	@Override
	@ExceptionHandler
	public VaccineRegistration addVaccineRegistration(VaccineRegistration reg) {
		try {
			return  vaccineRegistrationRepository.save(reg);
		}
			catch (IllegalArgumentException e) {
				throw new ServiceBookingException("Given registration Id is empty,please check");
			}
		catch(Exception e) {
			
		throw new ServiceBookingException("Gas Booking Id cannot be null or zero");
		}
	}
	
	@Override
	public VaccineRegistration updateVaccineRegistration(VaccineRegistration reg) {
		try {
		return  vaccineRegistrationRepository.save(reg);
		}
		catch (IllegalArgumentException e) {
			throw new ServiceBookingException("Given registration Id is empty,please check");
		}
		catch(java.util.NoSuchElementException e) {
			throw new ServiceBookingException("Given registration Id is doesn't exit in database"+ e.getMessage());
		}
		
		
	}
	

	@Override
	public VaccineRegistration getVaccineRegistration(long mobileno) {
		
		return vaccineRegistrationRepository.findById(mobileno).get();
	}
	@Override

	public VaccineRegistration getAllMember(long mobileno) {
		return vaccineRegistrationRepository.findById(mobileno).get();
		
	}

	@Override
	public List<VaccineRegistration> getAllVaccineRegistrations() {
		return vaccineRegistrationRepository.findAll();
		 
		
	}

	@Override
	public void deleteVaccineRegistration(long mobileno) {
		vaccineRegistrationRepository.deleteById(mobileno);;
		
	}

}
