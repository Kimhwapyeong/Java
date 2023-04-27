package com.library.controller;

import java.util.Scanner;

import com.library.service.BookService;
import com.library.service.MemberService;
import com.library.vo.Book;
import com.library.vo.Member;

/**
 * 도서 대여 시스템
 * 
 * ▶ 사용자로부터 입력을 받아서 
 * 	  	사용자 요청에 알맞는 서비스 로직을 호출합니다.
 * ▶ 로그인
 * 	- 관리자
 * 		메뉴 : 도서등록, 도서삭제, 사용자등록, 사용자삭제
 * 	- 사용자
 * 		메뉴 : 도서대여, 도서반납, 도서대여현황
 * @author user
 *
 */
public class LibraryController {
	
	MemberService memberService = new MemberService();
	BookService bookService = new BookService();
	Scanner sc = new Scanner(System.in);
	
	public void start() {
		
		System.out.println("----------------------");
		System.out.println("도서관에 오신것을 환영합니다.");
		System.out.println("----------------------");
		System.out.println("이용을 위해 로그인해주세요.");
		while(true) {
			Member member = login();
			
			bookService.getList();
			
			if(member.getAdminYN().equalsIgnoreCase("Y")) {
				adminMenu();
			}else {
				userMenu();
			}
			
		}

	}
	
	private void adminMenu() {
		System.out.println("관리자 메뉴 입니다.");
		while(true) {
			System.out.println("1. 도서등록 2. 도서삭제 3. 사용자등록 "
					+ "4. 사용자삭제 5. 로그아웃 6. 프로그램 종료");
			System.out.print("메뉴 선택> ");
			int menu = getInt();
			
			switch(menu) {
			case 1 :
				System.out.println("--- 도서 등록 ---");
				System.out.print("책 제목 > ");
				String title = getString();
				System.out.print("작가 > ");
				String author = getString();
				
				Book book = new Book(title, author);
				bookService.insertBook(book);
				break;
			case 2 :
				System.out.println("--- 도서 삭제 ---");
				System.out.println("1. 일련번호로 삭제 2. 제목으로 삭제");
				System.out.print("삭제 방법 선택 > ");
				int cho = getInt();
				if(cho == 1) {
					System.out.println("일련번호 > ");
					int no = getInt();
					bookService.deleteBook(no);
				}else if(cho == 2) {
					System.out.println("책 제목 > ");
					String deleteTitle = getString();
					bookService.deleteBook(deleteTitle);
				}else {
					System.err.println("1 또는 2를 입력해주세요.");
				}
				
				break;
			case 3 :
				System.out.println("--- 사용자 등록 ---");
				System.out.print("아이디 > ");
				String id = getString();
				System.out.print("비밀번호 > ");
				String pw = getString();
				System.out.print("이름 > ");
				String name = getString();
				System.out.print("관리자여부 > ");
				String adminYN = getString();
				
				Member member = new Member(id, pw, name, adminYN, "Y", "B");
				memberService.insertMember(member);
				break;
			case 4 :
				System.out.println("--- 사용자 삭제 ---");
				System.out.print("삭제할 아이디 > ");
				String deleteId = getString();
				
				memberService.deleteMember(deleteId);
				break;
			case 5 :
				
				return;
			case 6 :
				System.out.println("프로그램 종료");
				System.exit(0);
				
				break;
			default :
				System.out.println("메뉴를 확인해주세요.");
				break;
			}
		}
		
		
	}

	private void userMenu() {
		System.out.println("사용자 메뉴 입니다.");
		while(true) {
			System.out.println("1. 도서대여 2. 도서반납 3. 도서대여현황 4. 로그아웃 5. 프로그램 종료");
			
			System.out.print("메뉴 선택> ");
			int menu = getInt();
			
			switch(menu) {
			case 1 :
				System.out.print("대여할 책의 일련번호 > ");
				int no = getInt();
				bookService.rentBook(no);
				
				break;
			case 2 :
				
				break;
			case 3 :
				
				break;
			case 4 :
				
				return;
			case 5 :	
				System.exit(0);
				break;
			default :
				
				break;
			}
			
		}
		
	}


	public Member login() {
		while(true) {
			System.out.print("아이디> ");
			String id = getString();
			System.out.print("비밀번호> ");
			String pw = getString();
			Member member = memberService.login(id, pw);
			
			if(member != null) {
				return member;			
			}
		}
	}
	
	public String getString() {
		while(true) {
			String str = sc.next();
			if(str.equalsIgnoreCase("q")) {
				System.out.println("프로그램 종료");
				System.exit(0);
			}
			return str;
		}
	}


	public int getInt() {
		while(true) {
			String str = sc.next();
			if(str.equalsIgnoreCase("q")) {
				System.out.println("프로그램 종료");
				System.exit(0);
			}
			int i = 0;
			try {
				i = Integer.parseInt(str);
				return i;
			} catch (Exception e) {
				System.err.println(str + "는(은) 숫자가 아닙니다.");
			}	
		}
	}
}
