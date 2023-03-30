package loof;
//0320
public class Ex04_06 {
	public static void main(String[] args) {

		// i = 1,2,3,4
		for(int i=1; i<5; i++) {
			// j = 3,2,1,0
			for(int j=4; j>0; j--) {
				// i=1 일 때 j = 4,3,2,1    i>=j
				// i=2 일 때 j = 4,3,2,1
				// i=3 일 때 j = 4,3,2,1
				// i=4 일 때 j = 4,3,2,1
				if(i>=j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for(int i=1; i<5; i++) {
			for(int j=4; j>0; j--) {
				if(i>=j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for(int i=0; i<4; i++) {
			// j = 3,2,1,0
			for(int j=3; j>=0; j--) {
				// i=1일 때 j-i= 3,2,1,0
				// i=2일 때 j-i= 2,1,0,-1
				// i=3일 때 j-i= 1,0,-1,-2
				// i=4일 때 j-i= 0,-1,-2,-3
				// 굳이 왜 이렇게 하는지 모르겠는 식이 수업중에 나왔다
				if(1 > j-i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
		

		
//		for(int i=0; i<5; i++) {
//			for(int j=0; j<5; j++) {
//				if(j>=i) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		
	}

	
}

