package bmi;
//0317
import java.util.Scanner;

/* 
 * public : 누구나 사용 가능
 * 접근제한자 class 클래스이름 {
 * 		- 필드 : 속성을 정의
 * 		- 메서드 : 기능을 정의(동사)
 * 			* mainMothod : 프로그램의 시작, 실행을 담당									
 * 		- 생성자 : 객체를 생성할 때 사용
 * 			new를 만나면 생성자를 통해서 객체가 생성이 된다		  
 * }
*/
public class Bmi3 {

	int j = 0; // 필드, 전역변수
	
	public static void main(String[] args) {
		// int i = 0;  지역변수
		
		// 변수 선언
		// 타입 변수명 = new 타입(매개변수);
		// 기본변수는 메모리에 값을 가지고 있다
		// 참조변수는 메모리의 주소값을 가지고 있다
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("===== BMI 출력 =====");
			System.out.println("키를 입력해주세요.(m) 숫자만 입력 가능합니다.");
			double height = scanner.nextDouble();
			System.out.println("몸무게를 입력해주세요.(kg) 숫자만 입력 가능합니다.");
			double weight = scanner.nextDouble();
			
			double bmi = weight / (height*height);
			System.out.printf("당신의 BMI는 %.2f 입니다.\n", bmi);
			
			String bmiRes = (bmi <= 18.5)?"저체중"
							:(bmi <= 22.9)?"정상"
							:(bmi <= 24.9)?"과체중":"비만";
			System.out.println(bmiRes + "입니다.");
			
			System.out.println("종료 : q, 계속 : 아무키");
			String str = scanner.next();  //nextLine메서드를 사용하면 건너뜀,,
			if(str.equals("q")) {
				break;
			}
			
		}
		scanner.close();
		System.out.println("프로그램 종료");
	}
	

}
