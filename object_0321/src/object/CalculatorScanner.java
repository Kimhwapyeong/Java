package object;

import java.util.Scanner;

public class CalculatorScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator calc = new Calculator();
		
		boolean a = true;
		while(a) {
			System.out.println("원하는 연산 입력(덧셈, 뺄셈, 나눗셈, 곱셈, 절대값)");
			String str = sc.next();
			switch(str) {
			case "덧셈":
				System.out.println("두 정수를 입력하세요.");
				int i = sc.nextInt();
				int j = sc.nextInt();
				int result = calc.add(i, j);
				System.out.println(result);
				break;
			case "뺄셈":
				System.out.println("두 정수를 입력하세요.");
				i = sc.nextInt();
				j = sc.nextInt();
				result = calc.sub(i, j);
				System.out.println(result);
				break;
			case "나눗셈":
				System.out.println("두 정수를 입력하세요.");
				i = sc.nextInt();
				j = sc.nextInt();
				double result2 = calc.div(i, j);
				System.out.println(result2);
				break;
			case "곱셈":
				System.out.println("두 정수를 입력하세요.");
				i = sc.nextInt();
				j = sc.nextInt();
				result = calc.multi(i, j);
				System.out.println(result);
				break;
			case "절대값":
				System.out.println("두 정수를 입력하세요.");
				i = sc.nextInt();
				j = sc.nextInt();
				result = calc.abs(i, j);
				System.out.println(result);
				break;
			}
			
		}
		
	}

}
