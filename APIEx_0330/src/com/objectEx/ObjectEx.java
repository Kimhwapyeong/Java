package com.objectEx;
//0330
/**
 * 1. API(Application Programming Interface)
 *   - API는 운영체제나 프로그래밍 언어가 제공하는 기능을 제어할 수 있게 만든
 *     인터페이스를 뜻한다.
 *   - 자바에서는 프로그램 개발에 자주 사용되는 클래스 및 인터페이스의 모음을 말한다.
 *     (라이브러리라고 부르기도 한다.)
 * @author user
 *
 */
public class ObjectEx {
	public static void main(String[] args) {
		String str = ""; // => object
		print(str);
		System.out.println("============");
		
		// 기본타입
		int num = 0;  // => Integer => object
		// int 타입은 기본타입으로 Object 타입으로 변환되지 못함
		// int 타입을 객체형태로 변환해야한다  => Wrapper클래스인 Integer타입으로 자동형변환
		// 따라서 print() 메소드에 매개값으로 들어갈 수 있음
		
				//Wrapper클래스
		// int -> Integer (자동형변환)
		// double -> Double
		// 기본타입 : 값 자체를 저장
		// 참조타입 : 주소를 저장
		
		print(num);
		System.out.println("============");
		// 참조타입의 최상위 계층
		ObjectEx objEx = new ObjectEx();
		print(objEx);
		
		str.toString();
		//Integer.toString();
		
	}
	
	public static void print(Object obj) {
		// Object 클래스에 toString이 정의되어 있지만
		// 메소드 오버라이딩에 의해
		// String 클래스, Integer 클래스에 정의되어 있는 메소드가 호출된다
		
		// 클래스이름@16진수주소값을 반환
		System.out.println(obj.toString());     // 메소드 오버라이딩 되어 toString메소드의 리턴값이 다름.
		
		// 두 객체가 가지고 있는 주소값을 비교한다
		// 주소가 같으면 true, 다르면 false
		obj.equals(new Object());
	}
}











