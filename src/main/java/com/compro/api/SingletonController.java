package com.compro.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.compro.entity.SingleMan;
import com.compro.model.ResponseModel;

@RestController
@RequestMapping(value="/sgln")
public class SingletonController {
	
	@RequestMapping(value="/set.do")
	public ResponseModel setSingleMan(String name) {
		if (name != null && name.trim() != "") {
			SingleMan.getInstance().setName(name);
			return ResponseModel.SUCCESS("OJBK");
		}
		return ResponseModel.ERROR("Not Ok");
	}
	
	@RequestMapping(value="/get.do")
	public ResponseModel getSingleMan() {
		return ResponseModel.SUCCESS(SingleMan.getInstance());
	}
}
