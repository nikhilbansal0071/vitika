package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CoursesController {
	@RequestMapping("/courses")
	
	public String CoursesController()
	{
		
		return "course";
	}

}
