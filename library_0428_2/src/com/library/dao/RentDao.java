package com.library.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.library.common.ConnectionUtil;

public class RentDao {
//	public static void main(String[] args) {
//		RentDao dao = new RentDao();
//		System.out.println(dao.insert("user", 3)); 
//		System.out.println(dao.update(3));
//		System.out.println(dao.getRentYN(4));
//		
//		
//	}
	
	/**
	 * 도서의 대출 상태를 확인
	 * @param no
	 * @return 대출중 : Y
	 * 		   대출가능 : N
	 */
	public String getRentYN(int no) {
//		String rentYN = "N";
		String sql = "SELECT 대여여부 FROM 대여 WHERE 대여여부 = 'Y' AND 도서번호 = ";
		
		try(Connection conn = ConnectionUtil.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql + no)) {
			
			if(rs.next()) {
				return "Y";
			}
			
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		return "N"; 
	}
	
	public int insert(String id, int no) {
		int res = 0;
		String sql = "INSERT INTO 대여 (대여번호, 아이디, 도서번호, 대여일, 반납가능일) "
				+ "VALUES (SEQ_대여.NEXTVAL, ?, ?, SYSDATE, TO_CHAR(SYSDATE+7, 'YYYY-MM-DD'))";
		try(Connection conn = ConnectionUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);) {
			
			pstmt.setString(1, id);
			pstmt.setInt(2, no);
			
			res = pstmt.executeUpdate();
			return res;
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		return res;
	}
	
	public int update(int no) {
		int res = 0;
		String sql = "SET 대여여부 = 'N'"
				+ ", 반납일 = SYSDATE"
				+ ", 연체일 = CASE WHEN (SYSDATE - 반납가능일) > 0 THEN (SYSDATE - 반납가능일)"
				+ "                WHEN (SYSDATE - 반납가능일) <= 0 THEN 0 END "
				+ "WHERE 대여여부 = 'Y' AND 도서번호 = ?";
		
		try(Connection conn = ConnectionUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);) {
			
			pstmt.setInt(1, no);
			
			res = pstmt.executeUpdate();
			return res;
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		
		return 0;
	}
}
























