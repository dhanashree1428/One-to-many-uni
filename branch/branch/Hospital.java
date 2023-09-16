package com.jsp.hospital.branch;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Hospital {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String name;
private String email;
private String location;
@OneToMany
List<Branch> branchs;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getLocation() {
	return location;
}

public void setLocation(String location) {
	this.location = location;
}

public List<Branch> getBranchs() {
	return branchs;
}

public void setBranchs(List<Branch> branchs) {
	this.branchs = branchs;
}

}
