package com.spring_security.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class employee {

	@Id
	private int id;
	private String name;
	private String username;
	private String password;
	private String phoneno;
	
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
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
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public employee(int id, String name, String phoneno , String username , String password) {
		super();
		this.id = id;
		this.name = name;
		this.phoneno = phoneno;
		this.username=username;
		this.password=password;
	}
	@Override
	public String toString() {
		return "employee [id=" + id + ", name=" + name + ", phoneno=" + phoneno + " , username=" + username +" , password = "+ password +"]";
	}
	
	
	
	
}
