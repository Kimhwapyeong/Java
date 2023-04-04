package com.library;

import com.library.dao.FileDao;

public class App {
	public static void main(String[] args) {

//		FileDao fd = new FileDao();
//		fd.getList();
		
		Library lib = new Library("filedao");
		
		System.out.println(lib.toString());
		
	}
}
