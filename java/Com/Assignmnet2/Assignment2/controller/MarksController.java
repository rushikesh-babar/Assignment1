package Com.Assignmnet2.Assignment2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Com.Assignmnet2.Assignment2.service.MarkService;

@RestController
@RequestMapping("/api/marks")
public class MarksController {
@Autowired
MarkService markService;
@PostMapping("/add")
	public String addMarks(@RequestParam int studentId,
			            @RequestParam int subjectId,
			            @RequestParam int marks  ) {
		int rowsAdded=markService.addMarks(studentId, subjectId, marks);
		if(rowsAdded>0) {
			return "Marks Added Successfully";
		}else {
			return "Unable to add Marks";
		}
	}
		
	}
	

