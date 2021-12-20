package com.Covid19CaseStudyFinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Covid19CaseStudyFinal.entity.IdCard;
import com.Covid19CaseStudyFinal.service.IdCardServiceItf;

@RestController
@RequestMapping(value = "/search")
public class IdCardController {

	@Autowired
	private IdCardServiceItf idCardServiceItf;

	@PostMapping("/add")
	public IdCard addIdCard(@RequestBody IdCard idCard) {
		return idCardServiceItf.addIdCard(idCard);
	}

	@PutMapping("/update")
	public IdCard updateIdCard(@RequestBody IdCard idCard) {
		return idCardServiceItf.updateIdCard(idCard);
	}

	@GetMapping("/all")
	public List<IdCard> getAllIdCard() {
		return idCardServiceItf.getAllIdCard();
	}

//	@GetMapping("/add/panCard/{panNo}")
//	public IdCard getPanCardByNumber(@PathVariable int panNo) {
//		return idCardServiceItf.getPanCardByNumber(panNo);
//	}
//
//	@GetMapping("/add/adharCard/{adharNo}")
//	public IdCard getAdharCardByNumber(@PathVariable int adharNo) {
//		return idCardServiceItf.getAdharCardByNo(adharNo);
//
//	}

	@DeleteMapping("/delete/{id}")
	public void deleteIdCard(@PathVariable int id) {
		idCardServiceItf.deleteIdCard(id);
	}
	@GetMapping("/get/{id}")
	public IdCard getIdCardById(@PathVariable int id) {
	return idCardServiceItf.getIdCardById(id);
	}

}
