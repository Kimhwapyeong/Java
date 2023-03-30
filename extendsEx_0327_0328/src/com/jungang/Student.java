package com.jungang;
//0327 //0328
public class Student extends Person{
	
	private int grade;
	private String major;
	
	public Student() {}
	
	// 초기화 : 생성자의 매개변수를 필드에 입력합니다.
	public Student(String name, int age, double height, 
			double weight, int grade, String major) {
		// 부모의 생성자를 호출한다
		super(age, height, weight);
		// super.age;  // private 접근제한자라 접근 불가
		super.name = name;  // protected : 패키지가 달라도 부모자식 관계면 접근 가능
		this.grade = grade;
		this.major = major;
	}
	
	public String information() {
		return name + " " + getAge() + " " + getHeight() + " " + 
				getWeight() + " " + grade + " " + major;
	}
	
	
	
}
