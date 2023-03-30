package homework_0318;

import java.util.Scanner;

public class BmiScanner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("BMI 측정 장치");
			System.out.println("키 입력(m)");
			double height = sc.nextDouble();
			
			System.out.println("몸무게 입력(kg)");
			double weight = sc.nextDouble();
			
			double bmi = weight / (height*height);
			System.out.printf("당신의 BMI는 %.2f입니다.\n", bmi);
			
			String str = (bmi < 18.5)?"저체중":(bmi <= 22.9)?"정상":(bmi <= 24.9)?"과체중":"비만";
			System.out.printf("결과는 %s\n", str);
			
			System.out.println("프로그램 종료 : q , 계속 : 아무 키");
			String a = sc.next();
			if(a.equals("q")) {
				break;
			}
			
		}
		System.out.println("프로그램 종료");
		sc.close();
		
		
		
	}

}
