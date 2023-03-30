package com.kh.practice2.mode.vo;
//0329
public class Dog extends Animal{
	
	// 상수 선언 static final
	public static final String PLACE = "애견카페";
	private int weight;
	
	public Dog() {
		
	}
	
	public Dog(String name, String kinds, int weight) {
		super(name, kinds);
		setWeight(weight);
	}
	
	@Override
	public void speak() {
		// 부모의 메소드를 호출
		System.out.println(super.toString() + " 몸무게는 " + weight + " 입니다.");
		
	}

	
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public static String getPlace() {
		return PLACE;
	}
	
	
}
