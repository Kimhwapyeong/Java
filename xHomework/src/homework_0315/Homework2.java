package homework_0315;

public class Homework2 {

	public static void main(String[] args) throws Exception {
		
		int keyCode;
		
		keyCode = System.in.read();
		System.out.println("keyCodea: " + keyCode);

		keyCode = System.in.read();
		System.out.println("keyCodea: " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCodea: " + keyCode);
		
		int keyCode2;
		
		while(true) {
			keyCode2 = System.in.read();
			System.out.println("keyCode2: " + keyCode2);
			if(keyCode2 == 113) {
				break;
			}
			
		}
		
	}

}
