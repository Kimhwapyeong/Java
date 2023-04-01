package homework_0401.library;

import java.util.ArrayList;
import java.util.List;

public class Library {
	
	// 필드 선언
	// Book 타입을 담는 ArrayList를 생성해서 List 타입의 bookList에 주소를 담는다
	// ArrayList를 List 타입 참조변수에 담을 수 있는 이유는 ArrayList가 List의 구현체이기 때문
	List<Book> bookList = new ArrayList<>();
	
	// 생성자 선언
	public Library() {}
	public Library(List<Book> bookList) {
		this.bookList = bookList;
	}
	
	// 메소드 선언
	public void addBook(String name, String author) {
		Book book = new Book(name, author);
		bookList.add(book);
	}
	
	public void rentBook(int index) {
		Book book = bookList.get(index);
		if(book.isRent) {
			System.out.println("이미 대여중인 책 입니다.");
		}else {
			book.isRent = true;
			bookList.set(index, book);
			System.out.println(book.getName() + " 대여 완료");
		}
		
	}
	@Override
	public String toString() {
		for(Book a : bookList) {
			System.out.println(a.toString());
		}
	
		return super.toString();
	}
	
	
}
