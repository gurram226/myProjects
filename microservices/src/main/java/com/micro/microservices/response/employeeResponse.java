package com.micro.microservices.response;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class employeeResponse {

	private int id;
	private String name;
	private String course;
	private int experience;
	
	private addressResponse addressResponse;
	
	public addressResponse getAddressResponse() {
		return addressResponse;
	}
	public void setAddressResponse(addressResponse addressResponse) {
		this.addressResponse = addressResponse;
	}
	public employeeResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public employeeResponse(int id, String name, String course, int experience,
			com.micro.microservices.response.addressResponse addressResponse) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.experience = experience;
		this.addressResponse = addressResponse;
	}
	@Override
	public String toString() {
		return "employeeResponse [id=" + id + ", name=" + name + ", course=" + course + ", experience=" + experience
				+ "]";
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
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	
	
}
