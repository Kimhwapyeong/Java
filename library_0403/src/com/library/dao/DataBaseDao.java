package com.library.dao;

import java.util.List;

import com.library.vo.Book;

//0403
public class DataBaseDao implements Dao{

	@Override
	public List<Book> getBookList() {
		System.out.println("DB-리스트 조회");
		return null;
	}

	@Override
	public int insertBook(List<Book> list) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteBook(List<Book> list) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateBook(List<Book> list) {
		// TODO Auto-generated method stub
		return 0;
	}

}
