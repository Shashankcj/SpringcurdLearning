package com.curdOperation.Springcurdlearning.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curdOperation.Springcurdlearning.Entity.Student;
import com.curdOperation.Springcurdlearning.Service.StudentServiceImplementation;


@RestController
public class StudentController {

	@Autowired
	StudentServiceImplementation ssi;
	
	@PostMapping("/student")
	public String createStudent(@RequestBody  Student student) {
		ssi.add(student);
		
		return "Student added";
		
		
	}
	
	@GetMapping("/student/{s_id}")
	public Student retriveStudent(@PathVariable("s_id") int s_id) {
		 return ssi.getStudent(s_id);
		
	}
	
	@GetMapping("/student/allstudent")
	public List<Student> retriveAllStudent() {
		
	
		return ssi.allGetStudent();
	}
	
	@DeleteMapping("student/delete/{s_id}")
	public String deleteStudent(@PathVariable("s_id") int s_id) {
		
			ssi.delete(s_id);
			return "Deleted";
	}
	
	@PutMapping("student/update")
	public String update(@RequestBody Student student ) {
		
			ssi.update(student);
		
		return "Student updated";
	}

	
}
