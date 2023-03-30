package loof;
//0320
public class GugudanFor_2 {

	public static void main(String[] args) {

		for(int dan=2; dan<10; dan++) {
			System.out.printf("%d단\n", dan);
			for(int i=1; i<10; i++) {
				System.out.printf("%d * %d = %d\n", dan, i, dan*i);
			}
		}

	}

}
