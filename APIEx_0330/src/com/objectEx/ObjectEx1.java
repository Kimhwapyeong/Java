package com.objectEx;
//0330
public class ObjectEx1 {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		boolean res = obj1 == obj2;
		System.out.println(res);
		System.out.println(obj1.equals(obj2));
		
		System.out.println("String 비교 ========");
		String str1 = new String("java");
		String str2 = new String("java");
		
		System.out.println(str1 == str2);
		// .equals() 메소드가 문자열을 비교하도록 오버라이딩 되어있다
		System.out.println(str1.equals(str2));
		
	}
}
