package com.library.dao;
//0403
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.library.vo.Book;

public class FileDao implements Dao{
	
	public static void main(String[] args) {
		FileDao dao = new FileDao();
		List<Book> list = new ArrayList<>();
		list.add(new Book(0, "책1", "저자1", false));
		dao.insertBook(list);
	}
	
	@Override
	public List<Book> getBookList() {
		System.out.println("책 리스트를 조회");
		// 파일 읽어오기
		// 공백으로 자르기
		// 책을 생성할 파라메터 만들어주기
		// 책을 생성하기
		// 리스트에 담기

		List<Book> list = new ArrayList<>();
		// 파일 읽어오기
		try(BufferedReader br = new BufferedReader(new FileReader("bookList.txt"))) {
			// 받아온 문자열을 저장하기 위한 변수 선언
			String str = "";
			// 생성된 북을 저장하기 위한 list 생성
			
			// 한 줄씩 읽어 오다가 더이상 값이 없으면 null을 반환하므로
			// 받아오는 값이 null이 되기 전까지 반복
			while((str = br.readLine()) != null) {
				// 받아오는 한 줄의 문자열을 " " 구분자를 통해 배열로 저장
				String[] strArr = str.split(" ");

				// 이 로직을 아래 생성자에 바로 넣는다.
//				int no = Integer.parseInt(strArr[0]);
//				String title = strArr[1];
//				String author = strArr[2];
//				Boolean isRent = Boolean.parseBoolean(strArr[3]);
				
				// 리스트에 책 추가(생성자의 타입에 맞게 타입 변환)
				list.add(new Book(Integer.parseInt(strArr[0]), strArr[1], 
						strArr[2], Boolean.parseBoolean(strArr[3]))); 
			}
			// Library에서 출력해줬음. 그래서 주석처리
//			System.out.println("생성된 리스트를 출력합니다.");
//			for(Book book : list) {
//				book.info();
//			}
			
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		} catch (IOException e1) {
			System.err.println(e1.getMessage());
		}
		// 리스트를 반환
		return list;
	}



	@Override
	public int insertBook(List<Book> list) {
						// 지금은 매개값으로 List를 받고있기 때문에 ,true로 이어쓰기를 하지 못함
						// 매개값을 Book으로 받으면 덮어쓰기를 할 수 있지만 아직 레벨이 안된다. 
		try (FileWriter fw = new FileWriter("bookList.txt")){
			for(Book book : list) {
				fw.write(book.toString() + "\n");
				
			}
						
			fw.flush();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return 0;
	}

	@Override
	public int deleteBook(List<Book> list) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateBook(List<Book> list) {
		// TODO Auto-generated method stub
		return 0;
	}

}
