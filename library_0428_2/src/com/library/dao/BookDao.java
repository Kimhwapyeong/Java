package com.library.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.library.common.ConnectionUtil;
import com.library.vo.Book;

public class BookDao {
	/**
	 * 도서목록 조회
	 * @return
	 */
	public List<Book> getList(){
		List<Book> list = new ArrayList<>();
		
		String sql = "SELECT NO, TITLE, "
				+ "NVL((SELECT 대여여부 FROM 대여 WHERE 도서번호 = NO AND 대여여부 = 'Y'), 'N') RENTYN "
				+ ", AUTHOR FROM BOOK ORDER BY NO";
		
		// try ( 리소스생성 ) => try문이 종료되면서 리소스를 자동으로 반납
		try (Connection conn = ConnectionUtil.getConnection();
				Statement stmt = conn.createStatement();
				// stmt.executeQuery : resultSet (질의한 쿼리에 대한 결과집합)
				// stmt.executeUpdate : int (몇건이 처리되었는지)
				ResultSet rs = stmt.executeQuery(sql)){
			
			while(rs.next()) {
				int no = rs.getInt(1);
				String title = rs.getString(2);
				String rentYN = rs.getString(3);
				String author = rs.getString(4);
				
				Book book = new Book(no, title, rentYN, author);
				list.add(book);
			}
			
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		return list;
	}
	/**
	 * 도서 삽입
	 * @param book
	 * @return
	 */
	public int insertBook(Book book) {
//		String sql2 = String.format("insert into book values "  // createStatement로 했을 경우 
//				+ "(SEQ_BOOK_NO.NEXTVAL, '%s', '%s', '%s')", book.getTitle(), book.getRentYN(), book.getAuthor());
		String sql = "INSERT INTO BOOK VALUES (SEQ_BOOK_NO.NEXTVAL, ?, DEFAULT, ?)";
		int res = 0;
		
		try(Connection conn = ConnectionUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);) {
			
			pstmt.setString(1, book.getTitle());
			pstmt.setString(2, book.getAuthor());
			
			res = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		return res;
	}
	/**
	 * 책 일련번호를 입력받아 도서 삭제
	 * @param no
	 * @return
	 */
	public int deleteBook(int no) {
		String sql = "DELETE BOOK WHERE NO = ?";
		int res = 0;
		
		try(Connection conn = ConnectionUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {
			
			pstmt.setInt(1, no);
			
			res = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		return res;
		
	}
	/**
	 * 책 제목을 입력받아 도서 삭제
	 * @param title
	 * @return
	 */
	public int deleteBook(String title) {
		String sql = "DELETE BOOK WHERE TITLE = ?";
		int res = 0;
		
		try(Connection conn = ConnectionUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {
			
			pstmt.setString(1, title);
			
			res = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		return res;
		
	}
	
	public int rentBook(int no) {
//		List<Book> list = getList();
		int res = 0;
//		for(Book book : list) {
//			if(book.getNo() == no) {
//				if(book.getRentYN().equals("N")) {
		String sql = "UPDATE BOOK SET RENTYN = 'Y' WHERE NO = ?";

		try(Connection conn = ConnectionUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {

			pstmt.setInt(1, no);

			res = pstmt.executeUpdate();

		} catch (SQLException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
					
//				}else {
//					System.err.println("대여중인 책 입니다.");
//					return res;
//				}
//			}else {
//				System.err.println("없는 도서 번호 입니다.");
//			}
//		}		
		return res;
	}
	
	public int returnBook(int no) {
		int res = 0;
		String sql = "UPDATE BOOK SET RENTYN = 'N' WHERE NO = ";
		
		try(Connection conn = ConnectionUtil.getConnection();
				Statement stmt = conn.createStatement();) {
			
			res = stmt.executeUpdate(sql + no);
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		
		return res;
	}
	
	/**
	 * 일련번호에 해당하는 도서가 있는지 확인
	 * 해당하는 도서가 있으면 true 리턴
	 * 없으면 false 리턴
	 * @param no
	 * @return
	 */
	public boolean noCheck(int no) {
		String sql = "SELECT * FROM BOOK WHERE NO = ";
	
		try(Connection conn = ConnectionUtil.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql + no)) {
			
			if(rs.next()) {
				return true;
			}
			
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		return false;
	}
	
	/**
	 * 도서 랜트 여부 확인
	 * BOOK 테이블의 RENTYN 컬럼을 조회하여
	 * 랜트중(Y) 이면 false 리턴
	 * 랜트가능(N) 이면 true 리턴
	 * @param no
	 * @return
	 */
	public boolean rentCheck(int no) {
		String sql = "SELECT * FROM BOOK WHERE NO = ";
		
		try(Connection conn = ConnectionUtil.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql + no)) {
			
			if(rs.next()) {
				String rentYN = rs.getString("RENTYN");
				if(rentYN.equalsIgnoreCase("Y")) {
					return false;
				}else {
					return true;
				}
			}
			
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		return false; // 사실 이렇게 하면 안됨.
	}

}
