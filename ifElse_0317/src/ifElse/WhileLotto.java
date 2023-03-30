package ifElse;
//0317
public class WhileLotto {

	public static void main(String[] args) {

		int i = 0;
		while(true) {
			int num = (int)(Math.random() * 45 + 1);
			System.out.println(num);
			i++;
			
			if(i == 6)
				break;
			
		}

		System.out.println("=========");
		
		i = 0;
		while(i <= 5) {
			int num = (int)(Math.random() *45 + 1);
			System.out.printf(num + " ");
			i++;
			
		}
		
	}

}
