package homework_0320;

public class GugudanScanner {

	public static void main(String[] args) {

		
		System.out.println("구구단 계산기");
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
			
		System.out.printf("%d * %d = %d", a, b, a*b);
			
	}

}
