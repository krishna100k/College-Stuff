package com.mit.main.service;

import com.mit.main.model.Student;

public interface HomeService {
	public void saveData(Student s);
	public Student logincheck(String username, String password);
	public Iterable displayAllData();	
}
