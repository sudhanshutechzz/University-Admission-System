package com.cg.service;

import java.time.LocalDate;

public interface AdminService {
	public boolean verifyUser(String username,String Password,String role);
	public String addCourse(String ProgramName,String description,String applicant_eligibility,int duration,String degree_certificate_offered);
	public String deleteCourse(String ProgramName);
	public String addSchedule(String Scheduled_program_id,String ProgramName, String Location,LocalDate start_date,  LocalDate end_date );
	public String deleteSchedule(String Scheduled_program_id);
}
