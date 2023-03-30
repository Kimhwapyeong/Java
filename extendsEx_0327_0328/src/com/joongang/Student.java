package com.joongang;
//0328
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
	
	@Override
	public String information() {
		// super.information 반환타입 String
		// 필드를 직접 사용할 수 있지만 굳이 get메서드를 사용하는 이유는
		// get메서드에서 리턴값에 어떤 데이터가 있을 수도 있기 때문.
		// 예를 들어 getGrade() { return grade + "반" } 은 grade와 getGrade()의 값이 다름
		return super.information() + " " + getGrade() + " " + getMajor();
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
//	public String information() {
//		return name + " " + getAge() + " " + getHeight() + " " + 
//				getWeight() + " " + grade + " " + major;
//	}
	
	
}
