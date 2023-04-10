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

}
