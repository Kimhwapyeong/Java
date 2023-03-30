package ex;

import java.util.Scanner;

public class Ex_2_4_3_ {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("[필수 정보 입력]");
		System.out.print("1. 이름: ");
		String str1 = scanner.nextLine();
		
		System.out.print("2. 주민번호 앞 6자리: ");
		String str2 = scanner.nextLine();
		
		System.out.print("3. 전화번호: ");
		String str3 = scanner.nextLine();
		
		System.out.println("\n[입력한 내용]");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		

	}

}
