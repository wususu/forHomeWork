package com.compro.entity;

import java.io.Serializable;

import com.compro.code.AFactory;
import com.compro.code.CharacterAProduct;
import com.compro.code.MFactory;
import com.compro.code.WeaponAProduct;

public class Subject implements Serializable{

	private CharacterAProduct character;
	
	private WeaponAProduct weapon;

	public Subject(AFactory factory) {
		this(factory.getCharacter(), factory.getWeapon());
	}
	
	public Subject(CharacterAProduct character, WeaponAProduct weapon) {
		this.character = character;
		this.weapon = weapon;
	}
	
	public CharacterAProduct getCharacter() {
		return character;
	}

	public WeaponAProduct getWeapon() {
		return weapon;
	}

	public void setCharacter(CharacterAProduct character) {
		this.character = character;
	}

	public void setWeapon(WeaponAProduct weapon) {
		this.weapon = weapon;
	}
	
	
}
