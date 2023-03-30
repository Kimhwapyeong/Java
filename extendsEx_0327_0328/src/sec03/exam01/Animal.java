package sec03.exam01;
//0328
// 추상메서드가 하나라도 포함되어 있으면 추상 클래스가 된다
public abstract class Animal {

	public String kind;
	
	// 추상 메서드임을 알려준다
	// 메서드 정의만 되어 있으므로 추상 클래스는 생성이 불가능하다.
	// 상속받아서 구현한다.
	public abstract void sound();
	
}
