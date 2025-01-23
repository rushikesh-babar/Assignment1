package Com.Assignmnet2.Assignment2.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import Com.Assignmnet2.Assignment2.model.Mark;

@Repository
public class MarksDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
    public int addMarks(Integer studentId,Integer subjectId,Integer marks) {
    	
    	String query="insert into marks(student_id,subject_id,marks)values(?,?,?)";
    	int update=jdbcTemplate.update(query,new Object[] {studentId,subjectId,marks});
    	return update;
    }
    
    public List<Mark> getMarksById(Integer student_id){
    	
    	
    	String query="select st.name as student_name, s.name as subject_name, m.marks "+
    			      "from marks m "+
    			      "join student st on m.student_id=st.id "+
    			      "join subject s on m.subject_id=s.id " +
    	              "where m.student_id=?";
    	
    	return jdbcTemplate.query(query,new Object[] {student_id},(rs,rowNum)->new Mark(
    		    rs.getString("student_name"),
    			rs.getString("subject_name"),
    			rs.getInt("marks")
    			
    			));
    	
    	 }
    	
	
}
