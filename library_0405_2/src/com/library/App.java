package com.library;

import java.util.Scanner;

public class App {

	Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		Library lib = new Library();
		App app = new App();
		
		while(true) {   // 로그인 반복문
			System.out.print("id : ");
			String id = app.getString();
			
			if(id.equalsIgnoreCase("admin")) {
				System.out.println("관리자 메뉴 입니다.");
				adminOut:
				while(true) {   // 관리자메뉴 반복문
					System.out.println("1. 도서추가 2. 도서삭제 0.로그아웃 q.프로그램 종료");
					System.out.print("메뉴를 입력해주세요 : ");
					int menu = app.getInt();
					int no = 0;
					switch(menu) {
					case 1:
						System.out.print("일련번호 : ");
						no = app.getInt();
						System.out.print("제목 : ");
						String title = app.getString();
						System.out.print("저자 : ");
						String author = app.getString();
						
						lib.insertBook(no, title, author);
						break;
					case 2:
						System.out.print("삭제할 책 일련번호 : ");
						no = app.getInt();
						
						lib.deleteBook(no);
						break;
					case 0:
						
						break adminOut;
					default:
						System.out.println(menu + "은(는) 없는 메뉴 입니다.");
						break;
					}				
				}
			}else {
				System.out.println("사용자 메뉴 입니다.");
			}
		}
		
		
	
	
		
			
	
	}
	
	public int getInt() {
		while(true) {
			String str = sc.next();
			if(str.equalsIgnoreCase("q")) {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}
			try {
				int i = Integer.parseInt(str);
				return i; 
			} catch (Exception e) {
				System.err.println("숫자를 입력해주세요.");
			}
		}
	}
	
	public String getString() {
		while(true) {
			String str = sc.next();
			if(str.equalsIgnoreCase("q")) {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}
			try {
				Integer.parseInt(str); 
				System.out.println("문자를 입력해주세요.");
			} catch (Exception e) {
				return str;
			}
		}
	}
	
}
