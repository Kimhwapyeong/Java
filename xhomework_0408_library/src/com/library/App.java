package com.library;

public class App {
	public static void main(String[] args) {
		Library lib = new Library("db");
		
		lib.insert(4, "나의첫투자수업", "그양반", false, null, null);
		//lib.insert(6, "부족해도괜찮아", "이재욱", false, null, null);
		
//		lib.rentBook(2);
//    	lib.returnBook(2);
//		lib.insert(6, "한말씀만하소서", "박완서", false, null, null);
	
	}
}
