package com.mit.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mit.main.model.Student;

@Repository
public interface HomeRepo extends CrudRepository<Student, Integer> {
	Student findAllByUsernameAndPassword(String username, String password);
}
