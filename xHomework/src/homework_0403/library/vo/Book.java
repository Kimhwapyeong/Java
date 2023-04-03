package homework_0403.library.vo;

public class Book {
	// 일련번호
	private int no;
	// 제목
	private String title;
	// 작가
	private String author;
	// 대여 여부
	private boolean isRent;
	// TODO 대여자, 대여일 나중에 넣어보기
	
	public Book(int no, String title, String author) {
		this.no = no;
		this.title = title;
		this.author = author;
		isRent = false;
	}
	
	/**
	 * 책의 정보를 출력(대여 가능 여부도 출력)
	 */
	public void info() {
		String str = "";
		if(isRent) {
			str = "대여중";
		}else {
			str = "대여가능";
		}
		System.out.println(no + "  " + title 
				+ "  " + author + "  " + str);
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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
