package com.library.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.library.dao.conn.DBUtil;
import com.library.vo.BookVo;

public class BookDao {

	public List<BookVo> getList() {
		List<BookVo> list = new ArrayList<>();
		// order by bookNo를 넣으면 bookNo의 오룸차순으로 데이터를 받아온다.
		String Sql = "select * from book order by bookNo";
		try(Connection conn = DBUtil.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(Sql)) {
				
			while(rs.next()) {
				int bookNo = rs.getInt("bookNo");
				String title = rs.getString("title");
				String author = rs.getString("author");
				String rentYN = rs.getString("rentYN");
				
				BookVo bookVo = new BookVo(bookNo, title, author, rentYN);
				list.add(bookVo);
			}
				
			
		} catch (SQLException e) {
			System.err.println(e.getMessage());
//			e.printStackTrace();
		}
		
		return list;
	}

	public int insertBook(BookVo bookVo) {
		
		String sql = "INSERT INTO BOOK VALUES(SEQ_BOOKNO.NEXTVAL, ?, ?, ?)";
		try (Connection conn = DBUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql)){
			pstmt.setString(1, bookVo.getTitle());
			pstmt.setString(2, bookVo.getAuthor());
			pstmt.setString(3, bookVo.getRentYN());
			
			int res = pstmt.executeUpdate();
			return res;
			
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		
		return 0;
	}

	public int deleteBook(int bookNo) {
		
		String str = "DELETE BOOK WHERE BOOKNO = ?";
		try(Connection conn = DBUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(str)) {
			pstmt.setInt(1, bookNo);
			
			int res = pstmt.executeUpdate();
			return res;
			
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		return 0;
	}

}
