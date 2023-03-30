package com.kh.practice2.mode.vo;
//0329
public abstract class Animal {
	private String name;
	private String kinds;
	
	protected Animal() {
		
	}
		
	protected Animal(String name, String kinds) {
		// 필드 초기화
		this.name = name;
		this.kinds = kinds;
	}
	
	// 문자열을 반환합니다
	public String toString() {
		return "저의 이름은 " + name + "이고, 종류는 " + kinds + "입니다.";
	}
	
	// 클래스가 추상 메소드를 포함할 경우 추상 클래스가 되어야 함
	public abstract void speak();
	
	
}
