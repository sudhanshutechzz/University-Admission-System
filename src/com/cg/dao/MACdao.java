package com.cg.dao;

import java.util.List;

import com.cg.dto.Applicant;
import com.cg.dto.LogIn;

public interface MACdao {
	public String verifyUser(LogIn login);
	public List<Applicant> getApplicantsByCourseId(int CourseId);
	public String sheduleInterview(List<Applicant> applicant);
	public String updateStatus(int applicationId);
}
