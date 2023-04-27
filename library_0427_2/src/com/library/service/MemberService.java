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

	public void insertMember(Member member) {
		if(dao.idCheck(member.getId())) {
			int res = dao.insertMember(member);
			if(res>0) {
				System.out.println(res + "건 처리되었습니다.");
			}else {
				System.err.println("아이디 생성중 오류 발생");
			}
		}else {
			System.err.println("중복되는 아이디가 존재합니다.");
		}
		
	}
}
