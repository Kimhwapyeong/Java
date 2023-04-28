package com.library.service;

import com.library.dao.MemberDao;
import com.library.vo.Member;

public class MemberService {
	MemberDao dao = new MemberDao();
	
	/**
	 * 로그인
	 * @param id
	 * @param pw
	 * @return
	 */
	public Member login(String id, String pw) {
		Member member = dao.login(id, pw);
		if(member != null) {
			System.out.println(member.getName() + "님 환영합니다.");
			return member;
		}else {
			System.err.println("아이디 / 비밀번호를 확인해주세요.");
			return member;
		}		
	}

	public void insertMember(String id, String pw, String name, String adminYN) {
//		if(dao.idCheck(id)) {
		Member member = new Member(id, pw, name, adminYN);
		int res = dao.insertMember(member);
		if(res > 0) {
			System.out.println(member.getId() + "이(가) 등록되었습니다.");
			//return;
		}else {
			System.err.println("사용자 등록 중 오류 발생");
			//return;
		}
//		}else {
//			System.err.println("중복되는 아이디가 존재합니다.");
//		}
	}

	public void deleteMember(String id) {
		if(!dao.idCheck(id)) {
			int res = dao.deleteMember(id);
			if(res > 0) {
				System.out.println(id + "이(가) 삭제되었습니다.");
//				return;
			}else {
				System.err.println("사용자 삭제 중 오류 발생");
//				return;
			}
		}else {
			System.err.println("존재하지 않는 아이디 입니다.");
		}
		
	}

	public boolean idCheck(String id) {
		if(dao.idCheck(id)){
			return true;
		}else {
			System.err.println("중복되는 아이디가 존재합니다.");
			return false;
		}
	}

}
















