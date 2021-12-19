package com.Covid19CaseStudyFinal.exception;

public class ExceptionClass extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String errormessage;

	public ExceptionClass() {
		super();
	}

	public String getErrormessage() {
		return errormessage;
	}

	public void setErrormessage(String errormessage) {
		this.errormessage = errormessage;
	}

	public ExceptionClass(String errormessage) {
		super();
		this.errormessage = errormessage;
	}

}
