package com.wangogo.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class MyTestBean {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "MyTestBean{" +
				"name='" + name + '\'' +
				'}';
	}
}
