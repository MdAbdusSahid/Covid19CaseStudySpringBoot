package com.Covid19CaseStudyFinal.exception;

import org.springframework.stereotype.Component;

@Component
public class VaccineInventoryException extends RuntimeException{
	
	private String errorMessage;
	private static final long serialVersionUID = 1L;
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public VaccineInventoryException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}
	public VaccineInventoryException() {
		super();
		
	}
	
	

}
