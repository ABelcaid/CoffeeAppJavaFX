package com.coffeemachine.models;

public class Person {

	private int id;
	protected String name;
	protected String phone;
	
	public Person() {
		
	}
	public Person(int id2, String name, String phone) {
		super();
		this.id = id2;
		this.name = name;
		this.phone = phone;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", phone=" + phone + "]";
	}
}
