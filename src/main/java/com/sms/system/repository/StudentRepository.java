package com.sms.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sms.system.entity.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

	/*JpaRepository has two parameters
	 * 1 Entity
	 * 2 Type of Primary Key
	 * */
	
	
	//@Repository is optional to add above interface, JPARepository by default as it added
	
	//JPARepository also provides transaction by default, it has @Transactional inside it. So need to provide it for public methods in service layer
	
	//All CRUD methods are present/involved, so nothing to add
}
