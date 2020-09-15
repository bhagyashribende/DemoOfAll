package com.web.main.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.main.model.Employee;

@Repository
public interface DeleteRepository extends JpaRepository<Employee, Integer>{

}
