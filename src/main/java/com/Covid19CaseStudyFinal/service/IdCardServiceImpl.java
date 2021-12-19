package com.Covid19CaseStudyFinal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Covid19CaseStudyFinal.entity.IdCard;
import com.Covid19CaseStudyFinal.repository.IdCardRepository;

@Service
public class IdCardServiceImpl implements IdCardServiceItf {

	@Autowired
	public IdCardRepository idCardRepository;

	@Override
	public IdCard addIdCard(IdCard idcard) {
		return idCardRepository.save(idcard);

	}

	public IdCard getPanCardByNumber(int panNo) {
		return idCardRepository.getById(panNo);

	}

	public IdCard getAdharCardByNo(int adharno) {
		return idCardRepository.getById(adharno);

	}

	@Override
	public IdCard updateIdCard(IdCard idcard) {
		return idCardRepository.save(idcard);
	}

	public List<IdCard> getAllIdCard() {
		return idCardRepository.findAll();

	}

	@Override
	public void deleteIdCard(int id) {
		idCardRepository.deleteById(id);

	}

	@Override
	public IdCard getIdCardById(int id) {
			return idCardRepository.findById(id).get();
	}

}
