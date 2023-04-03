package com.library;
//0403
import java.util.Scanner;

public class Application {
	
	// 인스턴스멤버 -> 생성 후 사용 가능
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// 인스턴스 멤버는 생성후 사용이 가능하다
		Application app = new Application();
		
		// 도서관 생성
		Library lib = new Library("file");
		
		// 로그아웃 처리 시 다시 실행
		// 로그인 처리
		while(true) {
			System.out.println("아이디를 입력해주세요.");
			String id = app.getString();
			
			if("admin".equalsIgnoreCase(id)) {
				app.adminMenu(lib);
				
			}else {
				// 사용자 메뉴를 메소드로 빼서 호출하였다.
				app.memberMenu(lib);
			}
		}
	}
	
	private void adminMenu(Library lib) {
		// 관리자
		
		// 도서목록 출력
		while(true) {
			lib.info();
			//메뉴 확인
			System.out.println("1. 도서등록 2. 도서삭제 0. 로그아웃 q. 프로그램종료");
			System.out.println("메뉴를 입력해주세요.");
			// 메소드로 바꿨을 때 app.getInt()에서 app을 뺄 수 있는 이유
			// Application의 메소드이기 때문에 Application의 메소드를 생성없이 호출
			int menu = getInt();  
			int num = 0;
			switch(menu) {
			case 1:
				System.out.println("일련번호를 입력해주세요.");
				num = getInt();
				System.out.println("제목을 입력해주세요.");
				String title = getString();
				System.out.println("작가를 입력해주세요.");
				String author = getString();
				
				lib.insertBook(num, title, author, false);
				break;
			case 2:
				System.out.println("삭제할 책의 일련번호를 입력해주세요.");
				num = getInt();
				lib.deleteBook(num);
				break;
			case 0:
				// 로그아웃
				return;
			default:
				System.out.println("메뉴를 확인 후 다시 입력해주세요.");
			}
			
			
//			if(menu == 1) {
//				// 등록할 책 정보 입력
//				System.out.println("책 정보를 입력해주세요.");
//				System.out.print("넘버 : ");
//				int no = app.getInt();
//				System.out.print("제목 : ");
//				String title = app.getString();
//				System.out.print("저자 : ");
//				String author = app.getString();
//				boolean isRent = false;
//				
//				// 책 등록
//				lib.insertBook(no, title, author, isRent);
//			}else if(menu == 2) {
//				System.out.println("삭제할 책의 넘버를 입력하세요.");
//				int index = app.getInt();
//				// 책 삭제
//				lib.deleteBook(index);
//			}else if(menu == 0) {
//				break;
//			}else {
//				System.err.println("메뉴를 확인해주세요.");
//			}
			
		}
	}
	
	private void memberMenu(Library lib) {
		// 사용자
		// 메뉴별로 작업 수행
		while(true) {
			// 도서 목록 출력
			lib.info();
			System.out.println("1. 도서대여 2.도서반납 0. 로그아웃 q. 프로그램종료");
			System.out.println("메뉴를 입력해주세요.");
			int menu = getInt();
			if(menu == 1) {
				System.out.println("도서 번호를 입력해주세요.");
				int index = getInt();
				lib.rentBook(index);
			}else if(menu == 2) {
				System.out.println("도서 번호를 입력해주세요.");
				int index = getInt();
				lib.returnBook(index);
			}else if(menu == 0) {
				// 로그아웃(로그인으로 이동)
				break;
			}else {
				System.err.println("메뉴를 확인해주세요.");
				
			}
			
		}
	}
	/**
	 * 사용자로부터 숫자를 입력받습니다.
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
				System.err.println("입력 중 오류가 발생하였습니다.\n숫자를 입력해주세요.");
			}
		}
		return i;
	}
	
	/**
	 * 사용자로부터 문자를 입력받습니다.
	 * @return
	 */
	public String getString() {
		String res = "";
		while(true) {
			try {
				res = sc.next();
				try {
					// String입력값이 숫자로 변환 가능하면 다시 입력받는 로직
					Integer.parseInt(res);
					System.err.println("문자를 입력해주세요.");
					continue;
				} catch (Exception e) {

				}
				if(res.equalsIgnoreCase("q")) {
					System.out.println("프로그램 종료");
					System.exit(0);
				}
				return res;
			} catch (Exception e) {
				System.err.println("입력 중 오류가 발생하였습니다.\n문자를 입력해주세요.");
			}
		}
	}
}
