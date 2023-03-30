package me;

import java.util.Scanner;

//0316
public class Bmi {

	public static void main(String[] args) {
		
		while(true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("===== BMI검사 시작 =====");
			System.out.println("니놈의 키를 말하라(m단위로 말하여라)");
			double height = scanner.nextDouble();
			
			System.out.println("니놈의 몸무게는 무엇이냐(kg이다)");
			double weight = scanner.nextDouble();
			
			double bmi = weight/(height*height);
			
			System.out.printf("니놈의 BMI는 %f 이고, ", bmi);
			
			if(bmi <= 18.5) {
				System.out.println("말랐다");
			} else if (bmi <= 22.9) {
				System.out.println("정상이다");
			} else if (bmi <= 24.9)	{
				System.out.println("뚱이다");
			} else {
				System.out.println("돼지다");
			}
			
			System.out.println("벗어나고 싶다면 q 아니면 아무키나 눌러라");
			String str = scanner.next();
			if(str.equals("q")) {
				break;
			}
			
			scanner.close();
			
		}
		System.out.println("===== 종료 =====");
		
		
	}
	
}
