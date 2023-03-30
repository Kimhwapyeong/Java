package object;
//0321
public class Calculator {
	
	// 메서드를 만드는 방법
	// 메서드 : 객체의 기능을 정의
	// 접근제한자 반환타입 메서드명(매개변수타입 변수명){}
	
	/**
	 * 두 개의 정수를 받아서 합을 반환
	 * @return 두 수의 합
	 */
	public int add(int a, int b) {
		return a+b;
	}
	/**
	 * 첫 번째 정수에서 두 번째 정수를 뺀 값을 반환
	 * @return
	 */
	public int sub(int a, int b) {
		return a-b;
	}
	/**
	 *  첫 번째 정수에서 두 번째 정수를 나눈 값을 반환
	 * @return
	 */
	public double div(int a, int b) {
		return (double)a/b;
	}
	/**
	 * 두 개의 정수의 곱을 반환 
	 * @return
	 */
	public int multi(int a, int b) {
		return a*b;
	}
	/**
	 * 두 개의 정수의 차의 절대값 
	 * @return
	 */
	public int abs(int a, int b) {
		if(a>b) {
			return a-b;
		}else {
			return b-a;
		}
	}
	
}
