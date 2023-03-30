package loof;
//0320
import java.util.Scanner;

public class Ex04_07_2 {

	public static void main(String[] args) {
		
		boolean run = true;
		int money = 0;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("==========================");
			System.out.println("1.예금: 2.출금: 3.잔고: 4.종료");
			System.out.println("==========================");
			System.out.print("선택> ");
			
			String str = sc.next();
			int num = Integer.parseInt(str); // 굳이 타입변환을 위해 써봄
			
			switch(num) {
			case 1:
				System.out.print("예금액> ");
				money += sc.nextInt();
				break;
			case 2:
				System.out.print("출금액> ");
				money -= sc.nextInt();
				break;
			case 3:
				System.out.println("잔고> " + money);
				break;
			case 4:
				System.out.println("종료");
				run = false;
			}
			
		}
		sc.close();

	}

}
