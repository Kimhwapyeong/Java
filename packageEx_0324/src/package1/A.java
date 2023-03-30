package package1;
//0324
import package2.C;

public class A {
	// 필드 정의
	//C c = new C();
	
	// 코드 작성 불가
	// c.d() 메서드를 호출 할 수 없음
	
	// 기능
	public void method1() {
		C c = new C(1);
		B b = new B();
		c.method1();
		//c.method2(); c.method2의 접근제한자가 private 이기 때문에 다른 패키지에서 사용 불가 
	}
	
}
class B {
	// default일 경우 같은 패키지에서 호출 가능
	B() {
		
	}
}
