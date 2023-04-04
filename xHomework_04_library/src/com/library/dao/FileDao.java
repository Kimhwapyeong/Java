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
	/**
	 * bookList.txt 파일로부터 문자열을 받아와서 Book을 생성하고,
	 * 생성된 Book을 list에 저장
	 */
	public List<Book> getList() {
		List<Book> list = new ArrayList<>();
		try(BufferedReader br = new BufferedReader(new FileReader("bookList.txt"))) {
			String str = "";
			
			while((str = br.readLine()) != null) {
				try {
					String[] strArry = str.split(" ");
					list.add(new Book(Integer.parseInt(strArry[0]), strArry[1], 
							strArry[2], Boolean.parseBoolean(strArry[3])));
					
					
				} catch (Exception e) {
					System.err.println("리스트 생성 중 오류 발생");
					System.err.println("======= readLine() : " + str);
				}
				
			}
			// 잘 만들어 졌는지 확인
//			for(Book book : list) {
//				System.out.println(book.toString());
//			}
//			
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
