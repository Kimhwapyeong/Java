package homework_0315;

public class Homework {
	public static void main(String[] args) {
		
		String str1 = "245";
		String str2 = "251251";
		String str3 = "211.4141";
		
		int a = Integer.parseInt(str1);
		int b = Integer.parseInt(str2);
		double c = Double.parseDouble(str3);
		
		System.out.println(a + 10);
		System.out.println(b + 10);
		System.out.println(c + 10);
		
		String str4 = String.valueOf(a);
		String str5 = String.valueOf(b);
		String str6 = String.valueOf(c);
		
		System.out.println(str4 + 10);
		System.out.println(str5 + 10);
		System.out.println(str6 + 10);
		
		
		System.out.println("===== 강제 형변환 =====");
		
		byte aByte = 120;
		byte bByte = 21;
		byte sum = (byte)(aByte + bByte); // byte + byte 값을 byte로 강제로 맞추는 코드
	   
		// 값이 -값이 나오는 이유는, byte 타입의 범위를 초과하는 값이 나왔기 때문
		System.out.println(sum);
		
		// byte와 byte의 합은 int로 자동 형 변환
		int sum2 = aByte + bByte;
		System.out.println(sum2);
		
		
		
		
	}

}
