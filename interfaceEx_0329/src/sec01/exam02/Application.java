package sec01.exam02;
//0329
import sec01.exam01.Audio;

public class Application {
	public static void main(String[] args) {
		// 기본 생성자를 이용하여 객체를 생성 후
		// 참조타입 변수에 저장
		MyClass myclass = new MyClass();
		// MyClass의 필드에 접근
		// 따라서 RemoteControl타입의 SmartTV 객체가 생성된다
		myclass.rc.turnOn();
		myclass.rc.setVolume(15);
		myclass.rc.turnOff();
		
		myclass.rc = new Audio();
		myclass.rc.turnOn();
		myclass.rc.setVolume(15);
		myclass.rc.turnOff();
		
		System.out.println("**********************");
		// 2. 인터페이스가 생성자의 매개변수로 이용된 경우
		// 인터페이스의 구현체를 생성하여 매개변수로 전달
		MyClass myclass1 = new MyClass(new Audio());
		myclass1.rc.turnOn();
		myclass1.rc.setVolume(5);
		myclass1.rc.turnOff();
		
		System.out.println("**********************");
		
		// 3. 인터페이스가 메소드의 매개변수로 이용된 경우
		// 기본생성자로 생성하면 rc = new SmartTV();
		// 필드의 선언부에서 생성하고 있습니다
		MyClass myclass2 = new MyClass();
		
		// 인터페이스가 메소드의 매개변수 타입으로 사용될 경우
		// 메소드 호출 시 구현 객체를 매개값으로 대입한다
		myclass2.methodB(new Audio());
		myclass2.rc.turnOn();
		myclass2.rc.setVolume(20);
		myclass2.rc.turnOff();
		
		MyClass myclass3 = new MyClass();
		// 4. 메소드에 선언된 로컬변수를 rc에 저장
		myclass3.methodA();
		myclass3.rc.turnOn();
		myclass3.rc.setVolume(20);
		myclass3.rc.turnOff();
		
	}
	
}
