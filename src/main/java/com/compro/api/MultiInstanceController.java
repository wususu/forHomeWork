package com.compro.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.compro.entity.MultiMans;
import com.compro.model.ResponseModel;

@RestController
@RequestMapping(value="/multi")
public class MultiInstanceController {
	
	@RequestMapping(value="/getById.do")
	public ResponseModel getById(@PathVariable("id")Integer id) {
		return ResponseModel.SUCCESS(MultiMans.getById(id));
	}
	
	@RequestMapping(value="/getByRandom.do")
	public ResponseModel getByRandom() {
		return ResponseModel.SUCCESS(MultiMans.getRandom());
	}
	
	@RequestMapping(value="/getAll.do")
	public ResponseModel getAll() {
		return ResponseModel.SUCCESS(MultiMans.getAll());
	}
	
}
