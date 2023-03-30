package calc;
//0323
public class Calculator {
	
	// true : 켜짐, false : 꺼짐
	boolean powerOn; // 초기값 : false
	
	/**
	 * 전원을 키거나 끕니다
	 */
	public void powerOn() {
		if(powerOn) {  // boolean 형이기 때문에 조건문에는 변수이름만 넣어도 됨 // while 문에서 처럼.
			powerOn = false;
			System.out.println("계산기가 꺼졌습니다.");
		}else {
			powerOn = true;
			System.out.println("계산기가 켜졌습니다.");
		}
	}
	
	public int add(int num1, int num2) {
		if(powerOn) {
			return num1 + num2;
		}else {
			System.out.println("계산기를 실행해주세요");
			return 0; 
		}
	}
	
	public int add(int[] numbers) {
		int sum = 0;
		for(int num : numbers) {
			sum += num;
		}
		return sum;
	}
	
	// 배열로 들어온다
	public int addFn(int ... numbers) { // 위의 메소드의 매개변수와 같아서 이름을 바꿔줘야 한다.ㅣ 
		int sum = 0;
		for(int num : numbers) {
			sum += num;
		}
		return sum;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
