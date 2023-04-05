package com.library.dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.library.vo.Book;

public class FileDao implements Dao{

	@Override
	public List<Book> getList() {
		List<Book> list = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader("bookList.txt"))){
			String str = "";
			
			while((str = br.readLine()) != null) {
				String[] strArr = str.split(" ");
				
				try {
					int no = Integer.parseInt(strArr[0]);
					String title = strArr[1];
					String author = strArr[2];
					boolean isRent = Boolean.parseBoolean(strArr[3]);
					
					Book book = new Book(no, title, author, isRent);
					list.add(book);
				} catch (Exception e) {
					System.err.println(strArr + " 파싱 중 오류 발생");
				}
				
			}
			
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
//			e.printStackTrace();
		} catch (IOException e1) {
			System.err.println(e1.getMessage());
//			e1.printStackTrace();
		}
		
		return list;
	}

	@Override
	public boolean ListToFile(List<Book> list) {

		try(FileWriter fw = new FileWriter("bookList.txt")) {
			
			for(Book book : list) {
				fw.write(book.toString() + "\n");
			}
			
			fw.flush();
			return true;
		} catch (IOException e) {
			System.err.println(e.getMessage());
//			e.printStackTrace();
		}
		
		return false;
	}

}
