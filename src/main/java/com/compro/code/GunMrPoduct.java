package com.compro.code;

public class GunMrPoduct implements MProduct{

	private String name = "手枪";
	
	private Integer hurt = 10;
	
	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return "[ " + name + "|" + hurt + " ]";
	}
	
}
