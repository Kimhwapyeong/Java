package me;

public class Me_0316 {

	public static void main(String[] args) throws Exception {
		int keyCode;
		
//		keyCode = System.in.read();
//		System.out.println("keyCode: " + keyCode);
//		
//		keyCode = System.in.read();
//		System.out.println("keyCode: " + keyCode);
//
//		keyCode = System.in.read();
//		System.out.println("keyCode: " + keyCode);

		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode);
			if(keyCode == 113) {
				break;
			}
		}

	}

}
