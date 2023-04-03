package homework_0403.library;

import java.util.ArrayList;
import java.util.List;

import homework_0403.library.dao.Dao;
import homework_0403.library.dao.DataBaseDao;
import homework_0403.library.dao.FileDao;
import homework_0403.library.vo.Book;

public class Library {
	// 도서 리스트 생성(메모리에서 관리 => 종료시 증발)
	private List<Book> bookList = new ArrayList<>();
	
	// data access object
	// 데이터의 입출력(보관)
	private Dao dao = null;
	
	// Library 생성 시 4개의 책 생성
	// 매개값으로 데이터 저장소 선택
	public Library(String confDao) {
		if("db".equalsIgnoreCase(confDao)) {
			dao = new DataBaseDao();
		}else {
			dao = new FileDao();
		}
		bookList.add(new Book(1, "책1", "작가1"));
		bookList.add(new Book(2, "책2", "작가2"));
		bookList.add(new Book(3, "책3", "작가3"));
		bookList.add(new Book(4, "책4", "작가4"));
	}
	
	/**
	 * 신규 도서 추가
	 * @param no
	 * @param title
	 * @param author
	 * @return
	 */
	public boolean insertBook(int no, String title, 
			String author) {
		try {
			Book book = new Book(no, title, author);
			bookList.add(book);
			dao.insertBook(book);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	/**
	 * 책 삭제
	 * @param index
	 * @return
	 */
	public boolean deleteBook(int index) {
		for(Book book : bookList) {
			if(book.getNo() == index) {
				bookList.remove(book); // 매개값에index를 넣어주면 안된다
				dao.deleteBook(book);
				return true;
			}
		}
		System.err.println("일련번호에 해당하는 도서를 찾지 못하였습니다.");
		return false;
	}
	
	/**
	 * 책 대여
	 * @param index
	 * @return
	 */
	public boolean rentBook(int index) {
		for(Book book : bookList) {
			// 입력한 일련번호가 존재하는 경우
			if(book.getNo() == index) {
				if(!book.isRent()) {
					book.setRent(true);
					dao.updateBook(book);
					return true;
				}else {
					System.out.println("이미 대여중인 책 입니다.");
					return false;
				}
			}
		}
		System.err.println("일련번호에 해당하는 도서를 찾지 못하였습니다.");
		return false;
	}
	
	/**
	 * 책 반납
	 * @param index
	 * @return
	 */
	public boolean returnBook(int index) {
		for(Book book : bookList) {
			if(book.getNo() == index) {
				if(book.isRent()) {
					book.setRent(false);
					dao.updateBook(book);
					return true;
				}else {
					System.out.println("대여하지 않은 도서 입니다.");
				}
			}
		}
		System.out.println("일련번호에 해당하는 도서를 찾지 못하였습니다.");
		return false;
	}
	
	public void info() {
		System.out.println("========도서 목록=======");
		for(Book book : bookList) {
			book.info();
		}
		System.out.println("======================");
	}
}













