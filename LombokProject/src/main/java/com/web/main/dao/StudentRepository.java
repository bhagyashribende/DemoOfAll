package com.web.main.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.main.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
