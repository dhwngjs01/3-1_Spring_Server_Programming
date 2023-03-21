package com.inhatc.domain;

public class MemberVO {
	private String name;

	public MemberVO(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "MemberVO [name=" + name + "]";
	}
}
