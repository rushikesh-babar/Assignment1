package com.assignment1.Assignment1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment1.Assignment1.dao.SubjectDao;
import com.assignment1.Assignment1.dao.model.Subject;

@Service
public class SubjectService {

	@Autowired
	SubjectDao subjectDao;
	
	public void insertSubject(String name) {
		int rowsAdded=subjectDao.insertSubject(name);
		if(rowsAdded>0) {
			System.out.println("Subject Added Successfully");
		}else {
			System.out.println("Unable to add Subject");
		}
	}
	public void getAllSubjects() {
		List<Subject>subjects=subjectDao.getAllSubjects();
		if(!subjects.isEmpty()) {
			System.out.println("All Subjects :");
			for(Subject subject:subjects) {
				System.out.println(subject);
			}
		}
	
}
}
