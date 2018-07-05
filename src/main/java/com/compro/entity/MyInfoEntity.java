package com.compro.entity;

public class MyInfoEntity {

	private String ID;
	
	private String name;
	
	private Integer sex;
	
	private String photoPath;
	
	public MyInfoEntity(String iD, String name, Integer sex, String photoPath) {
		super();
		ID = iD;
		this.name = name;
		this.sex = sex;
		this.photoPath = photoPath;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getPhotoPath() {
		return photoPath;
	}

	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}

	@Override
	public String toString() {
		return "MyInfoEntity [ID=" + ID + ", name=" + name + ", sex=" + sex + ", photoPath=" + photoPath + "]";
	}
	
}
