package com.compro.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.compro.code.ManOAdapter;
import com.compro.code.PeopleCAdaptee;
import com.compro.entity.Person;
import com.compro.model.ResponseModel;

@RestController
@RequestMapping(value="/objAdapter")
public class ObjAdapterController {
	
	@RequestMapping(value="/get.do")
	public ResponseModel getPerson() {
		ManOAdapter man = new ManOAdapter(new PeopleCAdaptee());
		return ResponseModel.SUCCESS(new Person(man.getInfo1(), man.getInfo2()));
	}
	
}
