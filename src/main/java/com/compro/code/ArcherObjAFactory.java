package com.compro.code;

public class ArcherObjAFactory implements AFactory{

	@Override
	public CharacterAProduct getCharacter() {
		// TODO Auto-generated method stub
		return new ArcherAProduct();
	}

	@Override
	public WeaponAProduct getWeapon() {
		// TODO Auto-generated method stub
		return new BowAndArrowAProduct();
	}

}
