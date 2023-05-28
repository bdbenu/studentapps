package com.bd.benu.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bd.benu.student.model.Student;
import com.bd.benu.student.repositary.IStudentRepositary;

@Service
public class StudentServiceImpl implements IStudentService{
	
	@Autowired
	private IStudentRepositary studentRepositary;

	@Override
	public boolean createStudent(Student student) {
		Student save = studentRepositary.save(student);		
		return save.getStdId()!=null;
	}

	@Override
	public List<Student> students() {
		
		return studentRepositary.findAll();
	}

	@Override
	public Student getStudentsbyId(Integer stdId) {
		Optional<Student> findById = studentRepositary.findById(stdId);
		if(findById.isPresent()) {
			Student student = findById.get();
			return student;
		}
		return null;
	}

	@Override
	public boolean deleteStudent(Integer stdId) {
		studentRepositary.deleteById(stdId);
		return true;
	}

}
