package com.compro.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.compro.code.CatSay;
import com.compro.code.DogSay;
import com.compro.code.Say;
import com.compro.model.ResponseModel;

@RestController
@RequestMapping(value="/inter")
public class InterController {
	
	@RequestMapping(value="/say.do")
	public ResponseModel say(@PathVariable("type")String type) {
		Say say;
		if (type.equals("cat")) {
			say = new CatSay();
		}else if (type.equals("dog")) {
			say = new DogSay();
		}else {
			return ResponseModel.ERROR("wrong type");
		}
		return ResponseModel.SUCCESS(say.say());
	}
	
}
