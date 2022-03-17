package com.Ashoke1.HybernateEG;


import javax.persistence.*;


@Table(name="emp")
@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="firstname")
	private String firstname;
	@Column(name="lastname")
	private String lastname;
	
	@Column(name="email")
	private String email;
	@Column(name="mobile")
	private String  mobile;
	int getId() {
	return id;
	}
	void setId(int id) {
		this.id =id;
	}
	String getFirstname() {
		return firstname;
	}
	void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	String getLastsname() {
		return lastname;
	}
	void setLastname(String lastname) {
		this.lastname = lastname;
	}String getEmail() {
		return email;
	}
	void setEmail(String email) {
		this.email = email;
	}
	String getMobile() {
		return mobile;
	}
	void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	

}
