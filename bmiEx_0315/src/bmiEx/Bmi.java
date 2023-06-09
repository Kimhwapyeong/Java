// 230315
// 패키지 선언
package bmiEx;

// 클래스 선언문
// 접근제한자 class 클래스명
public class Bmi {
	// 필드(클래스 블럭 안에 작성되는 변수)
	// 속성을 정의
		
	// 메인메소드 - 실행
	// 메서드의 선언문
	// 접근제한자 리턴타입 메소드명 (매개변수의타입 변수명)
	// void : 리턴타입이 없는 경우
	
	 /*변수의 사용 범위 :
	   시작블럭 { 이후 선언된 변수는 종료 블럭을 } 만나면 사라진다
	   메서드 블럭 내에서 선언된 변수는
	   블럭 내부에서만 사용 가능
	   다른 명령문장에서 블럭이 열리면 마찬가지로 블럭 내부에서만 사용 가능
	 */
	public static void main(String[] args) {
		// 키 1.6, 몸무게 50kg
	    // int(정수), double(실수)
		double bmi = 50/(1.6*1.6);			
		System.out.println("당신의 Bmi는 ..." + bmi);
		
		// 정수를 담을 수 있는 value 라는 변수 선언
		int value;
		// 정수타입 변수 sum 생성하고 20으로 초기화
		int sum = 20;
		// value를 10으로 초기화
		value = 10;
		// sum에 value값과 20을 더한다
		sum = value + 20;
		System.out.println(sum);
		
		// 진실의 문
		// 만약 ()안의 조건이 참이라면 {}코드블럭 실행
		// if(조건문) { }
		// 참/거짓 true / false
		if(1<0) {
			System.out.println("1<0");
		}
		if(true) {
			System.out.println(true);
			System.out.println("true");
		}
		if(false) {
			System.out.println(false);
			System.out.println("false");
		}
		
	}

}
