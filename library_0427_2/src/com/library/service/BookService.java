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
}
