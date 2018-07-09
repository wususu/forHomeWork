package com.compro.code;

public class KniftMProduct implements MProduct{

	private String name = "刀";
	
	private Integer hurt = 4;
	
	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return "[ " + name + "|" + hurt + " ]";
	}
	
}
