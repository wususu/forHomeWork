package com.compro.api;

import javax.servlet.http.HttpServletRequest;
import javax.swing.text.html.parser.Entity;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.compro.entity.MyInfoEntity;

import sun.management.snmp.jvminstr.JvmThreadInstanceEntryImpl.ThreadStateMap.Byte1;

@RestController
@RequestMapping(value="/info")
public class IndexController {

	@RequestMapping(value="/me")
	public Object getMyInfo(HttpServletRequest httpServletRequest) {
		String path = httpServletRequest.getContextPath();
		return new MyInfoEntity("201527010324", "吴培坚", 1, path + "/pic/timg.jpg");
	}
}
