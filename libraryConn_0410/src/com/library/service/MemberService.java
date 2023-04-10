package com.library.service;
//0410
import com.library.controller.MemberVo;
import com.library.dao.MemberDao;

public class MemberService {
	
	MemberDao memberDao = new MemberDao();
	/**
	 * 로그인
	 * ID, PW를 입력받아서 사용자를 조회합니다.
	 * @param id
	 * @param pw
	 * @return
	 */
	public MemberVo login(String id, String pw) {
		MemberVo memberVo = memberDao.login(id, pw);
		if(memberVo != null) {
			System.out.println(memberVo.getName() + "님 환영합니다.");
			return memberVo;
		}else {
			System.out.println("아이디/비밀번호가 일치하지 않습니다.");
			return null; 
		}
	}
	
	/**
	 * 사용자 등록
	 * @param memberVo
	 */
	public void insertMember(MemberVo memberVo) {
		int res = memberDao.insertMember(memberVo);
		if(res>0) {
			System.out.println("입력되었습니다.");
		}else {
			System.err.println("입력 중 오류가 발생했습니다.");
		}
	}

	public void deleteMember(String id) {
		// 사용자 조회
		// 사용자를 조회 할 수 없다는 메시지 출력
		// 오늘은 하지 않음
		
		int res = memberDao.deleteMember(id);
		if(res>0) {
			System.out.println("사용자 " + id + "가 삭제되었습니다.");
		}else {
			System.err.println("삭제 중 오류가 발생하였습니다.");
		}
		
	}
}
