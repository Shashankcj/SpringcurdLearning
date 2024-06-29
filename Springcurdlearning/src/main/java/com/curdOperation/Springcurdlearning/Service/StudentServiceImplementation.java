package com.curdOperation.Springcurdlearning.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curdOperation.Springcurdlearning.Entity.Student;
import com.curdOperation.Springcurdlearning.Repository.StudentRepository;

@Service
public class StudentServiceImplementation implements StudentService {
	
	

	@Autowired
 StudentRepository sr;
	
	@Override
	public void add(Student student) {
		sr.save(student);
		
		
	}

	@Override
	public void update(Student student) {
		
		sr.deleteById(student.getS_id());
		sr.save(student);
		
		
	}

	@Override
	public Student getStudent(int s_id) {
		
		return sr.findById(s_id).get();
	}

	@Override
	public List<Student> allGetStudent() {
		List<Student> studentlist=new ArrayList<Student>();
		
		sr.findAll().forEach(student->studentlist.add(student));
		
		return studentlist;
	}

	@Override
	public void delete(int s_id) {
		
		sr.deleteById(s_id);
		
		
	}

	
	

}
