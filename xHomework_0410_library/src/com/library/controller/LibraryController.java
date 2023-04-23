package com.library.controller;

import java.util.Scanner;

import com.library.service.BookService;
import com.library.service.MemberService;
import com.library.vo.BookVo;
import com.library.vo.MemberVo;

public class LibraryController {
	
	BookService bookService = new BookService();
	MemberService memberService = new MemberService();
	
	public void start() {
		System.out.println("======================");
		System.out.println("도서관에 오신 것을 환영합니다.");
		System.out.println("======================");
		
		// 로그인 요청
		MemberVo memberVo = login();
		
		// 도서목록 출력
		bookService.getList();
		
		if("Y".equalsIgnoreCase(memberVo.getAdminYN())) {
			adminMenu();
		}else {
			userMenu();
		}
		
		
	}

	private void adminMenu() {
		System.out.println("관리자 메뉴 ================");
		while(true) {
			System.out.println("1. 도서등록 2. 도서삭제 3. 사용자등록 4. 사용자삭제 0. 이전메뉴 q. 종료");
			System.out.print("메뉴를 입력해주세요> ");
			int menu = getInt();
			
			switch(menu) {
			case 1:
				System.out.print("책 제목> ");
				String title = getString();
				System.out.print("작가> ");
				String author = getString();
				
				bookService.insertBook(new BookVo(title, author, "N"));
				
				break;
			case 2:
				System.out.print("삭제할 책의 일련번호> ");
				int bookNo = getInt();
				
				bookService.deleteBook(bookNo);
				
				break;
			case 3:
				System.out.println("아이디를 입력해주세요.");
				String id = getString();
				System.out.println("비밀번호를 입력해주세요.");
				String pw = getString();
				System.out.println("이름을 입력해주세요.");
				String name = getString();
				System.out.println("관리자 계정은 Y를 입력해주세요.");
				String adminYNstr = getString();
				String adminYN = adminYNstr.equalsIgnoreCase("Y")?"Y":"N";
				
				MemberVo memberVo = new MemberVo(id, pw, name, adminYN);
				
				memberService.insertMember(memberVo);
				break;
			case 4:
				
				
				break;
			case 0:
				
				break;
			default :
				
				break;
			}

		}
		
	}

	private void userMenu() {
		// TODO Auto-generated method stub
		
	}


	private MemberVo login() {
		while(true) {
			System.out.println("아이디를 입력해주세요.");
			String id = getString();
			System.out.println("비밀번호를 입력해주세요.");
			String pw = getString();
			
			MemberVo memberVo = memberService.login(id, pw);
			if(memberVo != null) {
				return memberVo;
			}
		}
	}
	
	public static Scanner sc = new Scanner(System.in);
	public static String getString() {
		String str = "";
		
		str = sc.next();
		if(str.equalsIgnoreCase("q")) {
			System.out.println("프로그램 종료");
			System.exit(0);
		}
		
		return str;
	}
	
	public static int getInt() {
		int i = 0;
		while(true) {
			try {
				String str = "";
				
				str = sc.next();
				if(str.equalsIgnoreCase("q")) {
					System.out.println("프로그램 종료");
					System.exit(0);
				}
				i = Integer.parseInt(str);
				
				return i;
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
}















