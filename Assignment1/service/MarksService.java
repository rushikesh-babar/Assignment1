package com.assignment1.Assignment1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment1.Assignment1.dao.MarksDao;
import com.assignment1.Assignment1.dao.StudentDao;
import com.assignment1.Assignment1.dao.model.Mark;
import com.assignment1.Assignment1.dao.model.Student;

@Service
public class MarksService {
@Autowired
MarksDao marksDao;
@Autowired
StudentDao studentDao;

public void addMarks(Integer studentId,Integer subjectId,Integer marks) {
	 int rowsAdded=marksDao.addMarks(studentId, subjectId, marks);
	 if(rowsAdded>0) {
		 System.out.println("Marks Added Successfully");
	 }
	else {
		System.out.println("Unable to add marks");
	}
}

public void getMarksById(Integer studentId) {
	List<Mark>marks=marksDao.getMarksById(studentId);
	if(!marks.isEmpty()) {
		System.out.println("Result for Student Id "+studentId+" :");
		System.out.println("Student Name: "+marks.get(0).getStudentName());
		for (Mark mark : marks) {
            System.out.println("Subject: " + mark.getSubjectName() + ", Marks: " + mark.getMarks());
        }
    } else {
        System.out.println("No results found for Student ID " + studentId);
    }
	}
	
}
	

