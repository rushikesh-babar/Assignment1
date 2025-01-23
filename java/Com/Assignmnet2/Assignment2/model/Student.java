package Com.Assignmnet2.Assignment2.model;

public class Student {

	private int id;
	private String name;
	private String studentClass;
	public Student(int id, String name, String studentClass) {
		super();
		this.id = id;
		this.name = name;
		this.studentClass = studentClass;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStudentClass() {
		return studentClass;
	}
	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", studentClass=" + studentClass + "]";
	}
	
	
	
}
