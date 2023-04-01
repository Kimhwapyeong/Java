package homework_0401.library2;

public class Application {
	public static void main(String[] args) {
		
		Library lib = new Library();
		
		lib.addBook("성공하는 사람들의 7가지 습관", "스티븐 코비");
		lib.addBook("긍정의힘", "조엘 오스틴");
		lib.addBook("주님은 나의 최고봉", "오스월드 챔버스");
		lib.addBook("자바의 정석", "남궁성");
		lib.addBook("백설공주에게 죽음을", "벨레노이 하우스");
		lib.addBook("부족해도 괜찮아", "이재욱");

		lib.toString();
		
		System.out.println("*********************");
		lib.removeBook(3);
		lib.toString();
		
		System.out.println("*********************");
		lib.rentBook(1);
		lib.rentBook(6);
		
		
	}
}
