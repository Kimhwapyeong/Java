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
		
		String sql = "SELECT * FROM BOOK ORDER BY NO";
		
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
	 * 도서 등록
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
	
	/**
	 * 일련번호로 도서 대여
	 * @param no
	 * @return
	 */
	public int rentBook(int no) {
		int res = 0;
		String sql = "UPDATE BOOK SET RENTYN = 'Y' WHERE NO = ?";

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
	 * 일련번호로 도서 반납
	 * @param no
	 * @return
	 */
	public int returnBook(int no) {
		int res = 0;
		String sql = "UPDATE BOOK SET RENTYN = 'N' WHERE NO = ?";

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

}
