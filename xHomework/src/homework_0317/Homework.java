package homework_0317;
//0317 예제 4_3
public class Homework {

	public static void main(String[] args) {

		
		while(true) {
			int a = (int)(Math.random() * 6 + 1);
			int b = (int)(Math.random() * 6 + 1);
			
			System.out.print("눈1:" + a);
			System.out.println("  눈2:" + b);
			
			if(a+b == 5) {
				break;
			}
			
		}
		
		
		

	}

}
