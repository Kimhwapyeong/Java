package com.jungang;
//0322
public class CalculatorMain {
	public static void main(String[] args) {
		
		// 메모리에 Calculator 객체를 생성 후 calc 변수에 주소값을 저장
		Calculator calc = new Calculator();
		
		System.out.println("======");
		
        // calc.필드이름 을 통해 필드에 접근 가능
//		System.out.println(calc.name);
		// 필드 변경도 가능
//		calc.name = "실수계산기";
//		System.out.println(calc.name);
		
		// . : 주소접근연산자
		System.out.println(calc.add(5, 7));
		// 재사용할때는 변수에 담아준다.
		int addRes = calc.add(5, 7);
		System.out.println(addRes);
	}
	
}
