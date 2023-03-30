package speed;
//0323
public class Car {
	// 필드 : 속성을 정의
	// 1. 정수 speed;
	int speed;
	
	// 생성자 : new 연산자에 의해 객체를 생성할 때 호출
	// 1. 기본생성자
	public Car() {}
	// 2. speed를 매개변수로 받는 생성자
	public Car(int speed) {
		this.speed = speed;
	}
	
	// 메서드 : 기능을 정의
	// 1. getSpeed():int
	public int getSpeed() {
		return speed;
	}
	// 2. keyTurnOn():void
	public void keyTurnOn() {
		System.out.println("시동을 켭니다.");
	}
	// 3. run():void
	// 속도를 10씩 증가시키면서 속도를 50까지 출력합니다
	public void run() {
		for(int i=10; i<=50; i+=10) {
			// 필드에 값을 설정
			speed = i;
			System.out.println("달립니다.(시속: " + speed + "km/h)");
		}
	}
	
	// static 이 있으면 객체를 생성해서 사용해야 함?
	public static void main(String[] args) {
		Car car = new Car();
		car.keyTurnOn();
		car.run();
		int speed = car.getSpeed();
		System.out.println("현재 속도: " + speed + "km/h");
	}
	
}
