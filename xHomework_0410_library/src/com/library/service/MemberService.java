package com.library.service;

import com.library.dao.MemberDao;
import com.library.vo.MemberVo;

public class MemberService {
	
	MemberDao memberDao = new MemberDao();

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

	public void insertMember(MemberVo memberVo) {
		int res = memberDao.insertMember(memberVo);
		if(res>0) {
			System.out.println("사용자 등록 성공");
		}else {
			System.err.println("입력 중 오류 발생");
		}
		
	}

}
