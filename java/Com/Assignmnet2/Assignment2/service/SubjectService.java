package Com.Assignmnet2.Assignment2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Com.Assignmnet2.Assignment2.dao.SubjectDao;
import Com.Assignmnet2.Assignment2.model.Subject;

@Service
public class SubjectService {

	@Autowired
	SubjectDao subjectDao;
	
	public int insertSubject(String name) {
		return subjectDao.insertSubject(name);
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
