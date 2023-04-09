package com.library.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.library.dao.connection.DBUtil;
import com.library.vo.Book;

public class DataBaseDao implements Dao{

	@Override
	public List<Book> getList() {
		List<Book> list = new ArrayList<>();
		try {
			Connection conn = DBUtil.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from book order by no");
			
			while(rs.next()) {
				int no = rs.getInt(1);
				String title = rs.getString(2);
				String author = rs.getString(3);
				String isRentStr = rs.getString(4);
				boolean isRent = ("Y".equals(isRentStr))?true:false;
				
				Book book = new Book(no, title, author, isRent);
				list.add(book);
			}
			DBUtil.closeConnetion(conn, stmt, rs);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public boolean insert(Book book) {
		
		try {
			Connection conn = DBUtil.getConnection();
			Statement stmt = conn.createStatement();
			
			String[] strArr = (book.toString()).split(" ");
			String str = "";
			boolean strArr3 = Boolean.parseBoolean(strArr[3]);
			if(strArr3) {
				str = "Y";
			}else {
				str = "N";
			}
			
			stmt.executeUpdate("insert into book values ('" + strArr[0] + "', '" + strArr[1] + "', '"
			+ strArr[2] + "', '" + str + "', sysdate, " + strArr[5] + ")");
			
			DBUtil.closeConnection(conn, stmt);
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean delete(int no) {
		int res = 0;
		try {
			Connection conn = DBUtil.getConnection();
			Statement stmt = conn.createStatement();
			
			res = stmt.executeUpdate("delete book where no = " + no);
			
			System.out.println(res + "건 삭제되었습니다.");
			
			DBUtil.closeConnection(conn, stmt);
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean update(int no) {
		try {
			Connection conn = DBUtil.getConnection();
			Statement stmt = conn.createStatement();

			int res = stmt.executeUpdate("update book set isrent = 'Y' where book_no = " + no);
			System.out.println(res + "건 수정되었습니다.");
			
			DBUtil.closeConnection(conn, stmt);
			
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

}













