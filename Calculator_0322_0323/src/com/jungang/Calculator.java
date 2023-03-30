package com.jungang;
//0322
public class Calculator {
	
	// 필드(전역 변수)
	// 접근제한자를 붙히지 않으면 default
	// private를 붙히면 다른 클래스에서 변경할 수 없다.
	// 값을 설정하지 않으면 기본값을 초기화
	private String name;
	
	// 생성자의 특징 2개지
	// 1. 클래스의 이름과 동일한 이름을 가진다
	// 2. 반환타입이 없다!!
	// 생성자 : new 연산자를 만나서 객체가 생성될 때 실행됨
	// 생성자를 만들지 않으면 컴파일러가 자동으로 생성해준다.
	public Calculator() {
		// 초기화를 한다!
		name = "정수계산기";
		System.out.println(name);
	}
	
	// 접근제한자 반환타입 메서드명(매개변수타입 변수명){}
	// 정수의 합계를 구하는 메서드, 2개의 정수를 입력받아 두 수의 합을 반환
	
	/**
	 * 두 정수를 입력받아 두 수의 합을 반환한다.
	 * @param num1
	 * @param num2
	 * @return num1+num2
	 */
	public int add(int num1, int num2) {
		
		return num1+num2;
	}
	
}
