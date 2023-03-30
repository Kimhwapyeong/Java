package homework_0320;

public class Star {

	public static void main(String[] args) {
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				if(j>i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
	
}
