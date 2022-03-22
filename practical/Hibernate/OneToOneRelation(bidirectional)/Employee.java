package com.Ashoke1.OneToOneBIDirectional;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.*;

@Table(name="emp11")
@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@PrimaryKeyJoinColumn
	private int id;
	private String name;
	@OneToOne(targetEntity=Address.class,cascade=CascadeType.ALL)
	private Address address;
	int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	Address getAddress() {
		return address;
	}
	void setAddress(Address address) {
		this.address = address;
	}
	
	

}
