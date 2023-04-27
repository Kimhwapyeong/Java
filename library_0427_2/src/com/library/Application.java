package com.library;

import java.util.List;

import com.library.controller.LibraryController;
import com.library.dao.BookDao;
import com.library.dao.MemberDao;
import com.library.vo.Book;
import com.library.vo.Member;

public class Application {
	public static void main(String[] args) {
		
		LibraryController lib = new LibraryController();
		lib.start();
		
//		MemberDao memberDao = new MemberDao();
//		System.out.println(memberDao.login("admin", "1234")); 
		
//		memberDao.insertMember(new Member("user", "1234", "사용자", "N", "Y", "B"));
//		memberDao.deleteMember("user");
		
//		BookDao dao = new BookDao();
		
//		dao.deleteBook(1);
		
//		dao.rentBook(3);
//		dao.insertBook(new Book("책7", "작가7"));

		// getList 테스트
//		List<Book> list = dao.getList();
//		
//		for(Book book : list) {
//			System.out.println(book.toString());
//		}
		
		
	}
	
	
}
