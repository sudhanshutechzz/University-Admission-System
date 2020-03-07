package com.cg.UI;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cg.service.ApplicantServiceImpl;
import com.cg.dto.Courses;
import com.cg.service.ApplicantService;

public class MainUI {
	public static void main(String args[])
	{
		ApplicantService appser=new ApplicantServiceImpl();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1. For Applicant");
		System.out.println("2. For MAC");
		System.out.println("3 For Admin");
		System.out.println("Enter the type of user");
		String user=sc.nextLine();
		switch(user)
		{
		case "Applicant":
		{
			List<Courses> list=appser.viewCourses();
			
			System.out.println(list);
			
			break;
		}
		}
	}

}
