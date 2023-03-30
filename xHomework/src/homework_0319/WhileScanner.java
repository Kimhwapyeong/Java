package homework_0319;

import java.util.Scanner;

public class WhileScanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean a = true;
		int money = 0;
		
		while(a) {
			System.out.println("--------------------------");
			System.out.println("1.입금: 2.출금: 3.잔고: 4.종료");
			System.out.println("--------------------------");
			System.out.print("선택> ");
			
			int num = sc.nextInt();
			
			switch(num){
			case 1:
				System.out.print("입금액: ");
				money += sc.nextInt();
				break;
			case 2:
				System.out.print("출금액: ");
				money -= sc.nextInt();
				break;
			case 3:
				System.out.println("잔고: " + money);
				break;
			case 4:
				System.out.println("\n종료");
				a = false;
			}
			
		}
		sc.close();
		
	}

}
