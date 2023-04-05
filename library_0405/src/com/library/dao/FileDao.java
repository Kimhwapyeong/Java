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
		// 파일로부터 데이터를 읽어서 리스트를 반환
		//System.out.println("FileDao.getList() 시작");
		// 리스트 선언
		List<Book> list = new ArrayList<>();

		// 아래와 같은 로직이다.
//		try (FileReader fr = new FileReader("bookList.txt");
//				BufferedReader br = new BufferedReader(fr)){}
		
		// 보조스트림은 단독으로 사용 불가하여 기본 스트림을 매개값으로 넣어주어야 한다.
		// try()안에 넣으면 리소스를 자동으로 닫아준다. ex)br.close();
		try (BufferedReader br = new BufferedReader(new FileReader("bookList.txt"))){
			String readLine = "";
			
			// readLine() : 한 줄씩 읽어온다
			// readLine()은 파일이 끝이면 null을 반환한다.
			// null이면 while문을 탈출한다.
			while((readLine = br.readLine()) != null) {
				Book book = makeBook(readLine);
				// book이 null이 나올 수도 있으므로, null이 아닐 경우에만 저장
				if(book != null) {
					// makeBook()메소드로 생성된 책(객체)을 list에 저장
					list.add(book);
				}
			}
			
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
//			e.printStackTrace();
		} catch (IOException e1) {
			System.err.println(e1.getMessage());
//			e1.printStackTrace();
		}
		
		//System.out.println("FileDao.getList() 종료");
		return list;
	}
	
	/**
	 * 매개값으로 받아온 문자열을 " " 구분자로 나누어 
	 * Book의 매개값으로 입력하여 Book 객체를 생성해 반환합니다.
	 * @param readLine
	 * @return
	 */
	private Book makeBook(String readLine) {
		// 반환할 값을 먼저 선언해둔다
		Book book = null;
		// 공백을 기준으로 배열로 저장
		String[] str = readLine.split(" ");

		// 강제형변환시 오류가 발생할 수 있으므로
		// 파일이 올바르지 않은 형태로 저장되어 있을 경우 오류 발생
		// 프로그램에서 오류가 발생 했을 때, 프로그램이 비정상적으로 종료되는 것을 막기 위해
		try {
			// Book을 생성하기 위해 알맞은 타입으로 저장
			// 문자열을 int 타입으로 변환
			int no = Integer.parseInt(str[0]);
			String title = str[1];
			String author = str[2];
			// 문자열을 boolean타입으로 변환
			boolean isRent = Boolean.parseBoolean(str[3]);
			
			// 책을 생성
			book = new Book(no, title, author, isRent);
			
		} catch (Exception e) {
			// 문자열 파싱 중 오류가 발생했을 경우 메시지 처리, return null;
			// 오류 발생한 readLine 을 출력
			System.err.println(readLine + " : 파싱 중 오류가 발생하였습니다.");
		}
		
		// 책을 반환
		return book;
	}

	@Override
	/**
	 * 리스트를 매개변수로 받아 파일로 출력합니다.
	 */
	public boolean ListToFile(List<Book> list) {
		// 리스트를 파일로 출력
		try(FileWriter fw = new FileWriter("bookList.txt")) {
			
			// 리스트에 담긴 책의 정보를 파일로 출력한다.
			for(Book book : list) {
				fw.write(book.toString() + "\n");
			}
			
			fw.flush();
			return true;
		} catch (IOException e) {
			System.err.println(e.getMessage());
//			e.printStackTrace();
			return false;
		}
	}
	
	

}
