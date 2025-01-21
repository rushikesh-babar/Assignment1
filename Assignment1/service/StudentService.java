package com.assignment1.Assignment1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment1.Assignment1.dao.StudentDao;
import com.assignment1.Assignment1.dao.model.Student;

@Service
public class StudentService {

	@Autowired
	StudentDao studentDao;
	
	public void addStudent(String name,String studentClass) {
		int rowsAdded=studentDao.addStudent( name, studentClass);
		if(rowsAdded>0) {
			System.out.println("Student Added Successfully");
		}else {
			System.out.println("Unable to add Student");
		}
	}
	public void getAllStudents() {
		List<Student>students=studentDao.getAllStudents();
		if(!students.isEmpty()) {
			System.out.println("All Students: ");
			for(Student student:students) {
				System.out.println(student);
			}
		}
	
}}
