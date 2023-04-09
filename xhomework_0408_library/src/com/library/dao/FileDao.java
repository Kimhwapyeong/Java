package com.library.dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.library.Library;
import com.library.vo.Book;

public class FileDao implements Dao{
	
	@Override
	public List<Book> getList() {
		List<Book> list = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader("bookList.txt"))) {
			String str = "";
			while((str = br.readLine()) != null) {
				String[] strArr = str.split(" ");
				int no = Integer.parseInt(strArr[0]);
				String title = strArr[1];
				String author = strArr[2];
				Boolean isRent = Boolean.parseBoolean(strArr[3]);
				// TODO Date를 파일에서 읽어오면 어떻게 변환해서 Book 생성자의 매개변수로 넣을 수 있을까
				Book book = new Book(no, title, author, isRent);
				if(book!=null) {
					list.add(book);
				}
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
	public boolean insert(Book book) {

		try(FileWriter fw = new FileWriter("bookList.txt")) {
			// getList()를 통해 리스트를 받아와 list 에 저장한다.
			List<Book> list = new ArrayList<>();
			list = getList();
			// 받아온 list에 매개변수로 받은 book을 추가한다
			list.add(book);
			// list가 가지고 있는 book을 toString() 메소드를 통해 한 줄씩 파일에 입력시킨다
			for(Book b : list) {
				fw.write(b.toString() + "\n");
			}
			// 파일에 입력시킨다.
			fw.flush();
			return true;
			
		} catch (IOException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean delete(int no) {

		List<Book> list = new ArrayList<>();
		list = getList();
		
		try {
			for(Book book : list) {
				if(book.getNo()==no) {
					list.remove(book);
				}
			}
			FileWriter fw = new FileWriter("bookList.txt");
			
			for(Book book : list) {
				fw.write(book.toString() + "\n");
			}
			fw.flush();
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean update(int no) {
		
		List<Book> list = new ArrayList<>();
		list = getList();
		for(Book book : list) {
			if(book.getNo()==no) {
				if(book.isRent()) {
					book.setRent(false);
					try(FileWriter fw = new FileWriter("bookList.txt")) {
						for(Book b : list) {
							fw.write(b.toString() + "\n");
						}
						fw.flush();
						return true;
					} catch (IOException e) {
						System.err.println("파일 저장 중 오류 발생");
						e.printStackTrace();
					}
				}else {
					book.setRent(true);
					try(FileWriter fw = new FileWriter("bookList.txt")) {
						for(Book b : list) {
							fw.write(b.toString() + "\n");
						}
						fw.flush();
						return true;
					} catch (IOException e) {
						System.err.println("파일 저장 중 오류 발생");
						e.printStackTrace();
					}
				}
				return true;
			}
		}
		return false;
	}

}
