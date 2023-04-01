package homework_0401.library;

public class Book {
	
	// 책 제목, 작가, 대여여부 필드 선언
	private String name;
	private String author;
	public boolean isRent;
	
	// 생성자 선언
	public Book() {}
	
	public Book(String name, String author) {
		this.name = name;
		this.author = author;
		// isRent는 초기값 false
	}
	
	@Override
	public String toString() {
		
		return name + " / " + author;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public boolean isRent() {
		return isRent;
	}

	public void setRent(boolean isRent) {
		this.isRent = isRent;
	}
	
	
	
	

}
