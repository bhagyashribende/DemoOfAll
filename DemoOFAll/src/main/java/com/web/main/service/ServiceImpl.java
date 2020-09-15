package com.web.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.main.dao.StudentRepository;
import com.web.main.model.Student;

@Service
public class ServiceImpl implements ServiceI{
	
	@Autowired
	private StudentRepository sr;

	@Override
	public void addStudent(Student stu) {
		System.out.println("service layer");
		sr.save(stu);
		
	}

	@Override
	public Student getStudent(int sid) {
		Student stu=sr.findById(sid).get();
		return stu;
	}

	@Override
	public void deleteStudent(int sid) {
		System.out.println("service layer");
		sr.deleteById(sid);
		
	}

	@Override
	public void updateStudent(Student stu) {
		sr.save(stu);
		
	}

	@Override
	public Student editStudent(int sid) {
		Student stu=sr.findById(sid).get();
		return stu;
	}

}
