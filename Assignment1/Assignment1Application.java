package com.assignment1.Assignment1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.assignment1.Assignment1.service.MarksService;
import com.assignment1.Assignment1.service.StudentService;
import com.assignment1.Assignment1.service.SubjectService;

@SpringBootApplication
public class Assignment1Application implements CommandLineRunner {
	@Autowired
	private StudentService studentService;
	@Autowired
	private SubjectService subjectService;
	@Autowired
	private MarksService marksService;

	public static void main(String[] args) {
		SpringApplication.run(Assignment1Application.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		
		//studentService.addStudent("sham","10th");
		//subjectService.insertSubject("Math");
		marksService.addMarks(2,2,90);
		//studentService.getAllStudents();
		//subjectService.getAllSubjects();
		marksService.getMarksById(2);
		
	}

	

}
