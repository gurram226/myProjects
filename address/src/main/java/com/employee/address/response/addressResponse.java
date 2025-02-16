package com.employee.address.response;

public class addressResponse {

	
	private int id;
	private int d_no;
	private String streetname;
	private String city;
	private String state;
	public addressResponse(int id, int d_no, String streetname, String city, String state) {
		super();
		this.id = id;
		this.d_no = d_no;
		this.streetname = streetname;
		this.city = city;
		this.state = state;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getD_no() {
		return d_no;
	}
	public void setD_no(int d_no) {
		this.d_no = d_no;
	}
	public String getStreetname() {
		return streetname;
	}
	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public addressResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "addressResponse [id=" + id + ", d_no=" + d_no + ", streetname=" + streetname + ", city=" + city
				+ ", state=" + state + "]";
	}
	
	
	
	
	
}
