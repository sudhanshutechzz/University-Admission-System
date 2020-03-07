package com.cg.dao;

import com.cg.dto.Courses;
import com.cg.dto.LogIn;
import com.cg.dto.Schedule;

public interface Admindao {
	public String verifyUser(LogIn login);
	public String addCourse(Courses course);
	public String deleteCourse(String ProgramName);
	public String addSchedule(Schedule schedule);
	public String deleteSchedule(String Scheduled_program_id);
}
