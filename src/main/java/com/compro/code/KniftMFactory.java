package com.compro.code;

public class KniftMFactory implements MFactory{

	@Override
	public MProduct getProduct() {
		// TODO Auto-generated method stub
		return new KniftMProduct();
	}

}
