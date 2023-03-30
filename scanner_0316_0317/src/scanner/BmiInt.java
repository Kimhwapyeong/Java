package scanner;
//0316
import java.util.Scanner;

public class BmiInt {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			
			// 키를 입력 받는다
			// 몸무게를 입력 받는다
			// bmi를 출력한다
			
			System.out.println("키를 입력해주세요(cm) : ");
			int height = scan.nextInt();
			
			if(height == 0) {
				break;
			}
			
			System.out.println("몸무게를 입력해주세요 : ");
			int weight = scan.nextInt();
			
			// 분모에 변수 height 하나에만 형변환을 해주면 값이 제대로 나오지 않음
			// 나머지 하나는 /100 수식에는 double 타입으로 변환되지 않기 때문
			double bmi = weight/(((double)height/100)*((double)height/100));
			
			System.out.printf("당신의 bmi는 %.2f 입니다.\n", bmi);
			
			/*bmi가 18.5 이하면 저체중
			18.5 ~ 22.9 사이면 정상체중
			23.0 ~ 24.9 사이면 과체중
			25.0 이상은 비만 
			 */
			
			if(bmi <= 18.5) {
				System.out.println("저체중입니다");
			} else if (bmi <= 22.9) {
				System.out.println("정상입니다");
			} else if (bmi <= 24.9) {
				System.out.println("과체중입니다");
			} else {
				System.out.println("비만이다 자식아!");
			}
			System.out.println("===================");
			
		}
		System.out.println("종료");
		scan.close();
	}

}
