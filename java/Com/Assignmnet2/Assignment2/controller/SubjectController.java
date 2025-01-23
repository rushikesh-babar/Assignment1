package Com.Assignmnet2.Assignment2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Com.Assignmnet2.Assignment2.service.SubjectService;

@RestController
@RequestMapping("/api/subject")
public class SubjectController {
	@Autowired
    SubjectService subjectService;
	@PostMapping("/addSub")
	public String insertSubject(@RequestParam String name) {
		int rowsAdded=subjectService.insertSubject(name);
		if(rowsAdded>0) {
			return "Subject Added Successfully";
		}else {
			return "Unable to add Subject";
		}
	}
	
}
