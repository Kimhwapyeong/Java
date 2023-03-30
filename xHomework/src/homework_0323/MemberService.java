package homework_0323;

public class MemberService {
	// 필드
	// 메서드
	// 생성자
	
	String id;
	String pw;
	
	// 객체 초기화
	public MemberService(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	/**
	 * 로그인
	 * @param id
	 * @param pw
	 * @return 필드 id, pw와 매개변수 id, pw가 일치하면 true, 아니면 false 반환
	 */
	public boolean login(String id, String pw) {
		if(id != null && this.id.equals(id) 
				&& pw != null && this.pw.equals(pw)) {
			return true;
		}
		return false;
	}
	
	/**
	 * 로그아웃
	 * @param id
	 */
	public void logout(String id) {
		if(this.id.equals(id)) {
			System.out.println(id+" 로그아웃 성공");
		}
	}
	
}
