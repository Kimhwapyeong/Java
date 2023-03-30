package homework_0325_2;

import homework_0325.Book;

public class Application {
	public static void main(String[] args) {

		Book book1 = new Book();
		Book book2 = new Book("자바의정석", 20000, 0.2, "윤상섭");
		
		System.out.println(book1.information());
		System.out.println(book2.information());
		System.out.println("==============================");
		
		book1.setTitle("C언어");
		book1.setPrice(30000);;
		book1.setDiscountRate(0.1);
		book1.setAuthor("홍길동");
		
		System.out.println("수정된 결과 확인");
		System.out.println(book1.information());
		System.out.println("==============================");
		
		System.out.println("도서명 = " + book1.getTitle() + 
				"\n할인된 가격 = " + book1.discountPrice() + "원");
		System.out.println("도서명 = " + book2.getTitle() + 
				"\n할인된 가격 = " + book2.discountPrice() + "원");
		
		
		
	}
	
}
