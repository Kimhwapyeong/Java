package homework_0403.library;

import java.util.Scanner;

public class Application {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Application app = new Application();
		
		Library lib = new Library("db");
	}
	
	
	public void adminMenu(Library lib) {
		// 도서 목록 출력
		lib.info();
		
		// 메뉴 확인
		System.out.println("1. 도서등록 2. 도서삭제 0. 로그아웃 q. 프로그램 종료");
		
	}
	
	/**
	 * 사용자로부터 숫자를 입력받습니다
	 * @return
	 */
	public int getInt() {
		int i = 0;
		while(true) {
			try {
				String str = sc.next();
				if(str.equalsIgnoreCase("q")) {
					System.out.println("프로그램 종료");
					System.exit(0);
				}
				i = Integer.parseInt(str);
				break;
			} catch (Exception e) {
				System.out.println("입력중 오류 발생\n숫자를 입력해주세요.");
			}
		}
		return i;
	}
	
	/**
	 * 사용자로부터 문자를 입력받습니다
	 * @return
	 */
	public String getString() {
		String res = "";
		while(true) {
			try {
				res = sc.next();
				try {
					Integer.parseInt(res);
					System.out.println("문자를 입력해주세요");
					continue;
				} catch (Exception e) {

				}
				if(res.equalsIgnoreCase("q")) {
					System.out.println("프로그램 종료");
					System.exit(0);
				}
				return res;
			} catch (Exception e) {
				System.err.println("입력중 오류 발생\n문자를 입력해주세요.");
			}
		}
	}
}










