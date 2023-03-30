package loof;

import java.util.Scanner;

public class Ex04_07_4 {

	public static void main(String[] args) {
		boolean a = true;
		int money = 0;
		Scanner sc = new Scanner(System.in);
		
		// 라벨(이름)을 붙인다.
		//out:
		while(a) {
			System.out.println("==========================");
			System.out.println("1.예금: 2.출금: 3.잔고: 4.종료");
			System.out.println("==========================");
			System.out.print("선택> ");
			
			int input = sc.nextInt();
			
			switch(input) {
				// input == 1
				case 1:
					System.out.print("예금액> ");
					money += sc.nextInt();
					break;
				case 2:
					System.out.print("출금액> ");
					int i = sc.nextInt();
					if(money < i) {
						System.out.println("예금이 부족합니다.");
					}else {
						money -= i;
					}
					break;
				case 3:
					System.out.println("잔고> " + money);
					break;
				case 4:
					System.exit(0);
//					System.out.println("프로그램을 종료합니다.");
//					break out;
//				default:
//					System.out.println("1~4의 숫자를 입력하세요.");
//							
			}
			
			
		}
		System.out.println("프로그램을 종료합니다.");
		sc.close();

	}

}
