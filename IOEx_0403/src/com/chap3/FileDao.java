package com.chap3;
//0404

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileDao {
	
	public static void main(String[] args) {
//		FileDao fd = new FileDao();
//		fd.fileRead();
		
		try(BufferedReader br = new BufferedReader(new FileReader("bookList.txt"))){
			String str = "";
			List<Book> list = new ArrayList<>();
			while((str = br.readLine()) != null) {
				String[] strArray = str.split(" ");
				int no = Integer.parseInt(strArray[0]);
				String title = strArray[1];
				String author = strArray[2];
				boolean isRent = Boolean.parseBoolean(strArray[3]);
				
				list.add(new Book(no, title, author, isRent));
			}
			
			System.out.println("파일로부터 읽어들인 책 정보를 출력합니다.");
			for(Book book : list) {
				System.out.println(book.toString());
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		// .split() 메소드 활용
		// split() 매개변수를 통해 구분자를 입력하고
		// 구분자를 기준으로 문자열을 잘라 배열로 반환
		String str = "1 타이틀1 작가1 false";
		// 책을 생성하는데 필요한 값들을 구분자를 이용하여 배열에 저장
		String[] strArry = str.split(" ");

		int no = Integer.parseInt(strArry[0]);  // String을 int로 변환
		String title = strArry[1];
		String author = strArry[2];
		boolean isRent = Boolean.parseBoolean(strArry[3]);
		
		Book book = new Book(no, title, author, isRent);
		System.out.println(book.toString());
		
		
		
		int i = 0;
		for(String s : strArry) {
			System.out.println("index " + i + ": " + s);
			i++;
		}
	}
	
	/**
	 * 파일을 읽어서 책 리스트를 생성
	 */
	public void fileRead() {
		
		try (BufferedReader bf = new BufferedReader(new FileReader("bookList.txt"))){
			String str = "";
			
			List<Book> list = new ArrayList<>();
			System.out.println("책 리스트 정보를 읽어옵니다.");
			while((str = bf.readLine()) != null) {
				String[] strArry = str.split(" ");  // 구분자로 끊어서 배열로 반환
				list.add(new Book(Integer.parseInt(strArry[0]), strArry[1], 
						strArry[2], Boolean.parseBoolean(strArry[3])));
			}
			System.out.println("생성된 리스트를 출력합니다.");
			for(Book book : list) {
				System.out.println(book.toString());
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		String str = "1 타이틀1 작가1 false";
		// 구분자로 끊어서 배열로 반환
		// {1, 타이틀1, 작가1, false}
		String[] strArry = str.split(" ");
		//new Book(1, "타이틀1", "작가1", false);
		new Book(Integer.parseInt(strArry[0]), strArry[1], 
				strArry[2], Boolean.parseBoolean(strArry[3]));
		
	
		

	}
	
	/**
	 * 리스트에 담겨있던 책의 정보를 출력
	 */
	public void fileSave() {
		// 데이터 생성
		List<Book> list = new ArrayList<>();
		list.add(new Book(1, "책1", "작가1", false));
		list.add(new Book(2, "책2", "작가2", false));
		list.add(new Book(3, "책3", "작가3", false));
		
		// 파일 출력
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("bookList.txt"))){
			
			for(Book book : list) {
				// 콘솔 출력
				// System.out.println(book.toString());
				bw.write(book.toString());
				bw.newLine(); // 줄바꿈
			}
			
			bw.flush();
			System.out.println("파일 출력 완료!");
				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
