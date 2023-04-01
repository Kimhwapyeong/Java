package homework_0401.library2;

public class Book {
	private String name;
	private String author;
	public boolean isRent;
	
	public Book() {

	}
	public Book(String name, String author) {
		this.name = name;
		this.author = author;
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
