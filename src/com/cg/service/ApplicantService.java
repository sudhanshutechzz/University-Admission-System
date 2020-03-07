package com.cg.service;

import java.time.LocalDate;
import java.util.List;

import com.cg.dto.Applicant;
import com.cg.dto.Courses;

public interface ApplicantService {
	public List<Courses> viewCourses();
	public Applicant applyForCourse(String full_name,LocalDate date_of_birth,String highest_qualification,float marks_obtained,String goals,String email_id);
	public Applicant viewStatus(int appId);
}
