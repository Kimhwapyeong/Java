package loof;
//0320
public class Ex04_04 {

	public static void main(String[] args) {

		for(int x=1; x<=10; x++) {
			for(int y=1; y<=10; y++) {
				if(4*x + 5*y == 60) {
					System.out.println(x+","+y);
				}
			}
		}

	}

}
