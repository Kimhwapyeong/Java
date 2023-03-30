package homework_0316;

import java.util.Scanner;

public class Transform2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();
			
			String str1 = String.valueOf(a);
			String str2 = String.valueOf(b);
			String str3 = String.valueOf(c);
			
			String sum = str1 + str2 + str3;
			System.out.println(sum);
			System.out.println("종료 : q, 계속 : 아무 키");
			
			String out = scanner.next();
			if(out.equals("q")) {
				break;
			}
			
		}
		scanner.close();
		System.out.println("종료");
	}
	
}
