package com.compro.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MultiMans {

	private final static List<MultiMans> multiList = new ArrayList<>();
	
	static {
		multiList.add(new MultiMans("钢铁侠（1号）", 1));
		multiList.add(new MultiMans("蜘蛛侠（2号）", 2));
		multiList.add(new MultiMans("绿巨人（3号）", 3));
		multiList.add(new MultiMans("绿巨人（4号）", 4));
		multiList.add(new MultiMans("超人（5号）", 5));


	}
	
	public MultiMans(String name, Integer id) {
		this.name = name;
		this.id = id;
	}
	
	private Integer id;
	
	private String name;

	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static MultiMans getById(Integer id) {
		for (MultiMans multiMans : multiList) {
			if (multiMans.getId().equals(id)) {
				return multiMans;
			}
		}
		return null;
	}
	
	public static MultiMans getRandom() {
		return multiList.get(new Random().nextInt(multiList.size()));
	}
	
	public static List<MultiMans> getAll(){
		return multiList;
	}
}
