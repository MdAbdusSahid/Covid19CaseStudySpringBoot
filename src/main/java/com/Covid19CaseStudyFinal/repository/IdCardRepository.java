package com.Covid19CaseStudyFinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Covid19CaseStudyFinal.entity.IdCard;

@Repository
public interface IdCardRepository extends JpaRepository<IdCard, Integer> {

	//public IdCard addIdCard (IdCard idCard);
	//public IdCard getPanCardByNumber(String panNo);
	// IdCard getAdharCardByNo(long adharno);
}
