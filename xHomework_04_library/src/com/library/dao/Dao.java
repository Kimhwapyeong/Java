package com.library.dao;

import java.util.List;

import com.library.vo.Book;

public interface Dao {
	// 인터페이스이기 때문에 추상메소드로 선언
	// 파일로부터 데이터를 읽어서 리스트에 담아 반환
	List<Book> getList();

	boolean saveFile(List<Book> list);
}
