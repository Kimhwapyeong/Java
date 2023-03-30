package homework_0330;

import java.util.Scanner;

public class UnCheckedException {
	public static void main(String[] args) {
		UnCheckedException a = new UnCheckedException();
		a.method1();
		
	}
	public void method1() {
		int size = 0;
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
				System.out.println("배열의 크기를 정할 숫자를 입력해주세요.");
				size = sc.nextInt();
				if(size < 0) {
					System.out.println("음수는 입력할 수 없습니다.");
				}else {
					break;
				}
			} catch (Exception e) {
				String str = sc.next();
				System.out.println(str + "은(는) 숫자가 아닙니다.");
			}
			
		}
		int[] arr = new int[size];
		try {
			int num = arr[size];
		} catch (Exception e) {
			System.out.println("잘못된 index값 입력");
		}
		
		
	}
}
