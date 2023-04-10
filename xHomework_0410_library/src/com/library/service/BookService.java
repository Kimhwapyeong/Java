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

}
