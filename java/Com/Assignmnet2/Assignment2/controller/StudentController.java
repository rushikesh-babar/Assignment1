package Com.Assignmnet2.Assignment2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Com.Assignmnet2.Assignment2.service.StudentService;
import Com.Assignmnet2.Assignment2.service.SubjectService;

@RestController
@RequestMapping("/api")
public class StudentController {
	@Autowired
    StudentService studentService;
	@Autowired
	SubjectService subjectService;
	@PostMapping("/student/add")
	public String addStudent(@RequestParam String name, @RequestParam String studentClass) {
		int rowsAdded=studentService.addStudent(name, studentClass);
		if(rowsAdded>0) {
			return "Student Added Successfully";
		}else {
			return "Unable to add Student";
			}
	}
	@PutMapping("/student/update/{id}")
	public String updateStudent(@PathVariable int id,@RequestParam String name,@RequestParam String studentClass) {
		
		int rowsUpdated=studentService.updateStudent(id, name, studentClass);
			
		if(rowsUpdated>0) {
			return "Student Updated Successfully";
		}else {
			return "Unable to update Student";
		}
		
	}
}
