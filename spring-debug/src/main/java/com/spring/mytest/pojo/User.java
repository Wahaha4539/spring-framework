package com.spring.mytest.pojo;

public class User {
	private String username;
	private Integer age;
	private String address;

	public User(String username, Integer age, String address) {
		this.username = username;
		this.age = age;
		this.address = address;
	}

	public User() {
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
