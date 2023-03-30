package exam06;
//0323
public class CalculatorMain {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		// 정사각형의 넓이
		double rectangle = calc.areaRectangle(20);
		// 직사각형의 넓이
		double b = calc.areaRectangle(14, 18);
		
		System.out.println("정사각형의 넓이 : " +rectangle + "\n" + "직사각형의 넓이 : " + b);
		
	
	
	}
}
