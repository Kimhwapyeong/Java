package com.kh.object;
//0327
import com.kh.object.practice.NonStaticSample;

public class Application {

	public static void main(String[] args) {
		NonStaticSample sample = new NonStaticSample(); 
		sample.printLottoNumbers();
		
		// char 하나의 글자를 입력한다
		// '' 홑따옴표 안에 입력
		// 하나의 글자를 꼭 입력해야 한다
		sample.outputChar(8, 'a');
		
		System.out.println(sample.alphabette());
		
		//            0 12 345 67
		String str = "안녕하세요 반값습니다.";
		// 특정 문자열을 추출하는 방법
		// code123456
		// System.out.println(str.substring(0, 5));
		// 원하는 위치의 문자열을 추출하여 반환해주므로
		// 원본은 수정되지 않는다.
		// 반환값이 있는 메서드는 원본이 수정되지 않음(대부분)
		// 반환값이 없는 메서드는 원본이 수정될 가능성이 높음
		System.out.println(sample.mySubstring(str, 0, 2));
		System.out.println("원본 : " + str);
	}
}
