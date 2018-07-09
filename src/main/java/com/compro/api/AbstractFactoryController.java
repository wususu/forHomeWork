package com.compro.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.compro.code.AFactory;
import com.compro.code.ArcherObjAFactory;
import com.compro.code.WarierObjAFactory;
import com.compro.entity.Subject;
import com.compro.model.ResponseModel;

@RestController
@RequestMapping(value="/abstractFty")
public class AbstractFactoryController {
	
	@RequestMapping(value="/getWarrier.do")
	public ResponseModel getWarrierObj() {
		AFactory factory = new WarierObjAFactory();
		Subject subject = new Subject(factory);
		return ResponseModel.SUCCESS(subject);
	}
	
	@RequestMapping(value="/getArcher.do")
	public ResponseModel getArcherObj() {
		AFactory factory = new ArcherObjAFactory();
		Subject subject = new Subject(factory);
		return ResponseModel.SUCCESS(subject);
	}
	
}
