package com.mit.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mit.main.model.Student;
import com.mit.main.repository.HomeRepo;

@Service
public class HomeServiceImpl implements HomeService {
	@Autowired
	HomeRepo hr;
	

	@Override
	public void saveData(Student s) {
		hr.save(s);
	}

	@Override
	public Student logincheck(String username, String password) {
			Student s = hr.findAllByUsernameAndPassword(username, password);
		return s;
	}

	@Override
	public Iterable displayAllData() {
		// TODO Auto-generated method stub
		return hr.findAll();
		
	}
	
}
