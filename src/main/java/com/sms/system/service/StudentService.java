package com.sms.system.service;

import java.util.List;

import com.sms.system.entity.Student;

public interface StudentService {
/*
 * We create ServiceImpl package so that for loose coupling depnedecies, hence we creted here an interface instead of class
 * */
	
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);
}
