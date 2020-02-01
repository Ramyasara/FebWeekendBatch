package org.test1.login;

public class CourseDetails 
{
	private void JavaCourse() 
	{
		System.out.println("Java Course 1 Started");
	}
	private void OracleCourse() 
	{
		System.out.println("Oracle Course not Started");

	}
	public static void main(String[] args) 
	{
		CourseDetails C = new CourseDetails();
		C.JavaCourse();
		C.OracleCourse();		
	}	
}
