package self_0318;

import java.util.Scanner;

public class AbsMethod {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int ab = abs(a, b);
		
		System.out.println(ab);
		sc.close();
	}
	
//      메서드를 선언할 때 return 값에 메서드를 넣어도 된다.
//		대신 반환타입이 일치하여야 한다.
//  	int diff(int a, int b) {
//		return abs(a, b);
//	}

	private static int abs(int i, int j) {
		int a = i - j;
		
		if(a >= 0) {
			return a;
		}else {
			return -a;
		}
		
	}
	
}
