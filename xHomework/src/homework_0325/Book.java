package homework_0325;

public class Book {
	
	// 필드
	private String title;      // 도서명
	private int price; 		   // 가격
	private double discountRate; // 할인율
	private String author;     // 저자명
	
	// 생성자
	public Book() {}
	
	public Book(String title, int price, double discountRate, String author) {
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
		this.author = author;
	}
	
	// 메서드
	/**
	 * 책 정보 출력
	 * @return title, price, discountRate, author
	 */
	public String information() {
		return getTitle() + " " + getPrice() + " " 
				+ getDiscountRate() + " " + getAuthor();
	}
	
	public int discountPrice() {
		return (int)(price - price*discountRate);
	}

	// getter, setter 메서드
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	
	
}
