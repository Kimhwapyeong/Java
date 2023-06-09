package arrayEx;
//0321
public class ArrayEx4 {
	public static void main(String[] args) {
		// String 타입의 배열 5칸을 만들고 이름을 입력해보자
		// 첫 번째 칸에 이름 입력하기
		String[] names = new String[5];
		names[0] = "홍길동";
		
		System.out.println(names);
		
		// 자바에서 참조형 변수의 메모리 주소를 표시하는 방법
		System.out.println("names객체의 hashCode : " + names.hashCode());
		// Integer : int의 객체타입
		// 16진수로 표시
		System.out.println("16진수로 변환 : " + Integer.toHexString(names.hashCode()));;
		
		System.out.printf("%x", names.hashCode());
		
	}
	
}
