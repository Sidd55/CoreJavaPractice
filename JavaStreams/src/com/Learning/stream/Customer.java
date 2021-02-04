package com.Learning.stream;

public class Customer {
	
	private int id;
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	private String name;
	private int points;
	
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	
    Customer(int id, String name, int points) {
		super();
		this.id=id;
		this.name = name;
		this.points = points;
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", points=" + points + "]";
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	
	
}
