package com.library2.dao;

import java.util.List;

import com.library2.vo.Book;

public interface Dao {
	List<Book> getList();

	boolean saveFile(List<Book> list);
}
