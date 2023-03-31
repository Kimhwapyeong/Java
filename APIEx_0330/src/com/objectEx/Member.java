package com.objectEx;
//0330
public class Member {
	public static void main(String[] args) {
		Member member1 = new Member("id");
		System.out.println("****************");
		/**
		 * hashCode()
		 * 
		 * 객체를 식별하는 하나의 정수값
		 * Object클래스의 객체 해시코드 메소드는 객체 메모리 번지를 이용하여
		 * 해시코드를 만들어 리턴한다
		 * ==>> 객체마다 다른 값을 가진다
		 * 
		 * 두 객체가 동등한지 비교하는데 사용되어진다
		 */
		
		Object obj = new Object();
		obj.equals(new String("안녕"));
		System.out.println(member1.hashCode());
		// 16진수로 변환  // 16진수는 문자로 표현되어 String타입으로 반환
		String str = Integer.toHexString(member1.hashCode());
		str.equals(str);
		System.out.println("hashCode() 16진수로 변환 : " + str);
		System.out.println(member1.toString());
		System.out.println("****************");
		
		
		Member member2 = new Member("id");
		
		System.out.println(member1.equals(member2));
	}
	
	private String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	/**
	 * Member 객체(this)가 가지고 있는 id값과 
	 * 매개변수로 받은 obj의 id값이 일치하는지 비교
	 */
	public boolean equals(Object obj) {
		System.out.println("obj.equals() : " + super.equals(obj));

		if(obj instanceof Member) {
			((Member)obj).getId();  // Object 타입의 obj를 Member로 형변환 해주어야 getId()메소드 호출 가능
			if(this.id.equals(((Member)obj).getId())) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
		// 객체가 가지고 있는 id값이 같다면 true 아니면 false
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
