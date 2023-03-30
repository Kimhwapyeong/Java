package scanner;
//0316
import java.util.Scanner;

public class Bmi3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("키를 입력해주세요 : ");
		
		String height = scan.next();
		System.out.printf("당신의 키는 %s 입니다.\n", height);
		
		System.out.println("몸무게를 입력해주세요 : ");
		String weight = scan.next();
		System.out.printf("당신의 몸무게는 %s 입니다.");
		
		//따라하다 미완
	}

}
