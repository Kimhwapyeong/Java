package homework_0318;

public class Transform {

	public static void main(String[] args) {
		String str = "127";
		int a = Integer.parseInt(str);
		
		System.out.println(a+10);
		
		String str2 = String.valueOf(a);
		
		System.out.println(str2+10);

		
		String str3 = "128";
		String str4 = "120";
		int b = 130;
		int c = 120;
		double d = 124.3;
		double e = 123.4;
		
		System.out.println("=====");
		System.out.println(c+d);
		// int와 double의 연산 결과는 double타입 자동형변환
		System.out.println(str3 + b);
		// String과 int의 연산 결과는 String타입 자동형변환
		System.out.println(str4 + e);		
		System.out.println(b + c);		
		System.out.println(str3 + str4);
		int f = b +(int)d;
		// 형변환 하여 in타입으로 결과 출력
		System.out.println(f);
		// int x = b + (int)str3;
		// String 은 숫자형으로 강제형변환 당연히 불가
		
		// double y = Double.parseDouble(f);
		// parseDouble() 메소드는 String 타입을 숫자형으로 바꿔주는 메소드이므로
		// int 타입을 double타입으로 바꿔줄 수 없음
		// 당연한 거였음 강제 형변환 해주면 되니
		
					
		
		
		
	}

}
