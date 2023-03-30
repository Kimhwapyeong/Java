package homework_0325_2;

import homework_0325.NonSample;

public class Application3 {
	public static void main(String[] args) {
		
		NonSample sample = new NonSample();
		System.out.print("1. 랜덤 값 : ");
		sample.printLottoNumbers();
		System.out.println();
		
		System.out.print("2. b문자 8개 출력 : ");
		sample.outputChar(8, 'b');
		System.out.println();
		
		System.out.print("3. 랜덤 영문자 출력 : ");
		System.out.print(sample.alphabette());
		System.out.println();
		
		System.out.print("4. Kimhwapyeong의 4번 10번 인덱스 사이의 값 출력 : ");
		System.out.println(sample.mySubstring("Kimhwapyeong", 4, 10));
		
	}
	
}
