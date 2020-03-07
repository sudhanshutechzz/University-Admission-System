package com.cg.service;

import java.time.LocalDate;
import java.util.List;

import com.cg.dto.Applicant;

public class MACServiceImpl implements MACService {
	public boolean verifyUser(String username,String Password,String role){
		return false;
	}

	@Override
	public List<Applicant> getApplicantsByCourseId(int CourseId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String sheduleInterview(List<Applicant> applicant) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateStatus(int applicationId) {
		// TODO Auto-generated method stub
		return null;
	}
}
