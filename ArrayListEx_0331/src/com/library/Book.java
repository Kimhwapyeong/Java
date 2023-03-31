package com.library;
//0331
public class Book {
	
	private String title;		// 책제목
	private String author;		// 작가
	private boolean isRent;		// 대여여부    // 초기값 false
	
	@Override
	public String toString() {
		String str = "";
		if(isRent) {
			str = "대여중";
		}
		return getTitle() + "/" + getAuthor() + "/" + str;
	}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
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
