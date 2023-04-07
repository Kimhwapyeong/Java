package com.library.dao;
//0405
import java.util.List;

import com.library.vo.Book;

public interface Dao{
	// 파일로부터 데이터를 읽어서 리스트를 반환한다.
	List<Book> getList();
	
	int delete(int no);
	
	int update(int no);
	
	int insert(Book book);
	// 리스트 파일로 출력합니다
	boolean ListToFile(List<Book> list);
	
}
