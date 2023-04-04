package com.library.dao;
//0404
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
		System.out.println("FileDao.getList() 시작");
		List<Book> list = new ArrayList<>();
		
		/**
		 * 파일을 읽어서 리스트를 반환
		 */
		// 반납할 자원이 있는 경우 try () 안에서 생성할 경우 자동으로 종료(반납)
		try(BufferedReader br = new BufferedReader(new FileReader("bookList.txt"))) {
			String str = "";
			
			// 파일로부터 한 줄을 읽어들여 null이 될때까지 반복
			// null = 파일의 끝(더 이상 읽어올 게 없을 때 null 반환)
			while((str = br.readLine()) != null) {
				// 0 책1 작가1 false
				// System.out.println(str); // 올바르게 출력되나 test
				Book book = makeBook(str);
				// 리스트 파싱중 오류가 발생한 건은 제외
				if(book != null) {
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
	
	/**
	 * 문자열을 받아서 책을 생성하여 반환한다
	 * @param str
	 * @return
	 */
	public Book makeBook(String str) {
		// Book을 반환하기 위해 최상단에 선언
		Book book = null;
		try {
			// 공백을 이용해서 문자열을 잘라 배열로 반환
			String[] strArry = str.split(" ");
			book = new Book(Integer.parseInt(strArry[0]), strArry[1], 
					strArry[2], Boolean.parseBoolean(strArry[3]));
			
		} catch (Exception e) {
			// 데이터 파싱중 오류가 발생하더라도 프로그램이 종료되지 않도록
			// try구문을 활용하여 오류를 처리
			System.err.println("리스트 생성 중 오류가 발생하였습니다.");
			System.err.println("======== readLine() : " + str);
		}
		// 책이 정상적으로 생성된 경우 Book을 반환하고
		// 생성중 오류 발생시 null 반환
		return book;
	}

	@Override
	public boolean saveFile(List<Book> list) {
		// 리스트를 파일로 저장한다
		try (FileWriter fw = new FileWriter("bookList.txt")){
			
			for(Book book : list) {
				// 책의 정보를 공백으로 연결하여 반환
				// 파일로 저장할 때 개행해주어야 한다
				fw.write(book.toString() + "\n");
			}
			fw.flush();
			// 파일 출력 성공
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 파일 출력 실패
		return false;
	}
}
