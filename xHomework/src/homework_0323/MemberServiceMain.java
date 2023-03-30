package homework_0323;

import java.util.Scanner;

public class MemberServiceMain {
	public static void main(String[] args) {
		
		MemberService service = new MemberService("xksxhsl", "1234");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("로그인 프로그램");
		String id;
		while(true) {
			System.out.print("id > ");
			id = sc.next();
			if(service.id.equals(id)) {
				System.out.println("비밀번호를 입력하세요.");
				break;
			}else {
				System.out.println("일치하는 id가 없습니다.");
			}
		}
		int count = 5;
		while(true) {
			System.out.print("pw > ");
			String pw = sc.next();
			boolean res = service.login(id, pw);
			if(res) {
				System.out.println("로그인 성공 환영합니다.");
				service.logout(id);
				break;
			}else {
				count--;
				System.out.println("비밀번호가 일치하지 않습니다. "
						+ "5회 잘못 입력되면 강제종료 됩니다. 현재 남은 수 : " + count);
				if(count == 0){
					System.out.println("비밀번호 5회 잘못 입력하여 종료됩니다.");
					System.exit(0);
				}
			}
		}
	}
	
}
