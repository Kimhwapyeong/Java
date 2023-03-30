package member.service;
//0323
public class MemberService3 {
	// 필드
	public String id;
	public String pw;
	
	
	public MemberService3(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	
	/**
	 * 로그인 처리
	 * @param id
	 * @param pw
	 * @return 로그인 성공: true, 로그인 실패: false
	 */
	public boolean login(String id, String pw) {
		if(id != null // id가 null이 아니고 
				&& pw != null 
				&& this.id.equals(id) // id가 필드의 값과 동일하고 
				&& this.pw.equals(pw)) { // pw가 필드의 값과 동일하고
			
			System.out.println("로그인 성공");
			return true;
		}
		System.out.println("로그인 실패");
		return false;
	}
	public void logout() {
		// 동일한 이름의 지역변수가 없으니까
		// id는 필드를 의미한다
		System.out.println(id+"님 로그아웃 되었습니다.");
	}
}
