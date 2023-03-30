package loof;
//0320
import java.util.Scanner;

public class Ex04_07 {

	public static void main(String[] args) {
		
		boolean run = true;
		int balance = 0;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------");
			System.out.println("1.예금: 2.출금: 3.잔고: 4.종료");
			System.out.println("--------------------------");
			System.out.print("선택> ");
			
			// sc.next() // 사용자의 입력을 String 타입으로 반환
			int num = sc.nextInt();  // 사용자의 입력을 int 타입으로 반환
			
			//switch(변수){
			//     case 변수의값 :
			//          변수의 값이 일치하면 실행
			//}
			switch(num) {
			case 1:
				// 변수값이 1이면 실행
				System.out.print("예금액> ");
				balance += sc.nextInt();
				// break문이 없으면 다음 case를 계속해서 실행
				break;
			case 2:
				System.out.print("출금액> ");
				balance -= sc.nextInt();
				break;
			case 3:
				System.out.println("잔고> " + balance);
				break;
			case 4:
				System.out.println("프로그램 종료되었습니다.");
				run = false;
			
			}
			
		}
		sc.close();
		
		
	}
	
}
