package scanner;
//0316
import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// 변수선언 : 변수타입 변수명
		// 자동완성시 자동으로 import (import java.utill.Scanner;)
		// 오류 발생시 제시된 해결방안을 클릭하여 import 가능
		
		// Scanner scan;
		// scan = new Scanner(System.in);
		// 객체를 생성하는 방법
		// new 연산자는 객체를 메모리에 생성 후 메모리의 주소를 반환
		// 클래스명 변수명 = new 클래스명(System.in);
		Scanner scan = new Scanner(System.in); 
		
		// 한줄을 읽어옴
		// String input = scan.nextLine();
		System.out.println("문자열을 입력해주세요.");
		// 공백으로 구분해서 하나씩 읽어옴
		String input = scan.next();
		System.out.println(input);
		System.out.println(Integer.parseInt(input) * 10);
		
		// 숫자로 받아옴
		// int i = scan.nextInt();
		// System.out.println(i*i);
		
		
	}

}
