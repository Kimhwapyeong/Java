package scanner;
//0317
import java.util.Scanner;

public class Operator3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("점수 입력");
		int str = scanner.nextInt();
		String a = (str >= 90)?"A":(str >= 80)?"B":(str >= 70)?"C":"D";
		System.out.printf(a);
		
		scanner.close();
		
	}

}
