package com.cg.service;

import java.time.LocalDate;

public class AdminServiceImpl implements AdminService {

	@Override
	public boolean verifyUser(String username, String Password, String role) {
		
		return false;
	}

	@Override
	public String addCourse(String ProgramName, String description, String applicant_eligibility, int duration,
			String degree_certificate_offered) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteCourse(String ProgramName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String addSchedule(String Scheduled_program_id, String ProgramName, String Location, LocalDate start_date,
			LocalDate end_date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteSchedule(String Scheduled_program_id) {
		// TODO Auto-generated method stub
		return null;
	}

}
