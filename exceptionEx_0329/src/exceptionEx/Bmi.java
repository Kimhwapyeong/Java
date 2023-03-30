package exceptionEx;
//0330
import java.util.InputMismatchException;
import java.util.Scanner;

public class Bmi {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 숫자를 받아옵니다
		
		double height;
		double weight;
		boolean a = true;
		while(a) {
			// 사용자가 숫자를 입력할 때까지 반복
			while(true) {
				try {
					System.out.println("키 입력해주세요.(m)");
					height = sc.nextDouble();

					// 유효 범위를 초과한 경우 오류
					if(height > 3) {
						System.out.println("m단위로 입력해 주세요.");
					}else {
						break;
					}
				} catch (InputMismatchException e) {
					String str = sc.next();
					System.err.println(str + "는(은) 숫자가 아닙니다. 숫자를 입력해주세요.");
				}
				
			}
			
			while(true) {
				try {
					System.out.println("몸무게를 입력해주세요.(kg)");
					weight = sc.nextDouble();
					
					if(weight > 200 || 20 > weight) {
						System.out.println("몸무게는 20보다 크고 200보다 작은 값을 입력해야 합니다.");
					}else {
						double bmi = weight / height * height;
						System.out.println("당신의 BMI는 " + bmi + "입니다.");
						break;
					}
					
				} catch (InputMismatchException e) {
					String str = sc.next();
					System.err.println(str + "는(은) 숫자가 아닙니다.");
				}
				
			}
			while(true) {
				System.out.println("종료 : q또는 Q, 계속 : r");
				String str = sc.next();
				if(str.equals("q") || str.equals("Q")) {
					a = false;
					break;
				}else if(str.equals("r")) {
					break;
				}else {
					System.out.println("입력값이 아닙니다.");
				}
				
			}
		}
		System.out.println("프로그램 종료");
		sc.close();
		
	}
	
	
}
