package com.library.service;

import java.util.List;

import com.library.dao.BookDao;
import com.library.vo.BookVo;

public class BookService {
	
	BookDao bookDao = new BookDao();
	
	public void getList() {
		List<BookVo> list = bookDao.getList();
		
		for(BookVo bookVo : list) {
			System.out.println(bookVo.toString());
		}
		
	}

	public void insertBook(BookVo bookVo) {
		
		int res = bookDao.insertBook(bookVo);
		if(res>0) {
			System.out.println(bookVo.getTitle() + "가(이) 추가되었습니다.");
			for(BookVo book : bookDao.getList()) {
				System.out.println(book.toString());
				 
			}
		}else {
			System.err.println("도서 추가 중 오류 발생");
		}
		
	}

	public void deleteBook(int bookNo) {
		
		int res = bookDao.deleteBook(bookNo);
		if(res>0) {
			System.out.println("도서 삭제 완료");
			for(BookVo book : bookDao.getList()) {
				System.out.println(book.toString());
				 
			}
		}else {
			System.err.println("도서 삭제 중 오료 발생");
		}
		
	}

}
