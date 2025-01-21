package com.assignment1.Assignment1.dao.model;

public class Mark {
    private String studentName;
	private String subjectName;
	private int marks;
	public Mark(String studentName,String subjectName, int marks) {
		super();
		this.studentName=studentName;
		this.subjectName = subjectName;
		this.marks = marks;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	@Override
	public String toString() {
		return "Mark [studentName=" + studentName + ", subjectName=" + subjectName + ", marks=" + marks + "]";
	}
	
	
	
}
