package com.web.main.service;

import com.web.main.model.Student;

public interface ServiceI {
	
	public void addStudent(Student stu);
	public Student getStudent(int sid);
	public void deleteStudent(int sid);
	public void updateStudent(Student stu);
	public Student editStudent(int sid);

}
