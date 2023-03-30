package homework_0316;

import java.util.Scanner;

public class BmiLast {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("====== BMI 측정 ======");
			System.out.println("키 입력(m)");
			double height = scanner.nextDouble();
			
			System.out.println("몸무게 입력(kg)");
			double weight = scanner.nextDouble();
			
			double bmi = weight / (height * height);
			
			System.out.printf("BMI : %.2f", bmi);
			
			if(bmi <= 18.5) {
				System.out.println("저체중");
			} else if(bmi <= 22.9) {
				System.out.println("정상체중");
			} else if(bmi <= 24.9) {
				System.out.println("과체중");
			} else {
				System.out.println("비만");
			}
			
			System.out.println("=============");
			System.out.println("계속 : 아무 키");
			System.out.println("종료 : q");
			String str = scanner.next();
			if(str.equals("q")) {
				break;
			}
			
			
		}
		scanner.close();
		System.out.println("프로그램 종료");
		
	}

}
