package scanner;
//0316
import java.util.Scanner;

public class Bmi2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("키를 입력해 주세요 :");
		
		String height = scan.nextLine();
		System.out.printf("당신의 키는 %s 입니다.\n\n", height);
		double a = Double.parseDouble(height);
		
		System.out.println("몸무게를 입력해 주세요 :");
		String weight = scan.nextLine();
		int b = Integer.parseInt(weight);
		double bmi = b/((a/100)*(a/100));
		System.out.printf("당신의 몸무게는 %s 이고, bmi는 %f 입니다. \n\n", weight, bmi);
		
		scan.close();
		
	}

}
