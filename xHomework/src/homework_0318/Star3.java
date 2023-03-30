package homework_0318;

public class Star3 {

	public static void main(String[] args) {
		
		for(int i=0; i<=5; i++) {
			for(int j=5; j>=0; j--) {
				if(j > i) System.out.print(" ");
				else {
					System.out.print("*");
				}
			}System.out.println();
		}
		
	}
}
