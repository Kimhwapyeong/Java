package package2;
//0324
//import java.util.Calendar;

public class C {

	// B b = new B(); // B 클래스의 생성자가 default라서 패키지가 다른 이 곳에서는 생성할 수 없다.
	
	
	// 프로그램에서 단 하나의 객체만 만들고 싶을 때 생성자의 접근제한자를 private로 하고
	// 메서드를 통해 하나만 만들어서 공유한다
	// 생성자에 private가 오면 new 연산자를 통해 객체를 생성할 수 없다.
	// 외부에서 생성자 접근 제한
	private C(){
		// Calendar cal = Calendar.getInstance();  // 예시
	}
	
	public C(int i) {
		this();
	}
	
	public void method1() {
		System.out.println("method1");
		method2();
	}
	private void method2() {
		System.out.println("method2");
	}
	
}
