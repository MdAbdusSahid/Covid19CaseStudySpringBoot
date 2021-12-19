package com.Covid19CaseStudyFinal.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.Covid19CaseStudyFinal.entity.IdCard;

@Component
public interface IdCardServiceItf {
	public IdCard addIdCard (IdCard idcard);
	public IdCard updateIdCard(IdCard idcard);
	public void deleteIdCard(int id);
	public List<IdCard> getAllIdCard();
	public IdCard getPanCardByNumber(int panNo);
	public IdCard getAdharCardByNo(int adharno);
	public IdCard getIdCardById(int id);
}
