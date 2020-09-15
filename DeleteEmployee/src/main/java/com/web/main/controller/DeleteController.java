package com.web.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.web.main.model.Employee;
import com.web.main.service.DeleteServiceI;

@RestController
public class DeleteController {
	
	@Autowired
	private DeleteServiceI sr;
	
	@DeleteMapping("/deleteEmployee/{id}")
	public String m1(@PathVariable("id") int id)
	{
		sr.deleteEmp(id);
		return "data deleteted";
	}

}
