package com.library.service;

import java.util.List;

import com.library.dao.BookDao;
import com.library.vo.Book;

public class BookService {
	BookDao bookDao = new BookDao();
	
	/**
	 * 책 리스트를 조회합니다.
	 * @return
	 */
	public List<Book> getList(){
		List<Book> list = bookDao.getList();
		
		for(Book book : list) {
			System.out.println(book.toString());
		}
		return list;
	}
	
	/**
	 * 책을 대여합니다.
	 * @param book
	 */
	public void insertBook(Book book) {
		int res = bookDao.insertBook(book);
		if(res > 0) {
			System.out.println("도서 등록 성공");
			// 도서 목록 출력
			getList();
		}else {
			System.err.println("도서 등록 중 오류 발생");
		}
	}

	public void deleteBook(String deleteTitle) {
		List<Book> list = bookDao.getList();
		// 리스트에 일치하는 제목의 책이 있는지
		for(Book book : list) {
			if(book.getTitle().equals(deleteTitle)) {
				int res = bookDao.deleteBook(deleteTitle);
				if(res > 0) {
					System.out.println(deleteTitle + "이(가) 삭제되었습니다.");
					getList();
					return ;
				}else {
					System.err.println("도서 삭제 중 오류 발생");
					return ;
				}
			}
		}
		System.err.println("입력한 제목의 책은 존재하지 않습니다.");
		
	}

	public void deleteBook(int no) {
		List<Book> list = bookDao.getList();
		// 리스트에 일치하는 제목의 책이 있는지
		for(Book book : list) {
			if(book.getNo() == no) {
				int res = bookDao.deleteBook(no);
				if(res > 0) {
					System.out.println(book.getTitle() + "이(가) 삭제되었습니다.");
					getList();
					return ;
				}else {
					System.err.println("도서 삭제 중 오류 발생");
					return ;
				}
			}
		}
		System.err.println("입력한 제목의 책은 존재하지 않습니다.");
		
	}

	public void rentBook(int no) {
		List<Book> list = bookDao.getList();
		
		for(Book book : list) {
			if(book.getNo() == no) {
				if(book.getRentYN().equals("N")) {
					int res = bookDao.rentBook(no);
					System.out.println(book.getTitle() + "를(을) 대여하였습니다.");
					getList();
					return;
				}else {
					System.err.println("이미 대여중인 책 입니다.");
					return;
				}
			}
		}
		System.err.println("존재하지 않는 책 입니다.");	
	}
}
