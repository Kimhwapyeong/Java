package com.objectEx;
//0330
public class LibMain {
	public static void main(String[] args) {
		Library lib = new Library();
		lib.addBook();
		System.out.println(lib.toString());
		
		Library lib2 = new Library();
		lib2.addBook2("당신거기있어줄래요", "기욤뮈소", 0);
		lib2.addBook2("어린왕자", "생땍쥐베리", 1);
		lib2.addBook2("카네기인간관계론", "데일카네기", 2);
		lib2.addBook2("성공하는사람들의7가지습관", "스티븐코비", 3);
		lib2.addBook2("한말씀만하소서", "박완서", 4);
		
		System.out.println(lib2.toString());
		
	}

}
