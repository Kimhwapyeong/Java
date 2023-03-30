package loof;
//0320
public class Ex04_05 {

	public static void main(String[] args) {

//		*
//		**
//		***
//		****
		
		for(int i=1; i<=10; i++) {
			// *을 출력
			// j <= i
			// =======
			// 1 <= 1
			// 2 <= 1 false(조건 불일치)
			// =======
			// 1 <= 2
			// 2 <= 2
			// 3 <= 2 false
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=5; j++) {
//				if(j>i) {
//					System.out.print(" ");
//				}else {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}
		
	}

}
