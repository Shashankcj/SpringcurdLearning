package com.curdOperation.Springcurdlearning.Service;

import java.util.List;

import com.curdOperation.Springcurdlearning.Entity.Student;

public interface StudentService {
	
	public void add(Student student);
	public void update(Student student);
	public Student getStudent(int s_id);
	public List<Student> allGetStudent();
	public void delete(int s_id);

}
