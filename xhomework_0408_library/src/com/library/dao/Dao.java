package com.library.dao;

import java.util.List;

import com.library.vo.Book;

public interface Dao {

	List<Book> getList();

	boolean insert(Book book);

	boolean delete(int no);

	boolean update(int no);

}
