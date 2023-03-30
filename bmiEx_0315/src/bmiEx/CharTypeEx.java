package bmiEx;

public class CharTypeEx {
	public static void main(String[] args) {
		
		char var1 = 'A';
		char var2 = '평';
		
		char var3 = 65;
		char var4 = 0x0041;
		
		// 문자열 저장
		String var5 = "문자열 저장";
		
		// 정수의 리터럴이 입력되면 기본값이 int이기 때문에
		// long 타입의 경우 숫자 뒤에 l or L 입력
		long var6 = 12345678912104094L;
		
		// 실수타입
		// 실수의 리터럴이 입력되면 기본값이 double이기 때문에
		// float타입의 경우 숫자 뒤에 f 입력
		float var7 = 0.123457f;
		double var8 = 0.12345678989687;
		float var9 = 5e-3f;
		
		boolean var10 = true;
		boolean var11 = false;
		// 참 거짓 판단
		// 문자열과는 다름
		if(false) {
			// 참일 때
			System.out.println("true");
		} else {
			// 거짓일 때
			System.out.println("====== boolean 출력 확인 ======");
			System.out.println("false");
		}
		if(true) {
			System.out.println("true");
		}
		
		System.out.println("====== 실수 출력 ======");
		System.out.println(var7);
		System.out.println(var8);
		System.out.println(var9);
		
		System.out.println("====== char 타입 실습 ======");
		// 타입 변환(명시적 형 변환) : 변수 앞 괄호 안에 타입을 넣어준다 
		System.out.println((int)var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		
		// \(이스케이프) : 출력할 수 없는 것을 출력할 때 사용
		// \n 출력할 때 줄 바꿈
		System.out.println("\"");
		System.out.println("나는\n오늘\n\'순대국\'이\n먹고싶다");
		
	}
	
}
