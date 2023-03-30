package homework_0318;

import java.util.Scanner;

public class WhileScanner3_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean b = true;
		int money = 0;
		
		while(b) {
			System.out.println("---------------------------");
			System.out.println("1.예금 : 2.출금 : 3.잔고 4.종료");
			System.out.println("---------------------------");
			System.out.print("선택> ");
			
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				System.out.print("예금액> ");
				money += sc.nextInt();
				// int a = sc.nextInt();
				// money = money + a
				// money = money + sc.nextInt();
				break;
			case 2:
				System.out.print("출금액> ");
				money -= sc.nextInt();
				break;
			case 3:
				System.out.println("잔고> " + money);
				break;
			case 4:
				b = false;
				System.out.println("\n프로그램 종료");
				break;
			}
			
		}
		sc.close();
		
		
		
	}

}
