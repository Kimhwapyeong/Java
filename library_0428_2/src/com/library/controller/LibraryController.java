package com.library.controller;

import java.util.Scanner;

import com.library.service.BookService;
import com.library.service.MemberService;
import com.library.service.RentService;
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
	RentService rentService = new RentService();
	Scanner sc = new Scanner(System.in);
	
	/**
	 * 도서관리 시스템 시작
	 * 
	 */
	public void library() {
		System.out.println("------------------");
		System.out.println("도서관리 시스템 v1.0");
		System.out.println("------------------");
		
		// 로그인
		Member member = login();
		
		if(member.getAdminYN().equalsIgnoreCase("y")) {
			// 관리자 메뉴 실행
			adminMenu();
		}else {
			// 사용자 메뉴 실행
			userMenu(member);
		}
		
		
	}
	
	/**
	 * 사용자 메뉴
	 */
	private void userMenu(Member member) {
		while(true) {
			bookService.getList();
			System.out.println("================ 사용자 메뉴 ================");
			System.out.println("1. 도서대여 2. 도서반납  3. 도서대여현황 0. 로그아웃 Q. 프로그램 종료");
			System.out.println("==========================================");
			System.out.println("메뉴를 선택해주세요.");
			int menu = getInt();
			int no = 0;
			switch(menu) {
			case 1:
				// 도서 대여
				System.out.print("대여할 도서의 일련번호 > ");
				no = getInt();
				rentService.rentBook(no, member.getId());
				break;
			case 2:
				// 도서 반납
				System.out.print("반납할 도서의 일련번호 > ");
				no = getInt();
				rentService.returnBook(no);
				break;
			case 3:
				
				break;
			case 0:
				// 로그아웃
				return;
			default:
				System.out.println("메뉴를 잘못 선택하셨습니다.");
				break;
			}
			
		}
		
	}
	
	/**
	 * 관리자 메뉴
	 */
	private void adminMenu() {
		while(true) {
			// 도서 목록을 출력
			bookService.getList();
			System.out.println("================ 관리자 메뉴 ================");
			System.out.println("1. 도서등록 2. 도서삭제 3. 사용자등록 4. 사용자삭제"
					+ " 0. 로그아웃 q. 프로그램 종료");
			System.out.println("==========================================");
			System.out.println("메뉴를 선택해주세요.");
			int menu = getInt();
			String id = "";
			switch(menu) {
			case 1:
				// 도서 등록
				// 사용자로부터 입력 받기 - 도서명, 작가명
				// Controller -> service -> dao -> data 처리
				System.out.print("책 제목 > ");
				String title = getString();
				System.out.print("작가 > ");
				String author = getString();
				bookService.insertBook(title, author);
				break;
			case 2:
				// 도서 삭제
				// 사용자로부터 입력 받기 - 도서 일련번호
				System.out.println("삭제할 책의 일련번호 > ");
				int no = getInt();
				bookService.deleteBook(no);
				break;
			case 3:
				// 사용자 등록
				// 사용자로 부터 입력 받기
				while(true) {
					System.out.print("아이디 > ");
					id = getString();
					if(memberService.idCheck(id)) {
						System.out.print("비밀번호 > ");
						String pw = getString();
						System.out.print("이름 > ");
						String name = getString();
						System.out.print("관리자 여부(관리자이면 Y) > ");
						String adminYNStr = getString();
						String adminYN = adminYNStr.equalsIgnoreCase("Y")?"Y":"N";
						
						memberService.insertMember(id, pw, name, adminYN);
						break;
//					}else {
//						System.err.println("중복되는 아이디가 존재합니다.");
					}	
				}
				break;
			case 4:
				// 사용자 삭제
				System.out.print("삭제할 아이디 > ");
				id = getString();
				memberService.deleteMember(id);
				
				break;
			case 0:
				
				return;
			default:
				System.out.println("메뉴를 잘못 선택하셨습니다.");
				break;
			}
			
		}
		
	}

	public Member login() {
		while(true) {
			System.out.println("< 로그인 >");
			System.out.println("id를 입력해주세요.");
			String id = getString();
			System.out.println("pw를 입력해주세요.");
			String pw = getString();
			
			Member member = memberService.login(id, pw);
			// 로그인 성공 - member 객체를 반환
			if(member != null) {
				return member;
			}
		}
	}
	
	
	
	/**
	 * 사용자의 입력을 받아 문자열을 반환
	 * 문자가 입력될 때까지
	 * q,Q 입력 되면 종료
	 * @return
	 */
	private String getString() {
//		while(true) {
//										// while을 왜 하라고 하셨을까
//		}
		String str = sc.next();
		if(str.equalsIgnoreCase("q")) {
			System.out.println("프로그램 종료");
			System.exit(0);
		}
		
		return str;
		
	}
	
	/**
	 * 사용자의 입력을 받아 숫자를 반환
	 * 숫자가 입력될 때까지
	 * q,Q 입력 되면 종료
	 * @return
	 */
	private int getInt() {
		while(true) {
			String str = sc.next();
			int i = 0;
			// q, Q가 입력된 경우 정상 종료
			if(str.equalsIgnoreCase("q")) {
				System.out.println("프로그램 종료");
				System.exit(0);
			}
			try {
				i = Integer.parseInt(str);
				return i;			
				
			} catch (Exception e) {
				System.err.println(str + "은(는) 입력 불가능 합니다.");
				System.err.println("숫자를 입력해주세요.");
			}
		}
	}
}






















