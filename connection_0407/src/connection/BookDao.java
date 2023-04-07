package connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//0407
public class BookDao {
	
	public static void main(String[] args) {
		BookDao dao = new BookDao();
		
		//dao.insert(8, "해리포터", "J롤링", "N");
		//dao.delete(11);
		//dao.update(3);
		
		System.out.println("책리스트 ===========");
		List<Book> list = dao.getList();
		for(Book book : list) {
			System.out.println(book.toString());
		}
	}
	
	// 데이터 삽입
	public void insert(int no, String title, String author, String isRent) {
		try {
			Connection conn = DBUtil.getConnection();
			Statement stmt = conn.createStatement();
			
			String sql = "insert into book values (" + no +",'" + title +"','" + author+"','" + isRent +"',"+ "sysdate, null)";
			// 삽입/수정/삭제
			int res = stmt.executeUpdate(sql);
			
			System.out.println(res + "건 추가되었습니다.");
			// 자원 반납
			DBUtil.closeConnection(conn, stmt);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	// 데이터 수정
	public void update(int no) {
		
		try {
			Connection conn = DBUtil.getConnection();
			// 쿼리를 작성할 객체 생성
			Statement stmt = conn.createStatement();
			
			String sql = "update book set isrent = 'Y' where no = " + no;
			
			int res = stmt.executeUpdate(sql);
			System.out.println(res + "건 수정되었습니다.");
			
			// 자원 반납에 대해 Developer에서 확인해보기 위한 로직
			System.out.println("대기");
			Thread.sleep(5000);
			
			DBUtil.closeConnection(conn, stmt);
			System.out.println("자원 반납");
			System.out.println("대기");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	// 데이터 삭제
	public void delete(int no) {
		try {
			Connection conn = DBUtil.getConnection();
			Statement stmt = conn.createStatement();
			
			String sql = "delete from book\r\n"
					+ "where book.no = " + no;
			int res = stmt.executeUpdate(sql);
			System.out.println(res + "건 삭제되었습니다.");
			
			DBUtil.closeConnection(conn, stmt);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	// 데이터 조회
	public List<Book> getList(){
		List<Book> list = new ArrayList<>();
		
		try {
			Connection conn = DBUtil.getConnection();
			Statement stmt = conn.createStatement();

			// 질의결과를 결과집합으로 받아온다
			ResultSet rs = stmt.executeQuery("select * from book order by no");
				// 한 줄씩 읽어오고, 값이 없으면 false 반환
			while(rs.next()) {
				// 컬럼이름으로 해도 되고, 순서로 해도 된다.
				int no = rs.getInt("no");
				String title = rs.getString(2);
				String author = rs.getString(3);
				String isRent = rs.getString(4);
				Date regdate = rs.getDate(5);
				Date editdate = rs.getDate(6);
				
				Book book = new Book(no, title, author, isRent, regdate, editdate);
				list.add(book);
			}
		
			DBUtil.closeConnection(conn, stmt, rs);
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
}


























