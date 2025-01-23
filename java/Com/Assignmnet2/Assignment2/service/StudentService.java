package Com.Assignmnet2.Assignment2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Com.Assignmnet2.Assignment2.dao.StudentDao;
import Com.Assignmnet2.Assignment2.model.Student;


@Service
public class StudentService {

	@Autowired
	StudentDao studentDao;
	
	public int addStudent(String name,String studentClass) {
		return studentDao.addStudent(name, studentClass);
	}
	public void getAllStudents() {
		List<Student>students=studentDao.getAllStudents();
		if(!students.isEmpty()) {
			System.out.println("All Students: ");
			for(Student student:students) {
				System.out.println(student);
			}
		}
	

	
	}
	public int updateStudent(int id,String name,String studentClass) {
		return studentDao.updateStudent(id, name, studentClass);
	}


}
