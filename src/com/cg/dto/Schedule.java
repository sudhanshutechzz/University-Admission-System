package com.cg.dto;

import java.time.LocalDate;

public class Schedule {
	private String Scheduled_program_id;
	private String ProgramName; 
	private String Location;
	private LocalDate start_date; 
	private LocalDate end_date ;
	private int sessions_per_week;
	public Schedule(){
		
	}
	public Schedule(String scheduled_program_id, String programName, String location, LocalDate start_date,
			LocalDate end_date, int sessions_per_week) {
		super();
		Scheduled_program_id = scheduled_program_id;
		ProgramName = programName;
		Location = location;
		this.start_date = start_date;
		this.end_date = end_date;
		this.sessions_per_week = sessions_per_week;
	}
	public String getScheduled_program_id() {
		return Scheduled_program_id;
	}
	public void setScheduled_program_id(String scheduled_program_id) {
		Scheduled_program_id = scheduled_program_id;
	}
	public String getProgramName() {
		return ProgramName;
	}
	public void setProgramName(String programName) {
		ProgramName = programName;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public LocalDate getStart_date() {
		return start_date;
	}
	public void setStart_date(LocalDate start_date) {
		this.start_date = start_date;
	}
	public LocalDate getEnd_date() {
		return end_date;
	}
	public void setEnd_date(LocalDate end_date) {
		this.end_date = end_date;
	}
	public int getSessions_per_week() {
		return sessions_per_week;
	}
	public void setSessions_per_week(int sessions_per_week) {
		this.sessions_per_week = sessions_per_week;
	}
	@Override
	public String toString() {
		return "CoursesSheduled [Scheduled_program_id=" + Scheduled_program_id + ", ProgramName=" + ProgramName
				+ ", Location=" + Location + ", start_date=" + start_date + ", end_date=" + end_date
				+ ", sessions_per_week=" + sessions_per_week + "]";
	}
	
}
