package com.springBootApp.simpleApp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springBootApp.simpleApp.model.Student;

public interface StudentRepository extends MongoRepository<Student, String>{

}
