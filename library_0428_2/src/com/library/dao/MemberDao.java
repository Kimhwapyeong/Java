package com.library.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.library.common.ConnectionUtil;
import com.library.vo.Member;

public class MemberDao {
	/**
	 * 사용자 로그인
	 * @param id
	 * @param pw
	 * @return
	 */
	public Member login(String id, String pw) {
		String sql = "SELECT * FROM MEMBER WHERE id = " + "'" + id + "'" 
						+ " AND PW = " + "'" + pw + "'";		
		Member member = null;
		
		try(Connection conn = ConnectionUtil.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {
	
			
			// 질의 결과집합을 객체에 담아줍니다.
			if(rs.next()) {
				String name = rs.getString(3);
				String adminYN = rs.getString(4);
				String status = rs.getString(5);
				String grade = rs.getString(6);
				
				member = new Member(id, pw, name, adminYN, status, grade);
//			}else {
//				System.err.println("아이디 / 비밀번호를 확인해주세요.");
			}
			
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		
		return member;
	}
	
	/**
	 * 아이디 중복 체크
	 * 중복이 아니면 true 리턴
	 * 중복일 경우 false 리턴
	 * @param id
	 * @return
	 */
	public boolean idCheck(String id) {
		String sql = "SELECT * FROM MEMBER WHERE ID = ?";
		
		try(Connection conn = ConnectionUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);) {
			
			pstmt.setString(1, id);
			
			ResultSet rs = pstmt.executeQuery();	
			if(!rs.next()) {
				return true;
			}else {
				return false;
			}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		
		return false;
	}
	
	public int insertMember(Member member) {
		int res = 0;
		String sql = "INSERT INTO MEMBER VALUES (?, ?, ?, ?, 'Y', 'B')";
		
		try(Connection conn = ConnectionUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);) {

			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPw());
			pstmt.setString(3, member.getName());
			pstmt.setString(4, member.getAdminYN());
//			pstmt.setString(5, member.getStatus());
//			pstmt.setString(6, member.getGrade());

			res = pstmt.executeUpdate();

		} catch (SQLException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}		
		return res;
	}
	
	public int deleteMember(String id) {
		int res = 0;
		String sql = "DELETE MEMBER WHERE ID = ?";
		
		try(Connection conn = ConnectionUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);) {

			pstmt.setString(1, id);

			res = pstmt.executeUpdate();

		} catch (SQLException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}

		return res;
	}
	
}
