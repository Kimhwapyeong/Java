package ifElse;
//0317
public class Lotto {

	public static void main(String[] args) {
		for(int i = 0; i < 6; i++) {
			int num = (int)(Math.random() * 45 + 1);
			System.out.printf(num + " ");
		}

	}

}
