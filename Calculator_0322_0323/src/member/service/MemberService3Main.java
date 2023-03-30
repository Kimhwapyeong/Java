package member.service;

import java.util.Scanner;

//0323
public class MemberService3Main {
	public static void main(String[] args) {
		MemberService3 mem = new MemberService3("kim", "123");
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		while(true) {
			System.out.print("id > ");
			String id = sc.next();
			System.out.print("pw > ");
			String pw = sc.next();
			
			boolean result = mem.login(id, pw);
			if(result) {
				System.out.println("환영합니다.");
				mem.logout();
				break;
			}else {
				System.out.println("비밀번호를 확인해 주세요");
				count++;
				if(count ==5) {
					System.out.println("5회 잘못 입력되어 종료됩니다.");
					System.exit(0);
				}
			}
		}
	}
}
