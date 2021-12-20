package com.Covid19CaseStudyFinal.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.Covid19CaseStudyFinal.entity.Member;

@Component
public interface MemberserviceItf {
	public Member addMember(Member member);

	public Member updateMember(Member member);

	public boolean deleteMember(int id);

	public Member getMemberById(int id);

	public Member getMemberByAdharNo(int adharNo);

	public Member getMemberByPanNo(int panNo);

	public List<Member> getAllMember();
}