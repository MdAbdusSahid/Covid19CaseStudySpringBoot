package com.Covid19CaseStudyFinal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Covid19CaseStudyFinal.entity.Admin;
import com.Covid19CaseStudyFinal.exception.AllException;
import com.Covid19CaseStudyFinal.repository.AdminRepository;



@Service("adminService")
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminRepository adminRepository;

	@Override
	public Admin insertAdmin(Admin admin) {
			return adminRepository.save(admin);
	}

	@Override
	public Admin updateAdmin(Admin admin) {
			return adminRepository.save(admin);
		
	}

	@Override
	public void deleteById(int id) {
		
			adminRepository.deleteById(id);
	}

	@Override
	public List<Admin> getAdmin() {
		List<Admin> list = adminRepository.findAll();
			return list;
	}

}
