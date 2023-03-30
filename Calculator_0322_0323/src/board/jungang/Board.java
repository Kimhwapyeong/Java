package board.jungang;
//0322	
public class Board {
	// 제목
	String title;
	// 내용
	String content;
	// 작성자
	String writer;
	// 작성일
	String date;
	// 조회수
	int hitcount;
	
	// 클래스 이름과 동일하다
	// 반환타입이 없다
	public Board(String title, String content) {
		// 생성자 : 필드 초기화
		// 중복을 제거하기 위해 다른 생성자를 호출
		// 똑같은 역할을 할 수 있는 생성자를 호출
		this(title, content, "로그인한 회원 id", "현재 컴퓨터 날짜", 0);
	}
	public Board(String title, String content, String writer) {
		this(title, content, writer, "현재 컴퓨터 날짜", 0);
	}
	public Board(String title, String content, String writer, String date) {
		this(title, content, writer, date, 0);
	}
	public Board(String title, String content, String writer, String date, int hitcount) {
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
		this.hitcount = hitcount;
	}
	
	
}
