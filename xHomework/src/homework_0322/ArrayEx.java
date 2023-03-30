package homework_0322;

public class ArrayEx {

	public static void main(String[] args) {
		// 배열의 선언
		// 타입[] 변수명 = {,,,};
		// 타입[] 변수명 = new 타입[길이]
		// 변수명[index] = 값
		
		int[] scores = {1,2,3,4,5};
	
		int sum = 0;
		
		// 향상된 for문
		// for(타입 변수명 : 배열명){}
		for(int score : scores) {
			sum += score;
		}
		System.out.println(sum);
	}

}
