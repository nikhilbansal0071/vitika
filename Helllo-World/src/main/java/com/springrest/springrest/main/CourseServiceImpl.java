package com.springrest.springrest.main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class CourseServiceImpl implements CourseService {
	
	
	List<Course> list;
	public  CourseServiceImpl() {
		list = new ArrayList<>();
		list.add(new Course(145,"devops","bestsellingcourse"));
		list.add(new Course(15,"spring","bestcourse"));
	}

	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}
