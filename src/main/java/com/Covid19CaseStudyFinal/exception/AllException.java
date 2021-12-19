package com.Covid19CaseStudyFinal.exception;

import org.springframework.stereotype.Component;

@Component
public class AllException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String errorMessage;

	public AllException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public AllException() {

	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	@Override
	public String toString() {
		return "AdminException [errorMessage=" + errorMessage + "]";
	}

}
