package com.library;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import com.library.dao.Dao;
import com.library.dao.DataBaseDao;
import com.library.dao.FileDao;
import com.library.vo.Book;

public class Library {
	List<Book> list = null;
	
	Dao dao;
	
	public Library(String dataType) {
		if(dataType.equalsIgnoreCase("db")) {
			dao = new DataBaseDao();
		}else {
			dao = new FileDao();
		}
		list = dao.getList();
		System.out.println(toString());
	}

	
	
	@Override
	public String toString() {
		System.out.println("====== 책 목록 ======");
		String str = "";
		
		// 정렬
		//Collections.sort(list);
		
		for(Book book : list) {
			str += book.info() + "\n";
		}
		return str;
	}
	
	public boolean insert(int no, String title, String author, boolean isRent, Date regDate, Date editDate) {
		// 일련번호 중복 체크
		for(Book book : list) {
			if(book.getNo()==no) {
				System.err.println("중복되는 일련번호가 존재합니다.");
				return false;
			}
		}
		// 책 생성
		Book book = new Book(no, title, author, isRent, regDate, editDate);
		// 책 추가
		list.add(book);
		// dao에 데이터 추가 성공 실패 여부 확인
		boolean res = dao.insert(book);
		
		if(res) {
			System.out.println("'" + title + "' 도서 추가 완료\n");
			System.out.println(toString());
			return true;
		}else {
			// 데이터 저장에 실패했으면 다시 북 삭제
			list.remove(book);
			System.err.println("파일 저장 중 오류 발생");
			return false;
		}
	}
	
	public boolean delete(int no) {
		for(Book book : list) {
			if(book.getNo() == no) {
				// remove() 매가값에 no를 넣으면 안된다.
				// 매개값으로 들어간 인덱스의 객체를 지워주기 때문.
				list.remove(book);
				boolean res = dao.delete(no);
				if(res) {
					System.out.println("'" + book.getTitle() + "' 도서 삭제 완료\n");
					System.out.println(toString());
					return true;
				}else {
					list.add(book);
					System.err.println("파일 저장 중 오류 발생");
					return false;
				}
			}
		}
		System.err.println("일치하는 일련번호가 없습니다.");
		return false;
	}
	
	public boolean rentBook(int no) {
		for(Book book : list) {
			if(book.getNo()==no) {
				if(!book.isRent()) {
					book.setRent(true);
					boolean res = dao.update(no);
					if(res) {
						System.out.println("'" + book.getTitle() + "' 대여 완료\n");
						System.out.println(toString());
						return true;
					}else {
						book.setRent(false);
						System.err.println("파일 저장 중 오류 발생");
						return false;
					}
				}else {
					System.err.println("'" + book.getTitle() + "' 은(는) 이미 대여중인 책 입니다.");
					return false;
				}
			}
		}
		System.err.println("일치하는 일련번호가 없습니다.");
		return false;
	}
	
	public boolean returnBook(int no) {
		for(Book book : list) {
			if(book.getNo()==no) {
				if(book.isRent()) {
					book.setRent(false);
					boolean res = dao.update(no);
					if(res) {
						System.out.println("'" + book.getTitle() + "' 반납 완료\n");
						System.out.println(toString());
						return false;
					}else {
						System.err.println("파일 저장 중 오류 발생");
						book.setRent(true);
						return false;
					}
				}else {
					System.err.println("대여 된 책이 아닙니다. 관리자에게 문의해주세요.");
					return false;
				}
			}
		}
		System.err.println("일치하는 일련번호가 없습니다.");
		return false;
	}
	
}























