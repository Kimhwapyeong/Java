package com.jungang;

public class BmiEx {

	/**
	 * Bmi 구하기
	 */
	public static void main(String[] args) {
		// 변수 선언
		// 타입 변수이름;
		int weight = 50;
		double height = 1.6;
		// 변수에 연산식의 결과를 저장
		double bmi = weight/(height*height);
        
		System.out.println("당신의 BMI는" + bmi + "입니다.");
		
	}

}
