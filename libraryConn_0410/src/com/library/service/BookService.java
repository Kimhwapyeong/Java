package com.library.service;
import java.sql.Connection;
//0410
import java.util.List;

import com.library.dao.BookDao;
import com.library.vo.BookVo;

/**
 * 비즈니스 로직
 * 
 * 사용자 요청 검증
 * DB CRUD 요청
 * 사용자 요구에 맞게 반환
 * 
 * Dao 호출
 * @author user
 *
 */
public class BookService {
	
	BookDao bookDao = new BookDao();
		
	public void getList() {
		List<BookVo> list = bookDao.getList();
		
		for(BookVo book : list) {
			System.out.println(book.toString());
		}
	}

	public int insertBook(BookVo bookVo) {
		int res  = bookDao.insertBook(bookVo);
		if(res>0) {
			System.out.println("입력되었습니다.");
//			for(BookVo book : dao.getList()) {
//				System.out.println(book.toString());
//			}
		} else {
			System.err.println("입력 중 오류가 발생했습니다.");
		}
		return 0;
	}

	public void deleteBook(int bookNo) {
		int res = bookDao.deleteBook(bookNo);
		if(res>0) {
			System.out.println("삭제되었습니다.");
			
			// 책 리스트를 출력
			getList();
		}else {
			System.err.println("입력 중 오류가 발생했습니다.");
		}
	}
	
	/**
	 * 책이 렌트 가능한 상태인지 확인
	 * 가능한 상태이면 대여 처리
	 * 아니면 메시지 처리
	 * @param bookNo
	 */
	public void rentBook(int bookNo) {
		// 대여 가능 여부를 판단
		boolean flg = selStatus(bookNo, "N");
		if(flg) {
			int res = bookDao.updateBook(bookNo, "Y");
			if(res>0) {
				System.out.println("대여되었습니다.");
				getList();
			}else {
				System.err.println("대여중 문제가 발생하였습니다.");
			}
		}else {
			System.err.println("대여가 불가능한 상태입니다.");
		}
	}

	public void returnBook(int bookNo) {
		// 반납 가능한 상태인지 확인
		boolean flg = selStatus(bookNo, "Y");
		if(flg) {
			// 반납 처리
			int res = bookDao.updateBook(bookNo, "N");
			if(res>0) {
				System.out.println("반납되었습니다.");
				getList();
			}else {
				System.err.println("반납 중 문제가 발생하였습니다.");
			}
		}else {
			System.err.println("반납이 불가능한 책입니다.");
		}
		
	}
	
	/**
	 * 대여/반납 가능한 책인지 조회
	 * @param no
	 * @param rentYN
	 * @return
	 */
	public boolean selStatus(int no, String rentYN) {
		boolean res = bookDao.selStatus(no, rentYN);
		
		return res;
	}

}
	










