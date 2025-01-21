package com.assignment1.Assignment1.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.assignment1.Assignment1.dao.model.Student;

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
}
