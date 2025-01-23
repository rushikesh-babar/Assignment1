package Com.Assignmnet2.Assignment2.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import Com.Assignmnet2.Assignment2.model.Student;

@Repository
public class StudentDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int addStudent(String name,String studentClass) {
		
	 String query="insert into student(name,studentClass) values(?,?)";
	 int update=jdbcTemplate.update(query,new Object[] {name,studentClass});
		return update;
	}
	public List<Student>getAllStudents() {
		String query="select * from student";
		return jdbcTemplate.query(query, (rs,rowNum)->new Student(
				rs.getInt("id"),
				rs.getString("name"),
				rs.getString("studentClass")
				)
				);
	}
public int updateStudent(int id,String name,String studentClass) {
	String query="update student set name=?, studentClass=? where id=?";
	return jdbcTemplate.update(query,name,studentClass,id);
	
}
	
}
