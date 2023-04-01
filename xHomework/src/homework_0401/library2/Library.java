package homework_0401.library2;

import java.util.ArrayList;
import java.util.List;

public class Library {
	List<Book> bookList = new ArrayList<>();
	
	public Library() {}
	public Library(List<Book> bookList) {
		this.bookList = bookList;
	}
	
	public void addBook(String name, String author) {
		Book book = new Book(name, author);
		bookList.add(book);
	}
	
	public void removeBook(int index) {
		if(0<=index && index <= bookList.size()) {
			bookList.remove(index);
		}else {
			System.out.println("목록을 초과하였습니다.");
		}
	}
	
	public void rentBook(int index) {
		if(0<=index && index <= bookList.size()) {
			Book book = bookList.get(index);
			if(book.isRent) {
				System.out.println("이미 대여중 입니다.");
			}else {
				book.isRent = true;
				bookList.set(index, book);
				System.out.println(book.toString() + "대여 완료");
			}
		}else {
			System.out.println("목록을 초과하였습니다.");
		}
	}
	
	@Override
	public String toString() {
		String str = "";
		for(Book a : bookList) {
			if(a.isRent) {
				str = "대여중";
			}else {
				str = "대여가능";
			}
			System.out.println(a.toString() + " / " + str);
		}
		
		return super.toString();
	}
	
}











