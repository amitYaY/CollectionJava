package com.collections.map;

import java.util.List;

public class User {
	
	private String name;
	
	private int age;
	
	private List<Integer> phoneNo;

	public User(String name, int age, List<Integer> phoneNo) {
		this.name = name;
		this.age = age;
		this.phoneNo = phoneNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Integer> getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(List<Integer> phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	

}
