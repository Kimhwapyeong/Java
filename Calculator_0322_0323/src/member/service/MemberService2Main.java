package member.service;

import java.util.Scanner;

//0323
public class MemberService2Main {
	public static void main(String[] args) {
		MemberService2 service = new MemberService2("kim", "1234");
		
		Scanner sc = new Scanner(System.in);
		int i = 0;
		while(true) {
			System.out.print("아이디를 입력해주세요>");
			String id = sc.next();
			System.out.print("비밀번호를 입력해주세요>");
			String pass = sc.next();
			
			boolean result = service.login(id, pass);
			if(result) {
				System.out.println("로그인 되었습니다.");
				service.logout(id);
				break;
			}else {
				System.out.println("id 또는 password가 올바르지 않습니다.");
				i++;
				if(i==5) {
					System.out.println("5회 이상 잘못 입력되었습니다. 시스템을 종료합니다.");
					System.exit(0);
				}
			}
			
		}
		
		
		
//		result = service.login("kimgu", "1234");
//		if(result) {
//			System.out.println("로그인 되었습니다.");
//			service.logout("kim");
//		}else {
//			System.out.println("id 또는 password가 올바르지 않습니다.");
//		}
	}
}
