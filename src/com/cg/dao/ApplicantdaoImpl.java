package com.cg.dao;

import java.util.List;

import com.cg.dto.Applicant;
import com.cg.dto.Courses;

public class ApplicantdaoImpl implements Applicantdao {

	@Override
	public List<Courses> viewCourses() {
		
		return StacticDataBase.getCourses();
	}

	@Override
	public Applicant applyForCourse(Applicant applicant) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Applicant viewStatus(int appId) {
		// TODO Auto-generated method stub
		return null;
	}

}
