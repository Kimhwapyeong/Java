package homework_0316;

import java.util.Scanner;

public class Transform {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String str1 = scanner.nextLine();
		String str2 = scanner.nextLine();
		
		double a = Double.parseDouble(str1);
		double b = Double.parseDouble(str2);
		
		double sum = a + b;
		
		System.out.println(sum);
		
		scanner.close();
		
	}
}
