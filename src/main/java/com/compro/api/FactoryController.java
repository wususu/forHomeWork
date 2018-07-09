package com.compro.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.compro.code.GunMFactory;
import com.compro.code.KniftMFactory;
import com.compro.code.MFactory;
import com.compro.code.MProduct;
import com.compro.model.ResponseModel;

@RestController
@RequestMapping(value="/fty")
public class FactoryController {
	
	@RequestMapping(value="/knift.do")
	public ResponseModel getKnift() {
		MFactory factory = new KniftMFactory();
		MProduct product = factory.getProduct();
		return ResponseModel.SUCCESS(product.getInfo());
	}
	
	@RequestMapping(value="/gun.do")
	public ResponseModel getGun() {
		MFactory factory = new GunMFactory();
		MProduct product = factory.getProduct();
		return ResponseModel.SUCCESS(product.getInfo());
	}
	
}
