package com.library.dao;
//0403
import java.util.List;
import com.library.vo.Book;

public interface Dao {
		
	// 책 리스트를 조회
	List<Book> getBookList();
	
	// 관리자 메뉴
	// 신규 도서 등록
	int insertBook(Book book);
	
	// 도서 삭제
	int deleteBook(Book book);
	
	// 도서 정보 업데이트
	int updateBook(Book book);
}
