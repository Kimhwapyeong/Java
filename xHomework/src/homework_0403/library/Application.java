package homework_0403.library;

import java.util.Scanner;

public class Application {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Application app = new Application();
		
		Library lib = new Library("db");
		
		System.out.println("아이디를 입력해주세요.");
		String id = app.getString();
		if("admin".equals(id)) {
			app.adminMenu(lib);
		}else {
			app.userMenu(lib);
		}
	}
	
	
	public void adminMenu(Library lib) {
		while(true) {
			// 도서 목록 출력
			lib.info();
			
			// 메뉴 확인
			System.out.println("1. 도서등록 2. 도서삭제 0. 로그아웃 q. 프로그램 종료");
			System.out.println("메뉴를 입력해주세요.");
			
			int menu = getInt();
			int num = 0;
			switch(menu) {
			case 1 : 
				System.out.println("일련번호 입력");
				num = getInt();
				System.out.println("제목 입력");
				String title = getString();
				System.out.println("저자 입력");
				String author = getString();
				
				lib.insertBook(num, title, author);
				break;
			case 2 :
				System.out.println("삭제할 도서번호 입력");
				num = getInt();
				
				lib.deleteBook(num);
				break;
			case 0 :
				return;
			default :
				System.out.println("메뉴를 확인 후 다시 입력해주세요.");
			}
		}
	}
		
	public void userMenu(Library lib) {
		while(true) {
			lib.info();
			
			System.out.println("1. 도서대여 2. 도서반납 3. 로그아웃 q. 프로그램종료");
			System.out.println("메뉴를 선택해주세요.");
			
			int menu = getInt();
			switch(menu) {
			case 1 :
				System.out.println("도서 번호를 입력해주세요.");
				int index = getInt();
				lib.rentBook(index);
			case 2 :
				System.out.println("도서 번호를 입력해주세요.");
				index = getInt();
				lib.returnBook(index);
			case 0 :
				return;
			default :
				System.out.println("메뉴를 확인해주세요.");
			}
			
		}
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










