package homework_0319;

import java.util.Scanner;

public class BmiScanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("BMI 계산 프로그램");
			System.out.print("키(m): ");
			double height = sc.nextDouble();
			
			System.out.print("몸무게(kg): ");
			double weight = sc.nextDouble();
			
			double bmi = weight / (height*height);
			
			String str = (bmi < 18.5)?"저체중":(bmi < 22.9)?"정상체중"
					:(bmi < 24.9)?"과체중":"울트라비만";
			
			System.out.printf("BMI계산 결과: %.2f이고, %s입니다.\n", bmi, str);
			System.out.println("종료: q, 계속: 아무키 ");
			String a = sc.next();
			if(a.equals("q"))
				break;
			
		}
		sc.close();
		System.out.println("프로그램 종료");
	}
	
}
