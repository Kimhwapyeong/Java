package com.library.vo;

public class Book {

	private int no;			// 도서 일련번호
	private String title;	// 도서명
	private String rentYN;	// 도서 대여여부
	private String author;	// 작가
	
	// 도서를 추가할 경우 도서명과 작가명만 알고 있으면 생성 가능
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		// 신규 도서이므로 N
		rentYN = "N";
	}

	public Book(int no, String title, String rentYN, String author) {
		this.no = no;
		this.title = title;
		this.rentYN = rentYN;
		this.author = author;
	}

	@Override
	public String toString() {
		String rentYNStr = "";
		
		// 도서가 rentYN = Y(대여중)인 경우 대여중으로 표시
		if("Y".equals(rentYN)) {
			rentYNStr = "대여중";
		}
		return getNo()
				+ " " + getTitle()
				+ " " + getAuthor()
				+ " " + rentYNStr;
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
	public String getRentYN() {
		return rentYN;
	}
	public void setRentYN(String rentYN) {
		this.rentYN = rentYN;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	
	
}
