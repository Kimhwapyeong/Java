package scanner;
//0316
import java.util.Scanner;

public class Bmi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
		    System.out.println("키를 입력해주세요(m단위로 입력) : ");
		    // 변수이름. 내가 사용할 수 있는 메서드 목록
		    double height = scan.nextDouble();
		    System.out.printf("당신의 키는 %s 입니다.\n\n", height);
		
		    System.out.println("몸무게를 입력해주세요 : ");
		    int weight = scan.nextInt();
		    double bmi = weight/(height*height);
		    System.out.printf("당신의 몸무게는 %s 이고, bmi는 %.2f 입니다.\n", weight, bmi);
		
		    // scanner가 사용하고 있던 리소를 반납
		    // scan.close();
		  
		    
		
		}
		
	}

}
