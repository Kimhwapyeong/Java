package homework_0316;

import java.util.Scanner;

public class BmiWhile {
	
	public static void main(String[] args) {

		while(true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("====== BMI ======");
			System.out.println("키가 몇이고? 미터로 말이다");
			double height = scanner.nextDouble();
	
			System.out.println("몇kg냐 이자식아!");
			double weight = scanner.nextDouble();
			
			double bmi = weight / (height*height);
			
			System.out.printf("니놈 BMI는 %.2f다!", bmi);
			
			if(bmi <= 18.5) {
				System.out.println("치면 부러지것다!");
			} else if (bmi <= 22.9) {
				System.out.println("적당하다!");
			} else if (bmi <= 24.9) {
				System.out.println("뚱이");
			} else {
				System.out.println("나가 뒤져!");
			}
			
			System.out.println("측정 끝났어 더 할 거면 q 아니면 아무키나 입력해");
			String str = scanner.next();
			if(str.equals("q")) {
				break;
			}
		
			scanner.close();
		}	
		System.out.println("종료");
	}

}
