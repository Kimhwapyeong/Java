package bmi;
//0316
public class BmiEx {
	
	public static void main(String[] args) {

		// 새로운 추가 1
		// 새로운 추가 2
		
		// 출력
		// 키 1.6m 몸무게 55kg
		// bmi = 몸무게/키 * 키
		// 변수의타입 변수명 =(대입연산자) 값;
		// 오른쪽 값을 왼쪽 변수에 저장
		
		double height = 1.6;
		int weight = 55;
		
		double bmi = weight/(height * height);
		
		System.out.println("오늘 하루도 화이팅");
		// %d : 숫자  %f : 실수  %s : 문자
		System.out.printf("당신의 bmi는 %.2f 입니다.\n", bmi);
		System.out.println("깃을 테스트 합니다");
		System.out.println("깃 테스트 2");
		System.out.println("깃 테스트3");
		System.out.println("깃 테스트");
	
	}
	
}
