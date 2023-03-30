package homework_0325_2;

import homework_0325.NonStaticSample;

public class Application2 {

	public static void main(String[] args) {
		NonStaticSample sample = new NonStaticSample();
		
		System.out.print("1. 랜덤값 : "); 
		sample.printLottoNumbers();
		
		System.out.print("\n2. a문자 5개 출력 : ");
		sample.outputChar(5, 'a');
		
		System.out.print("\n3. 랜덤 영문자 출력 : ");
		System.out.println(sample.alphabette());
		
		System.out.print("4. apple의 2번 4번 인덱스 사이의 값 출력 : ");
		System.out.println(sample.mySubstring("apple", 2, 4));
	}
	
	
}
