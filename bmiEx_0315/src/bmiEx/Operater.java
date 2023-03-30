//230315
package bmiEx;

public class Operater {
	
	public static void main(String[] args) {
		byte byteValue = 10;
		byte byteValue1 = 20;
		
		// byte, short, char 타입은 연산시에 int 타입으로 변환되어서 연산됨
		// ==> 그 결과 int 타입이 반환
		//byte byteValue2 = byteValue + byteValue1; (오류 : 피연산자가 int타입으로 변환됨)
		int intValue2 = byteValue + byteValue1;
		// 피연산자의 강제형변환을 통해 할 수 있다. 식을 ()로 묶어주고, 그 앞에 강제형변환을 넣어준다.
		byte byteValue2 = (byte)(byteValue + byteValue1);
		
		// ===================  실수의 연산  ===================
		int iValue = 10;
		double dValue = 5.5;
		// int와 double의 연산을 하면 int는 자동으로 double형으로 변환된다.
		double result = iValue + dValue;
		System.out.println(result);
		System.out.println((double)iValue);
		System.out.println((double)5/2);   // 5.0/2
		System.out.println(5/(double)2);   // 5/2.0
		System.out.println((double)(5/2)); // 5/2의 결과(int)값을 double로 변환 => 2.0
		
		// ===================  문자열을 기본 타입으로 강제 타입변환 하는 방법 ==================
        String str = "30000";
        
        // parseInt(string s) : int
        // 매개변수로 string 값을 받아서 int값을 반환해주는 메소드
        int i = Integer.parseInt(str);
		System.out.println("=========  문자열을 기본타입으로 강제 타입변환 =========");
		System.out.println(i+10);
		
		str = "10";
		byte iByte = Byte.parseByte(str);
		System.out.println(iByte+10);
		
		str = "200";
		short iShort = Short.parseShort(str);
		System.out.println(iShort + 10);
		
		str = "400000000";
		long iLong = Long.parseLong(str);
		System.out.println(iLong + 10);
		
		str = "12.345";
		float iFloat = Float.parseFloat(str);
		
		str = "12.345";
		double iDouble = Double.parseDouble(str);
		System.out.println(iFloat);
		System.out.println(iDouble);
		
		str = "true";
		boolean iBoolean = Boolean.parseBoolean(str);
		System.out.println(iBoolean);
		
		// 결과를 사용하고 싶다면 반환 값을 변수에 저장해야 함
		// 다른 자료형의 값을 String 타입으로 변환시키는 메소드 String.valueOf()
		String strvalue = String.valueOf(123);
		// 결과를 프린트만 하는 코드
		System.out.println(String.valueOf(123.11));
		
		String.valueOf('가');
		String.valueOf(true);
		
		//연습문제
		byte value = Byte.parseByte("10");
		int value1 = Integer.parseInt("1000");
		float value2 = Float.parseFloat("20.5");
		double value3 = Double.parseDouble("3.14159");
		
		System.out.println(value);
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		long var1 = 2L;
		float var2 = 1.8f;
		double var3 = 2.5;
		String var4 = "3.9";
		int result1 = (int)(var1 + (int)var2 + var3 + Double.parseDouble(var4));
		System.out.println(result1);
		int result2 = (int)(var1 + var2 + var3 + (int)(Double.parseDouble(var4)));
		System.out.println(result2);
		
		

		
	}
	
}
