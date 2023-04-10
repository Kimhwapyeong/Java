package com.library.controller;

import java.util.Scanner;

import com.library.service.BookService;
import com.library.service.MemberService;
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















