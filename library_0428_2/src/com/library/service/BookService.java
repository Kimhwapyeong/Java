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

	public void insertBook(String title, String author) {
		Book book = new Book(title, author);
		int res = bookDao.insertBook(book);
		if(res > 0) {
			System.out.println(book.getTitle() + "이(가) 등록되었습니다.");
//			getList();
		}else {
			System.out.println("책 등록 중 오류 발생");
		}
		
	}

//	public void deleteBook(int no) {
//		List<Book> list = bookDao.getList();
//		// 입력받은 일련번호의 책 존재여부 확인
//		for(Book book : list) {
//			if(book.getNo() == no) {
//				int res = bookDao.deleteBook(no);
//				if(res > 0) {
//					System.out.println(book.getTitle() + "이(가) 삭제되었습니다.");
////					getList();
//					return;					
//				}else {
//					System.err.println("책 삭제 중 오류 발생");
//					return;
//				}
//			}
//		}
//		System.err.println("일치하는 일련번호의 도서가 존재하지 않습니다.");
//		
//	}
	
	public void deleteBook(int no) {
		if(bookDao.noCheck(no)) {
			int res = bookDao.deleteBook(no);
			if(res > 0) {
				System.out.println(res + "건 삭제되었습니다.");
//				return;					
			}else {
				System.err.println("책 삭제 중 오류 발생");
//				return;
			}
		}else {
			System.err.println("일치하는 일련번호의 책이 존재하지 않습니다.");
		}
	}

	public void rentBook(int no) {
		if(bookDao.noCheck(no)) {
			if(bookDao.rentCheck(no)) {
				int res = bookDao.rentBook(no);		
				if(res > 0) {
					System.out.println("대여 완료");
//					return;
				}else {
					System.err.println("책 대여 중 오류 발생");
//					return;
				}
			}else {
				System.err.println("이미 대여중인 책 입니다.");
//				return;
			}
		}else {
			System.err.println("일치하는 일련번호의 책이 존재하지 않습니다.");
		}
	}

	public void returnBook(int no) {
		if(bookDao.noCheck(no)) {
			if(!bookDao.rentCheck(no)) {
				int res = bookDao.returnBook(no);
				if(res > 0) {
					System.out.println("반납완료");
//					return;
				}else {
					System.err.println("책 반납 중 오류 발생");
//					return;
				}
			}else {
				System.err.println("대여되지 않은 책 입니다.");
//				return;
			}
		}else {
			System.err.println("일치하는 일련번호의 책이 존재하지 않습니다.");
		}
	}
}




















