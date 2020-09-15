package com.web.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.main.dao.DeleteRepository;
import com.web.main.model.Employee;

@Service
public class DeleteService implements DeleteServiceI{
	
	@Autowired
	private DeleteRepository cr;


	@Override
	public void deleteEmp(int id) {
		
		cr.deleteById(id);
		System.out.println("data deleted..");
		
		
	}

}
