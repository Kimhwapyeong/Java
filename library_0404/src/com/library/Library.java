package com.library;
//0404
import java.util.List;

import com.library.dao.Dao;
import com.library.dao.DataBaseDao;
import com.library.dao.FileDao;
import com.library.vo.Book;

public class Library {
	
	// 필드(전역변수) : 클래스 내부에서 어디서든 사용할 수 있다.
	private List<Book> list;
	// FileDao 또는 DatabaseDao로 생성할 수 있도록
	// 인터페이스 타입으로 선언
	private Dao dao = new FileDao();
	
	public Library() {
		// 파일을 읽어서 리스트를 초기화 합니다.
		list = dao.getList();
	}
	
	public Library(String type) {
		if(type.equalsIgnoreCase("DB")) {
			dao = new DataBaseDao();
		}
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
		
		Book book = new Book(no, title, author, isRent);
		
		list.add(book);
		// 리스트를 파일에 저장
		boolean res = dao.saveFile(list);
		// 이러한 처리가 없으면 list와 파일의 저장된 데이터가 다를 수 있다.
		if(res) {
			return true;
		} else {
			list.remove(book);
			return false;
		}
	}
	
	@Override
	public String toString() {
		// 리턴값을 주기 위함
		String listStr = "";
		for(Book book : list) {
			listStr += book.toString() + "\n";
		}
		
		return listStr;
	}
}
