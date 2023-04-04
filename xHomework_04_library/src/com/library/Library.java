package com.library;

import java.util.List;

import com.library.dao.Dao;
import com.library.dao.DataBaseDao;
import com.library.dao.FileDao;
import com.library.vo.Book;

public class Library {
	
	// 북타입을 담는 리스트 list 선언
	private List<Book> list;
	
	private Dao dao;
	
	// 기본생성자
	public Library() {
		
	}
	// 생성자 
	// 매개값으로 입력받은 값이 DB이면 DataBaseDao 객체를 생성해서 dao에 담아주고,
	// 아니면 FileDao 객체를 생성해서 dao에 담는다
	public Library(String DBtype) {
		if("DB".equalsIgnoreCase(DBtype)) {
			dao = new DataBaseDao();
		}else {
			dao = new FileDao();
		}
		list = dao.getList();
	}
	
	public boolean insert(int no, String title, String author, boolean isRent) {
		// 외부로부터 받은 데이터를 바탕으로 책을 생성하고 list에 추가

		// 일련번호 중복 체크
		for(Book book : list) {
			if(book.getNo() == no) {
				System.err.println("중복되는 일련번호가 존재합니다.");
				return false;
			}
		}
		// 중복된 일련번호가 없으면 입력된 정보로 책을 만들어서 list에 추가
		Book book = new Book(no, title, author, isRent);
		// 리스트에 책을 추가
		list.add(book);
		
		boolean res = dao.saveFile(list);
		
		if(res) {
			return true;
		}else {
			// saveFile메소드의 반환값이 false이면 리스트에서 방금 추가한 책을 삭제
			list.remove(book);
			return false;
		}
	
	}
	
	@Override
	public String toString() {
		// 반환을 위한 변수
		String str = "";
		for(Book book : list) {
			str += book.toString() + "\n";
		}
		
		return str;
	}
}

















