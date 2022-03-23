package com.Ashoke1.ManyToOneRelationUniDirectional;

import java.util.List;

import javax.persistence.*;

@Table(name="company")
@Entity
public class Company {
@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cmpid;
	private String cmpname;
	
	
	int getCmpid() {
		return cmpid;
	}
	void setCmpid(int cmpid) {
		this.cmpid = cmpid;
	}
	String getCmpname() {
		return cmpname;
	}
	void setCmpname(String cmpname) {
		this.cmpname = cmpname;
	}
	
	 
	 
}
