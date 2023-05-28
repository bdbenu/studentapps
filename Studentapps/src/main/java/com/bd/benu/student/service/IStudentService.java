package com.bd.benu.student.service;

import java.util.List;

import com.bd.benu.student.model.Student;

public interface IStudentService {
	
	public boolean createStudent(Student student);
	
	public List<Student> students();
	
	public Student getStudentsbyId(Integer stdId);
	
	public boolean deleteStudent(Integer stdId);

}
