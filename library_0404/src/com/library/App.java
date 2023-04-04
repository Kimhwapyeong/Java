package com.library;
//0404
public class App {
	public static void main(String[] args) {
		
		Library lib = new Library();
		System.out.println(lib.toString());
		
		lib.insert(4, "책4", "저자4", false);
		System.out.println("책4 추가 테스트 =============");
		System.out.println(lib.toString());
		
	}
}
