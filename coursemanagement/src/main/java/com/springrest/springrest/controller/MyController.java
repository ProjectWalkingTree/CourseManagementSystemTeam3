package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.CourseService.CourseService;
import com.springrest.springrest.entities.Course;

@RestController
public class MyController {
	@Autowired
	private CourseService courseService;

	@GetMapping("/")
	public String home() {
		return "welcome to courses application ";
	}

	@GetMapping("/Courses")
	public List<Course> getCouses() {
		return this.courseService.getCourses();

	}

	@GetMapping("/Courses/{courseid}")
	public ResponseEntity<HttpStatus> getCourse(@PathVariable Long courseid)
	{
	  try
	  	{ 
		  this.courseService.getCourse(courseid); return new ResponseEntity<>(HttpStatus.OK);
	  	} 
	  catch(Exception e) 
	  	{
		  return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping("/Courses")
	public Course addCourse(@RequestBody Course course) {
		return this.courseService.addCourse(course);
	}

	@PutMapping("/Courses")
	public Course updateCourse(@RequestBody Course course) {
		return this.courseService.updateCourse(course);
	}

	@DeleteMapping("/Courses/{courseid}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseid) {
		try {
			this.courseService.deleteCourse(Long.parseLong(courseid));
			return new ResponseEntity<>(HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
