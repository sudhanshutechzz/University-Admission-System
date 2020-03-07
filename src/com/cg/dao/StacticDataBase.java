package com.cg.dao;

import java.util.ArrayList;
import java.util.List;

import com.cg.dto.Applicant;
import com.cg.dto.Courses;
import com.cg.dto.LogIn;

public class StacticDataBase {
	private static List<Courses> courses=new ArrayList<Courses>();
	static List<Applicant> applicant=new ArrayList<Applicant>();
	static List<LogIn> login=new ArrayList<LogIn>();  
	public static List<Courses> getCourses() {
		return courses;
	}
	public static void setCourses(List<Courses> courses) {
		StacticDataBase.courses = courses;
	}
	public static List<Applicant> getApplicant() {
		return applicant;
	}
	public static void setApplicant(List<Applicant> applicant) {
		StacticDataBase.applicant = applicant;
	}
	public static List<LogIn> getLogin() {
		return login;
	}
	public static void setLogin(List<LogIn> login) {
		StacticDataBase.login = login;
	}
	static{
		courses.add(new Courses("MBA","It is for professionals","B.Tech",2,"MBA"));
		courses.add(new Courses("MBA","It is for professionals","B.Tech",2,"MBA"));
		courses.add(new Courses("MBA","It is for professionals","B.Tech",2,"MBA"));
	}
	static{
		login.add(new LogIn("surya","surya","MAC"));
		login.add(new LogIn("sudhanshu","sudhanshu","MAC"));
		login.add(new LogIn("prerak","prerak","admin"));
	}
	

	
}
