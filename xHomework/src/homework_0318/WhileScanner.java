package homework_0318;
// 예제 4_7
import java.util.Scanner;
public class WhileScanner {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------");
			System.out.println("1.예금 : 2.출금 : 3.잔고 : 4.종료");
			System.out.println("-------------------");
			System.out.print("선택> ");
			balance = sc.nextInt();
			if(balance == 1) {
				System.out.println("예금액>10000");
			}else if(balance == 2) {
				System.out.println("출금액>2000");
			}else if(balance == 3) {
				System.out.println("잔고>8000");
			}else if(balance == 4) {
				System.out.println("프로그램 종료");
				break;
			}
		}
		sc.close();
		
		
	}

}
