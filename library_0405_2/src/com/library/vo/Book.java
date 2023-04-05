package com.library.vo;

public class Book {
	private int no;
	private String title;
	private String author;
	private boolean isRent;
	
	public Book() {
		
	}

	public Book(int no, String title, String author, boolean isRent) {
		this.no = no;
		this.title = title;
		this.author = author;
		this.isRent = isRent;
	}
	
	@Override
	// 프린트해서 사용자에게 보여주는 값
	public String toString() {
		String str = "";
		if(isRent) {
			str = "대여중";
		}else {
			str = "대여가능";
		}
		return getNo() + " " + getTitle() + " "
				+ getAuthor() + " " + str;
	}
	
	// 데이터를 파일에 저장할 때 내보는 값
	// 이렇게 따로 만들어주지 않고, toString()으로만 쓰면
	// 파일에 저장할 때 isRent가 저장되지 않아 다시 파일을 받아와서 list를 만들면 
	// 대여여부가 늘 초기화 되어 false값이 되어 있다.
	public String info() {
		return getNo() + " " + getTitle() + " "
				+ getAuthor() + " " + isRent();

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
