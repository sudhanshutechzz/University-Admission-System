package com.cg.dao;

import java.util.List;

import com.cg.dto.Applicant;
import com.cg.dto.Courses;

public interface Applicantdao {
	public List<Courses> viewCourses();
	public Applicant applyForCourse(Applicant applicant);
	public Applicant viewStatus(int appId);
}
