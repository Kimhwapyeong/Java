package exceptionEx;
//0330
import java.io.FileNotFoundException;
import java.io.IOException;

public class C_SubClass extends C_SuperClass{
	// 부모클래스의 메서드보다 상위 타입의 예외를 발생시키는 것은 불가능
//	public void method() throws Exception {
//		super.method();
//	}

	// 부모클래스의 메소드보다 하위 타입의 예외를 발생시키는 것은 가능
	public void method() throws FileNotFoundException {
		// super.method();
	}

	// 오버라이딩시 예외를 작성하지 않아도 된다
//	public void method() {
//		// 예외를 작성하지 않으면 부모 클래스의 메소드를 호출하면 안된다
//		// super.method();
//	}
	
		
	
	
}
