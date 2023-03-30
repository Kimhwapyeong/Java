package sec03.exam01;
//0328
public class Application {
	public static void main(String[] args) {
		
		// 추상클래스는 생성할 수 없다
		// Phone 클래스는 미완성된 메서드를 포함하고 있으므로 생성할 수 없다
		// Phone phone = new Phone();

		// 추상클래스를 상속 받아 추상메소드를 모두 구현 하면
		// 일반클래스로 생성 할 수 있다.
		SmartPhone sp = new SmartPhone("owner");
		sp.turnOn();
		sp.turnOff();
		sp.internetSearch();
		
		// 추상 클래스는
		// 참조형 변수의 타입으로 사용이 가능하다
		// -> 다형성으로 활용할 수 있다
		Phone phone = new SmartPhone("owner");
		
	}
	
}
