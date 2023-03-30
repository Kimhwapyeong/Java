package homework_0325_2;

import homework_0325.Sample;

public class App {
	public static void main(String[] args) {
		Sample sam = new Sample();
		
		System.out.print("1. 랜덤 값 : ");
		sam.printLottoNumbers();
		
		System.out.print("2. z 문자 4개 출력 : ");
		sam.outputChar(4, 'z');
		
		System.out.print("3. 랜덤 영문자 출력 : ");
		System.out.println(sam.alphabette());
		
		System.out.print("4. helloooow의 1번 6번 인덱스 사이의 값 출력 : ");
		System.out.println(sam.mySubstring("helloooow", 1, 6));
		
	}
	
}
