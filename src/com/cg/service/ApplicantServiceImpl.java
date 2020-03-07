package com.cg.service;

import java.time.LocalDate;
import java.util.List;

import com.cg.dao.Applicantdao;
import com.cg.dao.ApplicantdaoImpl;
import com.cg.dto.Applicant;
import com.cg.dto.Courses;

public class ApplicantServiceImpl implements ApplicantService {
	Applicantdao adao=new ApplicantdaoImpl();
	@Override
	public List<Courses> viewCourses() {
		
		return adao.viewCourses();
	}

	@Override
	public Applicant applyForCourse(String full_name, LocalDate date_of_birth, String highest_qualification,
			float marks_obtained, String goals, String email_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Applicant viewStatus(int appId) {
		
		return null;
	}
	

}
