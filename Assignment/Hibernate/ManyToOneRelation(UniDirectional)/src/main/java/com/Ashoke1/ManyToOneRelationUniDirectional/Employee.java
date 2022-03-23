package com.Ashoke1.ManyToOneRelationUniDirectional;

import java.util.List;

import javax.persistence.*;




@Table(name="Employee2")
@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String empname,empdesig,empaddress,empemail;
	 @ManyToOne(cascade=CascadeType.ALL)
     @JoinColumn(name="cmpid")
	private Company company;
	int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}
	String getEmpname() {
		return empname;
	}
	void setEmpname(String empname) {
		this.empname = empname;
	}
	String getEmpdesig() {
		return empdesig;
	}
	void setEmpdesig(String empdesig) {
		this.empdesig = empdesig;
	}
	String getEmpaddress() {
		return empaddress;
	}
	void setEmpaddress(String empaddress) {
		this.empaddress = empaddress;
	}
	String getEmpemail() {
		return empemail;
	}
	void setEmpemail(String empemail) {
		this.empemail = empemail;
		
	}
	Company getCompany() {
		return company;
	}
	void setCompany(Company company) {
		this.company = company;
	}
	
	
	
	 
	 

}
