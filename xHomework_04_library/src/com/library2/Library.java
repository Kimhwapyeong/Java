package com.library2;

import java.util.List;

import com.library2.dao.Dao;
import com.library2.dao.DataBaseDao;
import com.library2.dao.FileDao;
import com.library2.vo.Book;

public class Library {
	private List<Book> list;
	
	private Dao dao = new FileDao();

	public Library() {
		list = dao.getList();
	}
	public Library(String type) {
		if("db".equalsIgnoreCase(type)) {
			dao = new DataBaseDao();
		}
	}
	
	public boolean insert(int no, String title, String author, boolean isRent) {
		// 외부로부터 받은 데이터를 바탕으로 책을 생성하여 list에 추가
		
		// 일련번호 중복 체크
		for(Book book : list) {
			if(book.getNo() == no) {
				return false;
			}
		}
		
		// 입력받은 데이터로 북 객체 생성하여 list에 추가
		Book book = new Book(no, title, author, isRent);
		list.add(book);
		
		// saveFile 메소드의 반환타입에 따라 list에 놔둘지 삭제할지 결정
		boolean res = dao.saveFile(list);
		if(res) {
			return true;
		}else {
			list.remove(book);
			return false;
		}
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















