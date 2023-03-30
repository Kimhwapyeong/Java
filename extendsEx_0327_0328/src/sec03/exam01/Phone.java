package sec03.exam01;
//0328
// 추상 메소드를 하나라도 포함하고 있으면 추상 클래스가 된다
// 추상 메소드가 없어도 abstract 예약어를 선언하므로써 추상 클래스가 될 수 있다
// 추상 클래스는 생성이 불가능하다
public abstract class Phone {
	// 필드
	public String owner;
	
	// 생성자
//	public Phone() {
//		
//	}
	public Phone(String owner) {
		this.owner = owner;
	}
	
	// 메소드
	// 코드 블럭이 완성되어 있지 않음
	// 하위 클래스에게 작성을 강제한다.
	// 미완성된 메소드를 구현해야 일반 클래스로 작성이 가능하다
	public abstract void turnOn();
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}


}
