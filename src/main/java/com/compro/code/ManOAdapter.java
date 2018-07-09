package com.compro.code;

public class ManOAdapter implements PeopleOTarget{

	public PeopleCAdaptee people;
	
	public ManOAdapter(PeopleCAdaptee people) {
		// TODO Auto-generated constructor stub
		this.people = people;
	}
	
	@Override
	public String getInfo2() {
		// TODO Auto-generated method stub
		return "男性";
	}

	@Override
	public String getInfo1() {
		// TODO Auto-generated method stub
		return people.getInfo1();
	}

}
