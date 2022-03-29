package com.springrest.course.pojo;

import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class Course 
{ 
	@Id
	private long courseId;
	private String courseName;
	private String courseDescription;
	private long courseFee;
	
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
	public String getCourseDescription()
	{
		return courseDescription;
	}
	public void setCourseDescription(String courseDescription)
	{
		this.courseDescription = courseDescription;
	}
	public long getCourseFee() 
	{
		return courseFee;
	}
	public void setCourseFee(long courseFee) 
	{
		this.courseFee = courseFee;
	}
	public Course(long courseId, String courseName, String courseDescription, long courseFee) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseDescription = courseDescription;
		this.courseFee = courseFee;
	}
	public Course() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() 
	{
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", courseDescription="
				+ courseDescription + ", courseFee=" + courseFee + "]";
	}
	
	

}
