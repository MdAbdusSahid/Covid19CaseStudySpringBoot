package com.Covid19CaseStudyFinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Covid19CaseStudyFinal.entity.Vaccine;


@Repository
public interface VaccineRepository extends JpaRepository<Vaccine, Integer> {

}
