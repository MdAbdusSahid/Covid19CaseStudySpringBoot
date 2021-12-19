package com.Covid19CaseStudyFinal.exception;

public class VaccinationCenterServiceException extends RuntimeException {
	
	private static final long serialVersionUID=1L;
	private String errormessage;
	
	public String getErrorMessage() {
		return errormessage;
	}
	
	public void setErrorMessage(String errormessage) {
		this.errormessage=errormessage;
	}
	
	public VaccinationCenterServiceException(String errormessage) {
		super();
		this.errormessage=errormessage;
	}

	@Override
	public String toString() {
		return "VaccinationCenterServiceException [errormessage=" + errormessage + "]";
	}
	
	public VaccinationCenterServiceException(){
		
		
	}

	
	
	
}
