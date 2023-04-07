package com.library;

import java.util.Collections;
import java.util.List;

import com.library.dao.Dao;
import com.library.dao.DataBaseDao;
import com.library.dao.FileDao;
import com.library.vo.Book;

//0405
public class Library {
	// 책 목록
	// 필드로 선언시 클래스 내부에서 자유롭게 이용이 가능하다
	// = 전역변수
	List<Book> list = null;
	// 인터페이스를 타입으로 선언 -> 인터페이스의 구현체를 이용해서 생성
	Dao dao = new FileDao();
	
	// 생성자 : 클래스명과 같은 이름, 반환타입이 없다
	public Library() {
		// 리스트 초기화
		list = dao.getList();
		System.out.println(toString());
	}
	
	public Library(String daoType) {
		// 리스트 초기화
		if(daoType.equalsIgnoreCase("db")) {
			dao = new DataBaseDao();
		}
		list = dao.getList();
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		System.out.println("==== 책 목록 ==== lib");
		String info = "";
		
		// 정렬
		Collections.sort(list);
		
		for(Book book : list) {
			info += book.toString() + "\n";
		}
		return info;
	}
	
	/**
	 * 책의 정보를 받아서 리스트에 등록 후
	 * 리스트를 파일로 출력
	 * @param no
	 * @param title
	 * @param author
	 * @param isRent
	 * @return
	 */
	public boolean insertBook(int no, String title, String author, boolean isRent) {
		
		// 일련번호가 중복되면 false 리턴
		for(Book book : list) {
			if(book.getNo() == no) {
				System.err.println("중복되는 일련번호가 존재합니다.\n확인 후 다시 입력해주세요.");
				return false;
			}
		}
		// 책을 생성
		Book book = new Book(no, title, author, isRent);
		// 입력받은 정보로 책(객체)을 생성하여 리스트에 저장
		list.add(book);
		// 리스트를 파일에 저장
		boolean res = dao.ListToFile(list);
		// 파일에 정상적으로 등록되지 않은 경우
		// 리스트에서 제거
		if(res) {
			System.out.println("책이 등록되었습니다.");
			System.out.println(toString());
			return true;
		}else {
			list.remove(book);
			System.err.println("책이 등록되지 않았습니다.\n관리자에게 문의해주세요.");
			return false;
		}
	}

	/**
	 * 책의 일련번호를 입력받아서 리스트에서 삭제합니다.
	 * 리스트를 파일로 출력합니다.
	 * @param no
	 * @return
	 */
	public boolean deleteBook(int no) {

		for(Book book : list) {
			if(book.getNo() == no) {
				list.remove(book);
				boolean res = dao.ListToFile(list);
				// 파일로 출력이 실패할 경우 책을 다시 리스트에 추가한다.
				if(!res) {
					list.add(book);
					System.err.println("파일 출력 도중 오류 발생\n책을 삭제하지 못했습니다. Library.deleteBook()");
					return false;
				}
				System.out.println(book.getTitle() + "이(가) 삭제되었습니다.");
				System.out.println(toString());
				return true;
			}
		}
		System.err.println("일치하는 일련번호가 없습니다.");
		return false;
	}
	
	/**
	 * 일련번호에 해당하는 책을 찾는다
	 * 책의 상태가 렌트가 가능한 상태(isRent = false)라면 렌트(isRent = true)
	 * 렌트가 가능한 상태가 아니라면 메시지 처리
	 * 리스트를 파일로 출력
	 * @param no
	 * @return
	 */
	public boolean rentBook(int no) {
		
		for(Book book : list) {
			// 일련번호에 해당하는 책을 찾는다
			if(book.getNo() == no) {
				// 해당 책의 대여 여부를 확인한다
				if(!book.isRent()) {
					// 렌트 상태로 변경
					book.setRent(true);
					// 파일로 출력
					boolean res = dao.ListToFile(list);
					// 데이터베이스 업데이트
					int i = dao.update(no);
					if(i>0) {
						System.out.println(i + "건 대여되었습니다.");
					}else {
						System.err.println("처리도중 오류 발생");
						book.setRent(false);
						return false;
					}
					
					if(!res) {
						book.setRent(false);
						System.err.println("파일로 출력하는데 실패했습니다.");
						return false;
					}
					System.out.println(book.getTitle() + "을(를) 대여하였습니다.");
					System.out.println(toString());
					return true;
				} else {
					System.err.println("이미 대여중인 책입니다.");
					return false;
				}
			}
		}
		System.err.println("일치하는 일련번호가 없습니다.");
		return false;
	}
	
	public boolean rentBook(String title) {
		
		for(Book book : list) {
			if(book.getTitle().equals(title)) {
				if(!book.isRent()) {
					book.setRent(true);
					boolean res = dao.ListToFile(list);
					if(!res) {
						book.setRent(false);
						System.err.println("파일로 출력하는데 실패했습니다.");
						return false;
					}
					System.out.println(book.getTitle() + "을(를) 대여하였습니다.");
					System.out.println(toString());
					return true;
				} else {
					System.err.println("이미 대여중인 책입니다.");
					return false;
				}
			}
		}
		System.err.println("없는 책 입니다.");
		return false;
	}
	 /**
	  * 일련번호에 해당하는 책을 찾는다
	  * 책이 렌트가 된 상태(isRent = true)라면 반납(isRent = false)
	  * 렌트가 되지 않은 상태면 메시지 처리
	  * 리스트를 파일로 출력
	  * @param no
	  * @return
	  */
	public boolean returnBook(int no) {
		
		for(Book book : list) {
			if(book.getNo() == no) {
				if(book.isRent()) {
					// 반납처리
					book.setRent(false);
					boolean res = dao.ListToFile(list);
					// DB 업데이트 로직 호출
					dao.update(no);
					if(!res) {
						book.setRent(true);
						System.err.println("파일로 출력하는데 실패했습니다.");
						return false;
					}
					System.out.println(book.getTitle() + "이(가) 반납되었습니다.");
					System.out.println(toString());
					return true;
				} else {
					System.err.println("대여한 책이 아닙니다. 관리자에게 문의해주세요.");
					return false;
				}
			}
		}
		System.err.println("일치하는 일련번호가 없습니다.");
		return false;
	}
	
	/**
	  * 제목과 일치하는 책을 찾는다
	  * 책이 렌트가 된 상태(isRent = true)라면 반납(isRent = false)
	  * 렌트가 되지 않은 상태면 메시지 처리
	  * 리스트를 파일로 출력
	 * @param title
	 * @return
	 */
	public boolean returnBook(String title) {
		
		for(Book book : list) {
			if(book.getTitle().equals(title)) {
				if(book.isRent()) {
					book.setRent(false);
					boolean res = dao.ListToFile(list);
					if(!res) {
						book.setRent(true);
						System.err.println("파일로 출력하는데 실패했습니다.");
						return false;
					}
					System.out.println(book.getTitle() + "이(가) 반납되었습니다.");
					System.out.println(toString());
					return true;
				} else {
					System.err.println("대여한 책이 아닙니다. 관리자에게 문의해주세요.");
					return false;
				}
			}
		}
		System.err.println("없는 책 입니다.");
		return false;
	}
}























