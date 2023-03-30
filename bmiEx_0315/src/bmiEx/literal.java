//230315
package bmiEx;

public class literal {

	public static void main(String[] args) {
		
		// 숫자를 입력할 때 2진수, 8진수, 16진수로 입력이 가능
		int i = 0b1011; // 0b로 시작하면 2진수
		int j = 013;    // 0으로 시작하면 8진수
		int k = 0xB3; 	// 0x로 시작하면 16진수
		
		System.out.println(i + " " + j + " " + k);
		
		byte var1 = 127;
		byte var2 = -128;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = -30;
		
		// byte 값의 허용범위 -128~127
		// 허용 범위를 벗어나면 오류 발생!
		// 리터럴은 값 그 자체를 의미
		// 값이 입력되면 정수는 int 타입
		// 실수는 double 타입
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		
		
	}

}
