package Com.Assignmnet2.Assignment2.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import Com.Assignmnet2.Assignment2.model.Subject;

@Repository
public class SubjectDao {

	 @Autowired
		JdbcTemplate jdbcTemplate;
	    
	    public int insertSubject(String name){
	    	
	    	String query="insert into subject(name) values(?)";
	    	int update=jdbcTemplate.update(query,name);
	    	return update;
	    }
	    public List<Subject>getAllSubjects(){
	    	String query="select * from subject";
	    	return jdbcTemplate.query(query, (rs,rowNum)->new Subject(
	    			rs.getInt("id"),
	    			rs.getString("name")
	    			)
	    			);
	    }
	
}
