package com.Ashoke1.HibernateEg1;

import javax.persistence.*;

@Table(name="student")
@Entity
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	
	private int id;
	@Column(name="studentname")
	private String studentname;
	@Column(name="phone", unique=true)
	private long phone;
	@Column(name="email", unique=true)
	private String email;
	@Column(name="course")
	private String course;
	@Column(name="fees")
	private double fees;
	int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}
	String getStudentname() {
		return studentname;
	}
	void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	long getPhone() {
		return phone;
	}
	void setPhone(long phone) {
		this.phone = phone;
	}
	String getEmail() {
		return email;
	}
	void setEmail(String email) {
		this.email = email;
	}
	String getCourse() {
		return course;
	}
	void setCourse(String course) {
		this.course = course;
	}
	double getFees() {
		return fees;
	}
	void setFees(double fees) {
		this.fees = fees;
	}
	
	
}
