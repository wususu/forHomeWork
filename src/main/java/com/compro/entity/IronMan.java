package com.compro.entity;

import java.io.Serializable;

public final class IronMan implements Hero{

	private final String name = "钢铁侠";
	
	private final String sex = "man";

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
