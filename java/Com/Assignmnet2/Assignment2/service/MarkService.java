package Com.Assignmnet2.Assignment2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Com.Assignmnet2.Assignment2.dao.MarksDao;
import Com.Assignmnet2.Assignment2.dao.StudentDao;
import Com.Assignmnet2.Assignment2.model.Mark;

@Service
public class MarkService {

	@Autowired
	MarksDao markDao;
	@Autowired
	StudentDao studentDao;

	public int addMarks(Integer studentId,Integer subjectId,Integer marks) {
		 return markDao.addMarks(studentId, subjectId, marks);
	}

	public void getMarksById(Integer studentId) {
		List<Mark>marks=markDao.getMarksById(studentId);
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
