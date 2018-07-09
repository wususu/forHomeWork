package com.compro.entity;

public final class BlackWidow implements Hero{

	private final String name = "黑寡妇";
	
	private final String sex = "女";

	public String getName() {
		return name;
	}

	public String getSex() {
		return sex;
	}

	@Override
	public String heroSay() {
		// TODO Auto-generated method stub
		return "[ " + name + "  " + sex + "]" ;
	}
	
	
}
