package com.library.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//0427
/**
 * DB Connection을 생성하여 반환합니다.
 * @author user
 *
 */
public class ConnectionUtil {
	
	/**
	 * DB Connection을 반환합니다.
	 * @return
	 */
	public static Connection getConnection() {
		// 접속 정보(ip, port, sid, 계정id, 비밀번호)
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "library";
		String pw = "1234";
		
		Connection conn = null;
		
		try {
			// 드라이버 로딩(라이브러리 체크)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 커넥션 생성
			conn = DriverManager.getConnection(url, id, pw);
			// 트랜젝션 처리를 위해 자동커밋을 false로 설정
			// -> 커넥션이 종료되는 시점에 커밋
			conn.setAutoCommit(false);
			
		} catch (ClassNotFoundException e) {
			System.err.println("라이브러리를 확인해주세요!");
			System.err.println(e.getMessage());
			e.printStackTrace();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		return conn;
		
	}
	
	public static void close(Connection conn) {
		try {
			if(conn != null && !conn.isClosed()) conn.close();
		} catch (SQLException e) {
			System.err.println("conn.close() 실패");
			e.printStackTrace();
		}
	}
	
	public static void close(Connection conn, Statement stmt) {
		try {
			if(stmt != null && !stmt.isClosed()) stmt.close();
			if(conn != null && !conn.isClosed()) conn.close();
		} catch (SQLException e) {
			System.err.println("stmt.close() 실패");
			e.printStackTrace();
		}
	}
	
	public static void close(Connection conn, Statement stmt, ResultSet rs) {
		try {
			if(rs != null && !rs.isClosed()) rs.close();
			if(stmt != null && !stmt.isClosed()) stmt.close();
			if(conn != null && !conn.isClosed()) conn.close();
		} catch (SQLException e) {
			System.err.println("rs.close() 실패");
			e.printStackTrace();
		}
	}
	
	// 롤백
	public static void rollback(Connection conn) {
		try {
			conn.rollback();
		} catch (SQLException e) {
			System.err.println("rollback 실패");
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// 접속 정보(ip, port, sid, 계정id, 비밀번호)
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "library";
		String pw = "1234";
		
		Connection conn = null;
		
		try {
			// 드라이버 로딩(라이브러리 체크)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 커넥션 생성
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println(conn);
			System.out.println("프로그램 종료!");
			
			// 커넥션 닫기
			if(!conn.isClosed()) conn.close();
			
		} catch (ClassNotFoundException e) {
			System.err.println("라이브러리를 확인해주세요!");
			System.err.println(e.getMessage());
			e.printStackTrace();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
}
