package bmi;

import java.util.Scanner;

//0316
public class Bmi2 {
	 public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		 while(true) {
			 System.out.println("===== BMI =====");
			 System.out.println("당신의 키를 입력해주세요.(m)");
			 double height = scan.nextDouble();
			 System.out.println("당신의 몸무게를 입력해주세요.");
			 double weight = scan.nextDouble();
			 
			 double bmi = weight / (height * height);
			 System.out.printf("당신의 BMI는 %.2f 입니다.", bmi);
			 
			 if(bmi <= 18.5) {
				 System.out.println("저체중");
			 } else if (bmi <= 22.9) {
				 System.out.println("정상체중");
			 } else if (bmi <= 24.9) {
				 System.out.println("과체중");
			 } else {
				 System.out.println("고도비만");
			 }
			
			 System.out.println("q: 종료, 아무키 : 계속.");
			 
			 String str = scan.next();
			 if("q".equals(str)) {
				 break;
			 }
			 
		 }
		 System.out.println("=================");
		 scan.close();
	}

}
