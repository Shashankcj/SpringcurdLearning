package com.curdOperation.Springcurdlearning.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	int s_id;
	@Column
	String s_name;
	@Column
	int age;
	@Column
	int reg_no;
	public Student() {
		super();
	}
	public Student(int s_id, String s_name, int age, int reg_no) {
		super();
		this.s_id = s_id;
		this.s_name = s_name;
		this.age = age;
		this.reg_no = reg_no;
	}
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getReg_no() {
		return reg_no;
	}
	public void setReg_no(int reg_no) {
		this.reg_no = reg_no;
	}
	@Override
	public String toString() {
		return "Student [s_id=" + s_id + ", s_name=" + s_name + ", age=" + age + ", reg_no=" + reg_no + "]";
	}
	
	
	
	
	


}
