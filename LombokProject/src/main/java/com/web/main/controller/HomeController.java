package com.web.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.main.dao.StudentRepository;
import com.web.main.model.Student;

@Controller
public class HomeController {
	
	@Autowired
	StudentRepository sr;
	
	@RequestMapping("/")
	public String m1()
	{
		return "index";
	}
	
	@RequestMapping("/register")
	public String addStudent(@ModelAttribute Student stu)
	{
	
		System.out.println(stu.getName());
		Student s=sr.save(stu);
		return "success";
		
	}

}
