package com.web.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.web.main.model.Student;
import com.web.main.service.ServiceI;

@RestController
public class StudentController {
	
	@Autowired
	private ServiceI s;
	
    @RequestMapping("/add")
    public String m1(@RequestBody Student stu)
    {
    	s.addStudent(stu);
    	return "data addted";
    }
    
    @RequestMapping("/get/{sid}")
    public Student m2(@PathVariable("sid")int sid)
    {
    	Student stu=s.getStudent(sid);
    	return stu;
    }
    
    @RequestMapping("/delete/{sid}")
    public String m3(@PathVariable("sid")int sid)
    {
    	s.deleteStudent(sid);
    	return "data deleted";
    }
    
    @RequestMapping("/edit/{sid}")
    public Student m4(@PathVariable("sid")int sid)
    {
    	Student stu=s.editStudent(sid);
    	return stu;
    }

    @RequestMapping("/update")
    public String m5(@RequestBody Student stu)
    {
    	s.updateStudent(stu);
    	return "data update";
    }
}
