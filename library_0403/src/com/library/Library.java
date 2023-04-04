package com.library;
//0403
import java.util.ArrayList;
import java.util.List;

import com.library.dao.Dao;
import com.library.dao.DataBaseDao;
import com.library.dao.FileDao;
import com.library.vo.Book;

public class Library {
	// 도서 리스트 생성 - 메모리에서 관리(프로그램 종료시 증발)
	private List<Book> bookList = new ArrayList<>();
	// data access object
	// 데이터의 입출력 (보관)
	private Dao dao = null;
	
	/**
	 * 생성자
	 */
	public Library(String confDao) {
		if("db".equals(confDao)) {
			dao = new DataBaseDao();
		}else {
			dao = new FileDao();
		}
		// 책의 리스트를 조회 (파일 또는 DB를 이용해서 조회)
		// 책을 생성해서 리스트에 담아줄게요
		bookList = dao.getBookList();
		// 등록된 책 리스트 출력
		System.out.println("라이브러리 생성자");
		System.out.println("도서 목록");
		info();
		
		// TODO : 일련번호가 겹치지 않았으면 좋겠다
		// 데이터베이스를 이용할 경우 번호를 기본키로 사용시
		// 중복된 번호는 입력이 안되므로 오류 발생
//		bookList.add(new Book(1, "책1", "작가1", false));
//		bookList.add(new Book(2, "책2", "작가2", false));
//		bookList.add(new Book(3, "책3", "작가3", false));
//		bookList.add(new Book(4, "책4", "작가4", false));
	}
	
	/**
	 * 신규 도서 추가
	 * @param no
	 * @param title
	 * @param author
	 * @param isRent
	 * @return
	 */
	public boolean insertBook(int no, String title, String author, boolean isRent) {
		for(Book book : bookList) {
			if(book.getNo() == no) {
				System.err.println("중복되는 일련번호가 존재합니다.");
				return false;
			}
		}
		try {
			Book book = new Book(no, title, author, isRent);
			// 신규 책을 생성하여 리스트에 담습니다.
			bookList.add(book);
			// 리스트를 파일에 저장합니다.
			dao.insertBook(bookList);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	/**
	 * 책 대여
	 * 책의 일련번호를 매개변수로 받아서 isRent값을 수정합니다.
	 * @param index
	 * @return
	 */
	public boolean rentBook(int index) {
		for(Book book : bookList) {
			// 사용자가 입력한 일련번호가 존재하는 경우
			if(book.getNo() == index) {
				// 이미 대여중인 경우
				if(!book.isRent()) {
					book.setRent(true);
					dao.updateBook(bookList);
					return true;
				}else {
					System.out.println("이미 대여중인 도서 입니다.");
					return false;
				}
			}
		}
		System.out.println("일련번호에 해당하는 도서를 찾지 못했습니다.");
		return false;
	}

	// 책 반납
	public boolean returnBook(int index) {
		for(Book book : bookList) {
			// 사용자가 입력한 일련번호가 존재하는 경우
			if(book.getNo() == index) {
				// 도서가 대여가능 상태인 경우
				if(book.isRent()) {
					// 대여여부 변경 = 책의 정보를 수정
					book.setRent(false);
					dao.updateBook(bookList);
					return true;
				}else {
					System.out.println("대여되지 않은 도서 입니다.\n관리자에게 문의해주세요.");
					return false;
				}
			}
		}
		System.out.println("일련번호에 해당하는 도서를 찾지 못했습니다.");
		return false;
	}
	
	// 책 삭제
	// 인덱스 번호가 없는 경우 메시지 처리 후 false반환
	public boolean deleteBook(int index) {
		for(Book book : bookList) {
			if(book.getNo() == index) {
				bookList.remove(book);
				dao.deleteBook(bookList);
				return true;
			}
		}
		System.out.println("일련번호에 해당하는 도서를 찾지 못했습니다.");
		return false;
	}
	
	
	
	// 리스트 정보를 출력 
	public void info() {
		System.out.println("도서목록==============");
		// 리스트를 돌면서
		for(Book book : bookList) {
			// 책의 정보를 출력
			book.info();
		}
		System.out.println("====================");
	}
	
	public static void main(String[] args) {
		// 라이브러리 생성
		Library lib = new Library("");
		
		// 도서 리스트 출력
		lib.info();
		
		// 신규 도서 출력
		lib.insertBook(5, "책5", "저자5", false);
		
		lib.info();
		
		// 도서 대여 후 출력
		lib.rentBook(1);
		lib.info();
		
		// 인덱스가 없는 도서 대여
		lib.rentBook(6);
		// 이미 대여된 도서 대여
		lib.rentBook(1);
		// 대여 도서 반납
		lib.returnBook(1);

		lib.info();
		// 대여되지 않은 도서 반납
		lib.returnBook(2);
	}
	
}






















