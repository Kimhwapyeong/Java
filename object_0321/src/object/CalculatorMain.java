package object;

public class CalculatorMain {

	public static void main(String[] args) {
		
		// 타입 변수명 = new 타입();
		Calculator calc = new Calculator();
		int result = calc.add(2, 5);
		
		System.out.println("두 수의 합: " + result);
		
		int result2 = calc.sub(5, 2);
		System.out.println("두 수의 차: " + result2);
		
		double result3 = calc.div(5, 2);
		System.out.println("두 수의 나눗셈: " + result3);
		
		int result4 = calc.multi(5, 2);
		System.out.println("두 수의 곱셈: " + result4);
		
		int res5 = calc.abs(4, 8);
		System.out.println("절대값 : " + res5);
		
		int res6 = calc.abs(5, 2);
		System.out.println("절대값 : " + res6);
		
	}
	
}
