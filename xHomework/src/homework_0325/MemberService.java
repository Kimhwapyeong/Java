package homework_0325;

public class MemberService {
	// 로그인 클래스
	
	// 필드
	private String id;
	private String pw;
	private boolean a;
	
	// 생성자
	public MemberService(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	
	// 메서드
	public boolean login(String id, String pw) {
		if(id!=null && pw!=null && this.id.equals(id) && this.pw.equals(pw)) {
			System.out.println("로그인 성공");
			a = false;
			return a;
		} else {
			return true;
		}
	}
	
	public void logout(String id) {
		if(a == false && this.id.equals(id)) {
			System.out.println(id + " 로그아웃");
		}else {
			System.out.println("로그인 된 아이디가 아닙니다.");
		}
	}
	
	// getter, setter 메서드
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public boolean isA() {
		return a;
	}

	public void setA(boolean a) {
		this.a = a;
	}
	
	
	
}
