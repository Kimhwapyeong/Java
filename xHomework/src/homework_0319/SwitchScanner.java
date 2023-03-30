package homework_0319;

import java.util.Scanner;

public class SwitchScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("등급을 입력하세요.\n등급별 이용 안내를 드립니다");
			String grade = sc.next();
			
			switch(grade) {
			case "A": System.out.println("VVIP해택을 받을 수 있습니다.");
			case "B": System.out.println("VIP해택을 받을 수 있습니다."); break;
			case "C": System.out.println("우수회원 해택을 받을 수 있습니다.");
			case "D": System.out.println("일반회원 해택을 받을 수 있습니다."); break;
			default : System.out.println("해택이 없습니다.");
			}
			System.out.println("종료:q, 계속: 아무키 ");
			grade = sc.next();
			if(grade.equals("q")) {
				break;
			}
		}
		sc.close();
		System.out.println("프로그램 종료");

	}

}
