package arrayEx;
//0321
public class ArrayEx {
	public static void main(String[] args) {
		// 배열
		// 같은타입의 데이터를 연속된 공간에 나열하고 index를 부여한 자료구조
		// *같은 타입만 저장 가능
		// *한번 생성된 배열의 길이를 늘이거나 줄일 수 없다
		// *배열의 길이를 확인하는 방법 : 변수명.length = 항목의 갯수
		
		// 배열의 선언
		// 배열 선언과 동시에 값을 입력
		int[] score = {90, 80, 60, 85, 50, 60, 70, 55, 99, 80};
		// int score[]; // 동일한 코드
		// 배열의 값을 참조하는 방법
		// 변수이름[index]
//		System.out.println("score[0] = " + score[0]);
//		System.out.println("score[7] = " + score[7]);
//		System.out.println("score[9] = " + score[9]);
			
		// 변수이름.length : 배열의 길이를 반환 // length는 필드이다 ()가 붙어있으면 메서드, 없으면 필드
		// i = 0 ~ 9
		System.out.println("배열의 길이: " + score.length);
		int sum = 0;
		for(int i=0; i<score.length; i++) {
			sum += score[i];
			System.out.println(score[i]);
		}
		System.out.println("총 합 = " + sum);
		System.out.println("평균 = " + sum/score.length);
	}
	
}
