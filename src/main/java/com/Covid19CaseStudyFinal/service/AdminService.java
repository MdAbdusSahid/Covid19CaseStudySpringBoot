package com.Covid19CaseStudyFinal.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.Covid19CaseStudyFinal.entity.Admin;

@Component
public interface AdminService {

	public Admin insertAdmin(Admin admin);

	public Admin updateAdmin(Admin admin);

	public void deleteById(int id);

	public List<Admin> getAdmin();
}
