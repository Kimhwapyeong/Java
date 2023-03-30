package homework_0325_2;

import java.util.Scanner;

import homework_0325.MemberService;

public class ServiceMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		MemberService service = new MemberService("xksxhsl", "1234");
		
		System.out.println("========로그인 프로그램========");
		while(true) {
			System.out.print("id > ");
			String id = sc.next();
			if(service.getId().equals(id)) {
				System.out.print("password > ");
				service.setA(true);
				break;
//				String pw = sc.next();
//				if(service.getPw().equals(pw)) {
//					service.login(service.getId(), service.getPw());
//				} else {
//					System.out.println("비밀번호가 틀렸습니다.");
//				}
			} else { 
				System.out.println("존재하지 않는 id입니다.");
			}
			
		}
		int count = 0;
		while(service.isA()) {
			String pw = sc.next();
			if(service.getPw().equals(pw)) {
				service.login(service.getId(), service.getPw());
				service.logout(service.getId());
			} else {
				count++;
				System.out.println("비밀번호가 틀렸습니다."
						+ "\n5회 잘못 입력시 강제 종료 됩니다.(남은 횟수 : " + (5 - count) + "회)");
				System.out.print("password > ");
			}
			if(count == 5) {
				System.out.println("비밀번호 5회 잘못 입력되어 프로그램 강제 종료");
				System.exit(0);
			}
		}
		sc.close();
	}
	
}
