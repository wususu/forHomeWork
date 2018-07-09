package com.compro.code;

import com.compro.entity.BlackWidow;
import com.compro.entity.Hero;
import com.compro.entity.IronMan;

public class SimpleFactory {
	
	public static Hero getHero(String name) {
		if (name.equals("钢铁侠")) {
			return new IronMan();
		}else if (name.equals("黑寡妇")) {
			return new BlackWidow();
		} else {
			return null;
		}
	}
	
}
