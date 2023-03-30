package com.kh.object;
//0327
import com.kh.object.practice.StaticSample;

public class Application2 {

	public static void main(String[] args) {
		
		// StaticSample의 value 필드 값을 초기화
		
		// 정적 멤버 접근 : 클래스명. 필드명
		// 클래스명.필드명 - 필드가 private 접근제한자이므로 직접접근 불가
		// 클래스명.메서드명
		StaticSample.setValue("Java");
		// 직접 접근이 안되므로 get메서드를 활용하여 필드값을 추출
		System.out.println("value : " + StaticSample.getValue());
		
		// toUpper 메서드 실행 후 출력
		StaticSample.toUpper();
		System.out.println("대문자로 : " + StaticSample.getValue());
		
		System.out.println("길이 : " + StaticSample.valueLength());
		System.out.println("PROGRAMMING 붙여서 : " + StaticSample.valueConcat("PROGRAMMING"));
		
		// 첫 번째 인덱스의 값을 C로 변경
		StaticSample.setChar(0, 'C');
		// index는 0부터 시작되므로 첫 번째 값을 변경
		System.out.println("J => C : " + StaticSample.getValue());
		
		
	}

}
