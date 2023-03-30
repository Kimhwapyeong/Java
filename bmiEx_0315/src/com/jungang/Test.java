package com.jungang;

// 한 줄 주석 ctrl + /
/*
 * 여러 줄 주석(범위 주석)
 */

/**
 * Java Doc를 만들 때 사용할 수 있다
 * @author user
 *
 */
public class Test {
    
	// 프로그램 실행 진입점
	public static void main(String[] args) {
		// 콘솔에 출력하는 문장
		System.out.println("테스트");
		
		
		// int : 정수를 저장할 수 있는 변수 선언
		int x;
		// 변수 x에 1을 저장
		// = 대입연산자 : 오른쪽의 값을 왼쪽에 대입
		x = 1;
		// 변수 선언과 동시에 값을 저장
		int y = 2;
		int result = x + y;
		// 문자와 숫자의 연산은 + 만 가능
		System.out.println("결과 : "+result);

	}

}
