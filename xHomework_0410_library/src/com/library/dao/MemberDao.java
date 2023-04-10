package com.library.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.library.dao.conn.DBUtil;
import com.library.vo.MemberVo;

public class MemberDao {

	public MemberVo login(String id, String pw) {

		String sql = "select * from member where id = ? and pw = ?";
		try(Connection conn = DBUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {
			
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				String name = rs.getString("name");
				String admin = rs.getString("adminYN");
				
				MemberVo memberVo = new MemberVo(id, "", name, admin);
				
				return memberVo;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// id/pw가 일치하는 사용자를 찾을 수 없음
		return null;
	}

}
