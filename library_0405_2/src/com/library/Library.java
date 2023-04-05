package com.library;

import java.util.List;

import com.library.dao.Dao;
import com.library.dao.FileDao;
import com.library.vo.Book;

public class Library {
	List<Book> list = null;
	
	Dao dao = new FileDao();
	
	public Library() {
		list = dao.getList();
		System.out.println(toString());
	}
	
	public boolean insertBook(int no, String title, String author) {
		
		// 일련번호 중복 확인
		for(Book book : list) {
			if(book.getNo() == no) {
				System.err.println("중복되는 일련번호가 존재합니다.");
				return false;
			}
		}
		
		try {
			Book book = new Book(no, title, author, false);
			list.add(book);
			boolean res = dao.ListToFile(list);
			if(res) {
				System.out.println(book.getTitle() + " - 도서 등록 성공");
				System.out.println(toString());
				return true;
			}else {
				list.remove(book);
				System.err.println("도서 등록 실패(파일에 저장중 오류 발생)");
				System.out.println(toString());
				return false;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return false;
	}
	
	public boolean deleteBook(int no) {
		
		for(Book book : list) {
			if(book.getNo() == no) {
				list.remove(book);
				boolean res = dao.ListToFile(list);
				if(res) {
					System.out.println(book.getTitle() + " - 도서 삭제 성공");
					System.out.println(toString());
					return true;
				}else {
					list.add(book);
					System.err.println("도서 삭제 실패(파일에 저장중 오류 발생)");
					System.out.println(toString());
					return false;
				}
			}
		}
		return false;
	}
	
	public boolean rentBook(int no) {
		
		
		
		
		return false;
	}
	
	@Override
	public String toString() {
		String str = "";
		for(Book book : list) {
			str += book.toString() + "\n";
		}
		return str;
	}
	
}
