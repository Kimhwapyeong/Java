package com.library;

import java.util.Scanner;

//0405
public class App {
	
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// 라이브러리 생성
		Library lib = new Library("DB");
		// app을 생성하지 않고 getString(), getInt() 메서드를 사용할 수 없다.
		// main메소드는 static메소드(정적메소드)이기 때문에
		// 정적 필드에서는 인스턴스 필드를 사용할 수 없다.
		// 따라서 생성하고 사용해야 한다.
		// getInt(), getString() 선언할 때 static을 붙여
		// 정적 멤버로 만들어주면 생성하지 않고 사용 가능
		App app = new App();
		
		// 로그인 반복 시작
		while(true) {
			// 로그인
			// id를 입력받아서 admin이면 관리자 아니면 사용자
			System.out.print("id : ");
			// 자주 사용하는 로직은 메소드로 빼서 만들면 코드가 간결해진다.
			// 스캐너로부터 입력을 받아서 리턴해주는 역할
			String id = app.getString();
			
			if(id.equalsIgnoreCase("admin")) {
				System.out.println("관리자 메뉴 입니다.");
				adminOutter:
				while(true) {  // 관리자 반복 시작 // TODO 메소드로 빼보자.
					System.out.println("1. 도서등록 2. 도서삭제 0. 로그아웃 q. 프로그램 종료 ");
					System.out.print("메뉴를 입력해주세요 : ");
					int menu = app.getInt();
					int no = 0;
					switch(menu) {
					case 1:
						System.out.print("일련번호: ");
						no = app.getInt();
						System.out.print("책 제목: ");
						String title = app.getString();
						System.out.print("저자: ");
						String author = app.getString();
						
						lib.insertBook(no, title, author, false);
						break;
					case 2:
						System.out.print("삭제할 책의 일련번호: ");
						no = app.getInt();
						lib.deleteBook(no);
						break;
					case 0:
						
						break adminOutter;
					default:
						System.out.println(menu + "는(은) 없는 메뉴입니다.");
						break;
					}
				} // 관리자 반복 끝
				
			}else {
				System.out.println(id + "님 환영합니다.");
				userOutter:
				while(true) {  // 사용자 반복 시작
					System.out.println("1. 도서대여 2. 도서반납 0. 로그아웃 q. 프로그램 종료");
					System.out.print("메뉴를 입력해주세요 : ");
					int menu = app.getInt();
					int num = 0;
					int no = 0;
					String title = "";
					switch(menu) {
					case 1:
						System.out.println("1. 일련번호로 대여, 2. 책 제목으로 대여");
						num = app.getInt();
						if(num == 1) {
							System.out.print("대여할 책의 일련번호: ");
							no = app.getInt();
							lib.rentBook(no);
						}else if(num ==2) {
							System.out.print("대여할 책의 제목: ");
							title = app.getString();
							lib.rentBook(title);
						}else {
							System.out.println("없는 메뉴 입니다.");
						}
						break;
					case 2:
						System.out.println("1. 일련번호로 반납, 2. 책 제목으로 반납");
						num = app.getInt();
						if(num == 1) {
							System.out.print("반납할 책의 일련번호: ");
							no = app.getInt();
							lib.returnBook(no);
						}else if(num == 2) {
							System.out.print("반납할 책의 제목: ");
							title = app.getString();
							lib.returnBook(title);
						}else {
							System.out.println("없는 메뉴 입니다.");
						}
						break;
					case 0:
						
						break userOutter;
					default:
						System.out.println(menu + " 는(은) 없는 메뉴입니다.");
						break;
						
					}
					
				}// 사용자 반복 끝
				
			}
			
		}// 로그인 반복 끝
		
		// 어드민 - 책 등록, 책 삭제
		// 사용자 - 책 대여, 책 반납
		
		
		
		
		
		
		// 책 추가
//		lib.insertBook(1, "책1", "저자1", false);
//		lib.insertBook(2, "책2", "저자2", false);
//		lib.insertBook(3, "책3", "저자3", false);
		
		//System.out.println(lib.toString());
		//System.out.println(lib);  // 같은 결과를 반환한다. 
		// 프린트 메소드에 객체를 넣어주면 객체의 toString()을 반환한다.
		
		// 책 삭제
		//lib.deleteBook(3);
		//System.out.println(lib.toString());
		
//		lib.rentBook(1);
	
//		lib.returnBook(1);
		
		// 일련번호가 중복되는 책 등록
//		lib.insertBook(1, "책", "저자", false);
//		
//		int no = 0;
//		boolean res = false;
		
		//res = lib.rentBook(no);
		//res = lib.returnBook(no);
		
		//lib.returnBook("책4");

		
		
		
		
	}
	
	/**
	 * 사용자로부터 입력받은 문자열을 반환한다.
	 * 숫자가 입력될 경우 다시 요청
	 * Q,q 가 입력될 경우 프로그램 종료
	 * @return
	 */
	public String getString() {
		String str = ""; 
		while(true) {
			try {
				str = sc.next(); 
				// q나 Q가 입력되면 프로그램 종료
				if(str.equalsIgnoreCase("q")) {
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
				}
				// 숫자로 변환 시 숫자로 변경되면 문자를 입력해달라고 다시 요청
				Integer.parseInt(str);
				System.out.println("문자를 입력해주세요.");
			} catch (Exception e) {
				// 문자가 입력된 경우 문자 반환
				return str;
			}
		}
	}
	
	/**
	 * 사용자로부터 정수를 입력받아 반환합니다.
	 * - 문자가 입력되었을 경우 다시 입력받습니다.
	 * - Q, q가 입력되었을 경우 프로그램을 종료합니다.
	 * @return
	 */
	public int getInt() {
		String str = "";
		while(true) {
			try {
				// 사용자 입력 받기
				str = sc.next();
				// Q, q면 종료하기
				if(str.equalsIgnoreCase("q")) {
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
				}
				// 숫자로 변환하기
				int i = Integer.parseInt(str);
				return i;
			} catch (Exception e) {
				// 오류 발생 시 다시 사용자 입력으로
				System.err.println("숫자를 입력해주세요.");
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
