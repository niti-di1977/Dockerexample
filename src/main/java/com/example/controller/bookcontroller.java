package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController//= @Controller + @ResponseBody
@RequestMapping("/infosys.com")
public class bookcontroller 
{
	
	@GetMapping("/course")
	public String addCourse() 
	{
		
		return "Course Added";
	}
}