package calc;
//0323
public class CalculatorMain {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.powerOn();
		// -메서드 호출 에러-
		// 매개변수의 타입과 갯수가 일치하지 않을 때
		// 이름이 다를 경우
		int res = calc.add(5, 0);
		System.out.println(res);
		
		calc.powerOn();  // 계산기 off
		System.out.println(calc.add(1, 2));
		calc.powerOn();
		
		// 배열을 생성 후 메서드의 파라메터로 전달
		int[] numbers = {1,2,3,4,5};
		System.out.println("calc.add(numbers)  " + calc.add(numbers));
		
		// 메서드를 생성할 때 배열을 생성
		System.out.println(calc.add(new int[] {1,2,3,4,5}));
		
		System.out.println("calc.addFn  " + calc.addFn(1,2,3,4,5,6,6,7,78,8,8,99));
		
		
	}
	
}
