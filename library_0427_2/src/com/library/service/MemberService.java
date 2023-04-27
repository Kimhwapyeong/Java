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
				System.out.println(member.getId() + "가(이) 추가되었습니다.");
			}else {
				System.err.println("아이디 생성 중 오류 발생");
			}
		}else {
			System.err.println("중복되는 아이디가 존재합니다.");
		}
		
	}

	public void deleteMember(String deleteId) {
		if(!dao.idCheck(deleteId)) {
			int res = dao.deleteMember(deleteId);
			if(res > 0) {
				System.out.println(deleteId + "가(이) 삭제되었습니다.");
			}else {
				System.err.println("아이디 삭제 중 오류 발생");
			}
			
		}else {
			System.err.println(deleteId + "는(은) 가입되지 않은 아이디 입니다.");
		}
		
	}
}
