package homework_0318;

import java.util.Scanner;
public class ScannerEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("id 입력");
			String str = sc.nextLine();
			if(str.equals("kimhp0807")) {
				System.out.println("비밀번호 입력");
				String str2 = sc.nextLine();
				if(str2.equals("1234")) {
					System.out.println("로그인 성공");
				}else {
					System.out.println("로그인 실패");
				}
			}else {
				System.out.println("아이디를 확인해주세요.");
			
			}
			System.out.println("종료 : q, 다시시도 : 아무 키");
			String str3 = sc.nextLine();
			if(str3.equals("q")) {
				break;
			}
		}
		System.out.println("종료");
		sc.close();
	}

}
