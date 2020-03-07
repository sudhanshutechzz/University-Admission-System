package com.cg.service;

import java.time.LocalDate;
import java.util.List;

import com.cg.dto.Applicant;

public interface MACService {
	public boolean verifyUser(String username,String Password,String role);
	public List<Applicant> getApplicantsByCourseId(int CourseId);
	public String sheduleInterview(List<Applicant> applicant);
	public String updateStatus(int applicationId);
	
}
