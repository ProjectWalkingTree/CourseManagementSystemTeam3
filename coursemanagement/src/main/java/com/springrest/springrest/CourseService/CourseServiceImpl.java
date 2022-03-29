package com.springrest.springrest.CourseService;




import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.Dao.CourseDao;
import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService 
{
	@Autowired
	private CourseDao courseDao;
	
	public CourseServiceImpl()
	{
		
	}
	
	@Override
	public List<Course>getCourses()
	{
		
		return courseDao.findAll();
	}
	
	
	
	@Override
	public Course addCourse(Course course) 
	{
		
		courseDao.save(course);
		return   course;
	}
	
	@Override
	public Course updateCourse(Course course) 
	{
		
		courseDao.save(course);
		return course;
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public void deleteCourse(long parselong)
	{
		
	Course entity=courseDao.getOne(parselong);
	courseDao.delete(entity);
	
	}

	@SuppressWarnings("deprecation")
	@Override
	public Course getCourse(long courseId) 
	{
		
		return this.courseDao.getOne(courseId);
	}

} 