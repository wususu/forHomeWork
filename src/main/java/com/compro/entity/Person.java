package com.compro.entity;

import java.io.Serializable;

import com.compro.code.WomenCAdapter;

public class Person implements Serializable{

	private String info1;
	
	private String info2;
	
	public Person(String info1, String info2) {
		// TODO Auto-generated constructor stub
		this.info1 = info1;
		this.info2 = info2;
	}
	
	public String getInfo1() {
		return info1;
	}

	public String getInfo2() {
		return info2;
	}

	public void setInfo1(String info1) {
		this.info1 = info1;
	}

	public void setInfo2(String info2) {
		this.info2 = info2;
	}
	
	
	
}
