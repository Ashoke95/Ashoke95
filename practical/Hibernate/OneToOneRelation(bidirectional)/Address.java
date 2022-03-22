package com.Ashoke1.OneToOneBIDirectional;

import javax.persistence.*;

@Table(name="address")
@Entity
public class Address {


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String houseno,city,state,country;
	private int pincode;
	@OneToOne(targetEntity=Employee.class,cascade=CascadeType.ALL)
	private Employee employee;
	int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}
	String getHouseno() {
		return houseno;
	}
	void setHouseno(String houseno) {
		this.houseno = houseno;
	}
	String getCity() {
		return city;
	}
	void setCity(String city) {
		this.city = city;
	}
	String getState() {
		return state;
	}
	void setState(String state) {
		this.state = state;
	}
	String getCountry() {
		return country;
	}
	void setCountry(String country) {
		this.country = country;
	}
	int getPincode() {
		return pincode;
	}
	void setPincode(int pincode) {
		this.pincode = pincode;
	}
	Employee getEmployee() {
		return employee;
	}
	void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
	
	
}
