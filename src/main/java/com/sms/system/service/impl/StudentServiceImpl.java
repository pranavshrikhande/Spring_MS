package com.sms.system.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sms.system.entity.Student;
import com.sms.system.repository.StudentRepository;
import com.sms.system.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	//Inject dependencies here
	private StudentRepository studentRepository;

	
	// If there is only constructor inside this bean, we can avoid using @Autowired annotation
	
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		//findAll returns list of stidents
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
	
		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);
		
	}

	
	
	
}
