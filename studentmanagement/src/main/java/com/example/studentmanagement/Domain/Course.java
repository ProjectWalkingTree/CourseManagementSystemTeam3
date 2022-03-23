package com.example.studentmanagement.Domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

 
@Entity
@Table(name="Course")
public class Course
{
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
private Long id;
private String coursename;
private String duration;
 
public Long getId() {
return id;
}
 
public void setId(Long id) {
this.id = id;
}
 
public String getCoursename() {
return coursename;
}
 
public void setCoursename(String coursename) {
this.coursename = coursename;
}
 
public String getDuration() {
return duration;
}
 
public void setDuration(String duration) {
this.duration = duration;
}
}
