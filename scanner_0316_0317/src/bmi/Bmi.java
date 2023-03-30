package bmi;
//0316
import java.util.Scanner;

public class Bmi {

	public static void main(String[] args) {
		// 스캐너 객체를 사용하기 위해
		// 생성함
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("===== BMI =====");
			System.out.println("키를 입력해주세요(m) : ");
			double height = scan.nextDouble();
			System.out.println("몸무게를 입력해주세요(kg) : ");
			double weight = scan.nextDouble();
			
			double bmi = weight/(height*height);
			
			System.out.printf("당신의 BMI는 %.2f 입니다.", bmi);
			/*bmi가 18.5 이하면 저체중
			18.5 ~ 22.9 사이면 정상체중
			23.0 ~ 24.9 사이면 과체중
			25.0 이상은 비만 
			 */
			if(bmi <= 18.5) {
				System.out.println("당신은 저체중 입니다.");
			} else if (bmi <= 22.9) {
				System.out.println("당신은 정상체중 입니다.");
			} else if (bmi <= 24.9) {
				System.out.println("당신은 과체중 입니다.");
			} else {
				System.out.println("뚱땡이");
			}
			
			System.out.println("q: 종료, 아무키나 입력해주세요");
			// 스트링의 비교는 .equals()
			String str = scan.next();
			if("q".equals(str)) {
				// 반복문 탈출
				break;
			}

		}
		System.out.println("========== 종료 ==========");
		scan.close();
	}

}
