package com.curdOperation.Springcurdlearning.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curdOperation.Springcurdlearning.Entity.Student;

public interface StudentRepository  extends JpaRepository<Student, Integer>{

}
