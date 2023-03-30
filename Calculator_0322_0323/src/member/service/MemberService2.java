package member.service;
//0323
public class MemberService2 {
	public String id;
	public String password;
	
	// 생성자
	public MemberService2(String id, String password) {
		this.id = id;
		this.password = password;
	}
	
	// 로그인
	/**
	 * id, pw 값을 필드 값과 비교하여 일치하면 true 아니면 false 반환
	 * @param id
	 * @param password
	 * @return boolean
	 */
	public boolean login(String id, String password) {
		// id, pw 필드에 값과 비교하여 일치하면 true 아니면 false
		if(this.id.equals(id) && this.password.equals(password)) {
			return true;
		}
		return false;
	}
	public void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
	
	// 로그아웃
	
}
