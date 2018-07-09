package com.compro.entity;

import sun.security.jca.GetInstance;

public class SingleMan {

	private static SingleMan instance;
	
	public static synchronized SingleMan getInstance() {
		if (instance == null) {
			instance = new SingleMan();
		}
		return instance;
	}
	
	private SingleMan() {
		
	}
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "SingleMan [name=" + name + "]";
	}
	
	
	
}
