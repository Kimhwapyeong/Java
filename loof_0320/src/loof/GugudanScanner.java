package loof;
//0320
import java.util.Scanner;

public class GugudanScanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("구구단 출력 장치\n단을 입력하세요.");
			int dan = sc.nextInt();
			
			System.out.println(dan+"단");
			for(int i=1; i<10; i++) {
				System.err.printf("%d*%d=%d\n", dan, i, dan*i);
			}
			System.out.println("종료: q, 계속: 아무 키");
			String str = sc.next();
			if(str.equals("q")) {
				break;
			}
			
		}
		sc.close();
		
	}

}
