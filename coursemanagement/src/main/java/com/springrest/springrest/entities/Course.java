package com.springrest.springrest.entities;

import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class Course {
	@Id
	private long courseId;
	private String courseName;
	private String courseDesription;
	private String corseDuration;
	private int courseFee;
	
	public long getCourseId() 
	{
		return courseId;
	}
	
	public void setCourseId(long courseId) 
	{
		this.courseId = courseId;
	}
	
	public String getCourseName() 
	{
		return courseName;
	}
	
	public void setCourseName(String courseName) 
	{
		this.courseName = courseName;
	}
	
	public String getCourseDesription() 
	{
		return courseDesription;
	}
	
	public void setCourseDesription(String courseDesription)
	{
		this.courseDesription = courseDesription;
	}
	
	public String getCorseDuration() 
	{
		return corseDuration;
	}
	
	public void setCorseDuration(String corseDuration) 
	{
		this.corseDuration = corseDuration;
	}
	
	public int getCourseFee() 
	{
		return courseFee;
	}
	
	public void setCourseFee(int courseFee) 
	{
		this.courseFee = courseFee;
	}
	
	public Course(long courseId, String courseName, String courseDesription, String corseDuration, int courseFee) 
	{
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseDesription = courseDesription;
		this.corseDuration = corseDuration;
		this.courseFee = courseFee;
	}
	public Course() 
	{
		super();
		
	}
	@Override
	public String toString() 
	{
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", courseDesription=" + courseDesription
				+ ", corseDuration=" + corseDuration + ", courseFee=" + courseFee + "]";
	}

	public static Object add(Course itm) {
		// TODO Auto-generated method stub
		return ("okk");
	}

}
