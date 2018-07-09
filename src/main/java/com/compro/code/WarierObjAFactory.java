package com.compro.code;

public class WarierObjAFactory implements AFactory{

	@Override
	public CharacterAProduct getCharacter() {
		// TODO Auto-generated method stub
		return new WarrierAProduct();
	}

	@Override
	public WeaponAProduct getWeapon() {
		// TODO Auto-generated method stub
		return new HammerAProduct();
	}
}
