package com.Ashoke1.OneToManyRelation;

import javax.persistence.*;

@Table(name="answer")
@Entity
public class Answer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String studentname;
	private String answers;
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
	String getAnswers() {
		return answers;
	}
	void setAnswers(String answers) {
		this.answers = answers;
	}
	
	
	
	

}
