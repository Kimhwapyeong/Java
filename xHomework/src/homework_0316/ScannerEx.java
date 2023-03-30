package homework_0316;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("[필수 정보 입력]");
		System.out.print("1. 이름: ");
		String str1 = scanner.next();
		System.out.print("2. 주빈번호 앞 6자리: ");
		String str2 = scanner.next();
		System.out.print("3. 전화번호: ");
		String str3 = scanner.next();
		
		System.out.println("\n[입력한 내용]");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		scanner.close();
		
	}

}
