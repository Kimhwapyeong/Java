package com.library.vo;

import java.util.Date;

public class Book {
	// 필드 선언
	private int no;
	private String title;
	private String author;
	private boolean isRent;
	private Date regDate;
	private Date editDate;

	// 생성자
	public Book(int no, String title, String author, boolean isRent, Date regDate, Date editDate) {
		this.no = no;
		this.title = title;
		this.author = author;
		this.isRent = isRent;
		this.regDate = regDate;
		this.editDate = editDate;
	}
	
	public Book(int no, String title, String author, boolean isRent) {
		this.no = no;
		this.title = title;
		this.author = author;
		this.isRent = isRent;
	}
	
	
	@Override
	public String toString() {
		return getNo() + " " +
			   getTitle()	+ " " +
			   getAuthor()	+ " " +
			   isRent()	+ " " +
			   getRegDate()	+ " " +
			   getEditDate();
	}

	public String info() {
		String str = "";
		if(isRent) {
			str = "대여중";
		}else {
			str = "대여가능";
		}
		return getNo() + " " +
				getTitle()	+ " " +
				getAuthor()	+ " " +
				str 		+ " " +
				getRegDate()+ " " +
				getEditDate();
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

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public Date getEditDate() {
		return editDate;
	}

	public void setEditDate(Date editDate) {
		this.editDate = editDate;
	}
	
	
	
	
}
