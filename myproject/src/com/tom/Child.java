package com.tom;

public class Child {
	private String name;
	protected float height;
	protected String hobby;
	public Child(String name,float height,String hobby) {
		this.height = height;
		this.name = name;
		this.hobby = hobby;
	}
	public void print() {
		System.out.print(name+"\t"+height+"\t"+hobby);
	}
}
