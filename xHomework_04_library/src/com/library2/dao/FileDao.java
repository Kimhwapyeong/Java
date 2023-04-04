package com.library2.dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.library2.vo.Book;

public class FileDao implements Dao{

	@Override
	public List<Book> getList() {
		List<Book> list = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader("bookList.txt"))) {
			String str = "";
			
			while((str = br.readLine()) != null) {
				try {
					String[] strArr = str.split(" ");
					list.add(new Book(Integer.parseInt(strArr[0]), strArr[1], 
							strArr[2], Boolean.parseBoolean(strArr[3])));
					
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			for(Book book : list) {
				System.out.println(book.toString());
			}
			
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		} catch (IOException e1) {
			System.err.println(e1.getMessage());
			e1.printStackTrace();
		}
		
		return list;
	}

	@Override
	public boolean saveFile(List<Book> list) {
		try (FileWriter fw = new FileWriter("bookList.txt")){
			
			for(Book book : list) {
				fw.write(book.toString() + "\n");
			}
			fw.flush();
			
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

}








