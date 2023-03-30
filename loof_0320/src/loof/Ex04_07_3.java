package loof;
//0320
import java.util.Scanner;

public class Ex04_07_3 {

	public static void main(String[] args) {
		
		boolean a = true;
		int money = 0;
		Scanner sc = new Scanner(System.in);
		
		outter:
		while(a) {
			System.out.println("==========================");
			System.out.println("1.예금: 2.출금: 3.잔고: 4.종료");
			System.out.println("==========================");
			System.out.print("선택> ");
			
			int i = sc.nextInt();
			
			switch(i){
			case 1:
				System.out.print("예금액> ");
				money += sc.nextInt();
				break;
			case 2:
				System.out.print("출금액> ");
				int m = sc.nextInt();
				if(m > money) {
					System.out.println("예금이 부족합니다.");
				}else {
					money -= m;
				}
				break;
			case 3:
				System.out.println("잔고> " + money);
				break;
			case 4:
				break outter;
			default :
				System.out.println("숫자 1~4를 입력해주세요");
			}
			
		}
		System.out.println("프로그램을 종료합니다");
		sc.close();
	}

}
