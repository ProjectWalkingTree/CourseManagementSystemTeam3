package com.springrest.course.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.course.dao.CourseDao;
import com.springrest.course.pojo.Course;

@Service
public class CourseServiceImplement implements CourseService 
{
	
	@Autowired
	private CourseDao courseDao;

	@Override
	public List<Course> getCourses() 
	{
		
		return courseDao.findAll();
	}

	@Override
	public Course addCourse(Course course) 
	{
		return courseDao.save(course);
		
	}

	@Override
	public Course updateCourse(Course course) 
	{
		
		return courseDao.save(course);
	}

	
	@Override
	public Course getCourse(long courseId) 
	{
		
		return courseDao.getById(courseId);
	}

	
	@Override
	public Course deleteCourse(long courseId) 
	{
		Course del=courseDao.getById(courseId);
	    courseDao.delete(del);
		return del;
		
	}

}