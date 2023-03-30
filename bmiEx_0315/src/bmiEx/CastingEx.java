//230315
package bmiEx;

public class CastingEx {

	public static void main(String[] args) {
		
		int iValue = 217;
		char charValue = (char)iValue;
		System.out.println(iValue);
		System.out.println(charValue);
		
		long lValue = 500;
		iValue = (int)lValue;
		
		System.out.println(iValue);
	
		float fValue = 3.14f;
		iValue = (int)fValue;
		
		System.out.println(iValue);
		
		
		// 형변환 될 때 값이 초과되면 로테이션이 되어 전혀 다른 값이 나올 수 있다.
		// 강제 형변환 시 변환 하려는 타입에 들어갈 수 있는 값인지 꼭 확인해야 한다.
		int intValue = 128;
		byte byteValue = (byte)intValue;
		System.out.println("===============");
		System.out.println(intValue);
		System.out.println(byteValue);
	}

}
