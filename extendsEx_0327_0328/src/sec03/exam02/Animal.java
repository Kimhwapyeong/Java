package sec03.exam02;
//0328
//추상 메소드를 하나라도 포함할 경우 추상 클래스가 된다
public abstract class Animal {
	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	// 추상 메소드 : 미완성 메소드(코드블럭이 미완성 되었음)
	public abstract void sound();
	
	public void print(Animal animal) {
		System.out.println("print ======");
		animal.sound();
		System.out.println(animal.kind);
		System.out.println("============");
	}
}
