package homework_0401.library;

public class Application {
	public static void main(String[] args) {
		Library lib = new Library();
		
		lib.addBook("아무책1", "아무개1");
		lib.addBook("아무책2", "아무개2");
		lib.addBook("아무책3", "아무개3");
		lib.addBook("아무책4", "아무개4");
		
		lib.toString();
		
		lib.rentBook(2);
		lib.rentBook(2);
		
	}
}
