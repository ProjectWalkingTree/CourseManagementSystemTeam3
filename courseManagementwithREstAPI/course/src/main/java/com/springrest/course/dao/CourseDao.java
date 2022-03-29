package com.springrest.course.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.springrest.course.pojo.Course;

public interface CourseDao extends JpaRepository<Course,Long>
{

}
