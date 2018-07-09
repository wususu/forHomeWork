package com.compro.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.compro.code.SimpleFactory;
import com.compro.model.ResponseModel;

@RestController
@RequestMapping(value="/simpfty")
public class SimpleFactoryController {

	@RequestMapping(value="getByName.do")
	public ResponseModel getHero(@PathVariable("name")String name) {
		if (name.trim() != "") {
			return ResponseModel.SUCCESS(SimpleFactory.getHero(name));
		}
		return ResponseModel.ERROR("name error");
	}
}
