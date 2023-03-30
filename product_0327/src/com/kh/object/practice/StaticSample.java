package com.kh.object.practice;
//0327
public class StaticSample {
	
	// 접근제한자가 private이므로 직접 접근이 불가능
	// setter, getter 메서드를 이용
	private static String value;

	public static String getValue() {
		return value;
	}

	public static void setValue(String value) {
		// 매개변수이름과 정적필드 이름이 같기 때문에 StaticSample.value 사용?
		StaticSample.value = value;
	}
	// static이 붙으면 정적 메서드
	// 생성하지 않고 사용 가능
	public static void toUpper() {
		// 모두 대문자로 변경 후 저장
		value = value.toUpperCase();
	}

	public static void setChar(int index, char c) {
		// 전달받은 인덱스 위치의 value값을 전달받은 문자로 변경하는 static 메서드
		// String문자열을 char[]로 반환
		// 한 글자씩 배열 방에 저장
		char[] valueArr = value.toCharArray();
		// 배열이름[방번호] = 값;
		// 값을 배열의 방 번호에 입력 -> 덮어쓰기
		valueArr[index] = c;
		value = String.valueOf(valueArr);
		
//		for(char charValue : valueArr) {
//			System.out.println(charValue);   //char타입으로 변환된 걸 확인하는 출력
//		}
		
	}
	
	public static int valueLength() {
		// str.length : 문자열의 길이를 반환
		return value.length();
	}
	
	public static String valueConcat(String str) {
		// 문자열을 연결해서 반환
		// value = value.concat(str);
		return value.concat(str);
	}
	
	
}
