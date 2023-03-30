package homework_0318;

import java.util.Scanner;

public class WhileScanner4 {

	public static void main(String[] args) {
		
		boolean a = true;
		int money = 0;
		Scanner sc = new Scanner(System.in);
		
		while(a) {

		System.out.println("-----------------------------");
		System.out.println("1.입금 : 2.출금 : 3.잔고 : 4.종료");
		System.out.println("-----------------------------");
		System.out.print("선택> ");
		
		int b = sc.nextInt();
		
			switch(b) {
			case 1:
				System.out.print("입금액>");
				money += sc.nextInt();
				break;
			case 2:	
				System.out.print("출금액>");
				money -= sc.nextInt();
				break;
			case 3:
				System.out.println("잔고> " + money);
				break;
			case 4:
				a = false;
				System.out.println("\n프로그램 종료");
			}
			//커밋용
		}
		
	}
	
}
