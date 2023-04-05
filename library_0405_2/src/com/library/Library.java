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
		
		for(Book book : list) {
			if(book.getNo() == no) {
				if(!book.isRent()) {
					book.setRent(true);
					boolean res = dao.ListToFile(list);
					if(res){
						System.out.println(book.getTitle() + "을(를) 대여하였습니다.");
						System.out.println(toString());
						return true;
					}else {
						System.err.println("대여 실패(파일에 저장중 오류 발생)");
						System.out.println(toString());
						return false;
					}
				}else {
					System.err.println(book.getTitle() + "은(는) 이미 대여중인 책입니다.");
					return false;
				}
			}
		}
		System.err.println("해당하는 일련번호의 도서가 존재하지 않습니다.");
		return false;
	}
	
	public boolean rentBook(String title) {
		
		for(Book book : list) {
			if(book.getTitle().equals(title)) {
				if(!book.isRent()) {
					book.setRent(true);
					boolean res = dao.ListToFile(list);
					if(res){
						System.out.println(book.getTitle() + "을(를) 대여하였습니다.");
						System.out.println(toString());
						return true;
					}else {
						book.setRent(false);
						System.err.println("대여 실패(파일에 저장중 오류 발생)");
						System.out.println(toString());
						return false;
					}
				}else {
					System.err.println(book.getTitle() + "은(는) 이미 대여중인 책입니다.");
					return false;
				}
			}
		}
		System.err.println("해당하는 제목의 도서가 존재하지 않습니다.");
		return false;
	}
	
	public boolean returnBook(int no) {
		
		for(Book book : list) {
			if(book.getNo() == no) {
				if(book.isRent()) {
					book.setRent(false);
					boolean res = dao.ListToFile(list);
					if(res) {
						System.out.println(book.getTitle() + "을(를) 반납하였습니다.");
						System.out.println(toString());
						return true;
					}else {
						book.setRent(true);
						System.out.println("반납 실패(파일에 저장중 오류 발생)");
						System.out.println(toString());
						return false;
					}
				}else {
					System.err.println(book.getTitle() + "은(는) 대여되지 않은 책 입니다.");
					return false;
				}
			}
		}
		System.out.println("해당하는 일련번호의 도서가 존재하지 않습니다.");
		return false;
	}
	
	public boolean returnBook(String title) {
		
		for(Book book : list) {
			if(book.getTitle().equals(title)) {
				if(book.isRent()) {
					book.setRent(false);
					boolean res = dao.ListToFile(list);
					if(res) {
						System.out.println(book.getTitle() + "을(를) 반납하였습니다.");
						System.out.println(toString());
						return true;
					}else {
						book.setRent(true);
						System.out.println("반납 실패(파일에 저장중 오류 발생)");
						System.out.println(toString());
						return false;
					}
				}else {
					System.err.println(book.getTitle() + "은(는) 대여되지 않은 책입니다.");
					return false;
				}
			}
		}
		System.err.println("해당하는 제목의 도서가 존재하지 않습니다.");
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
