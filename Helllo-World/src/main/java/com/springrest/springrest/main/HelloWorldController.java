package com.springrest.springrest.main;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorldController {
	@Autowired
	public CourseService courseService;
	@RequestMapping("/home")
	public String home()
	{
		return "Hello world";
	}
	
	
	
	@GetMapping(path="/hello-world-bean")  
	public HelloWorldBean helloWorldBean()  
	{  
	return new HelloWorldBean("Hello World"); //constructor of HelloWorldBean  
	}  

	
	
	//passing a path variable  
	@GetMapping(path="/hello-world/path-variable/{name}")  
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name)  
	{  
	return new HelloWorldBean(String.format("Hello World, %s", name)); //%s replace the name  
	}  
	
	@GetMapping("/courses")
	public List<Course> getCourses()
	{
		return this.courseService.getCourses();
	}
	
	@PostMapping("/users")  
	public void createUser(@RequestBody User user)  
	{    
	}  
	
}
