package com.compro.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.compro.code.PeopleCAdaptee;
import com.compro.code.WomenCAdapter;
import com.compro.entity.Person;
import com.compro.model.ResponseModel;

@RestController
@RequestMapping(value="/cAdapter")
public class ClassAdapterController {
	
	@RequestMapping(value="/get.do")
	public ResponseModel getPerson() {
		WomenCAdapter women = new WomenCAdapter();
		return ResponseModel.SUCCESS(new Person(women.getInfo1(), women.getInfo2()));
	}
	
}
