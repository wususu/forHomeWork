package com.compro.code;

public class GunMFactory implements MFactory{

	@Override
	public MProduct getProduct() {
		// TODO Auto-generated method stub
		return new GunMrPoduct();
	}

	
}
