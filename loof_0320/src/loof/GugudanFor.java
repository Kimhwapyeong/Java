package loof;
//0320
public class GugudanFor {

	public static void main(String[] args) {
		// 중첩(이중)반복문을 이용하여 구구단 출력하기
		// for(초기식;조건식;증감식;){}
		// i를 1~9까지 출력 하기
		
		
		// dan : 2~9
		
		Outter : 
		for(int dan=2; dan<10; dan++) {
			System.out.println(dan + "단");
			// for 시작
			// i : 1~9
			for(int i=9; i>0; i--) {
				// 만약 6단이면 구구단 출력하지 마
				if(dan == 2) { 
					// label의 위치까지 반복문을 탈출한다
					// label이 없다면 2단만 빼고 출력된다
					break Outter;
				}
				//System.out.println("i=" + i);    i의 범위를 먼저 출력해보자
				//System.out.println(dan + "*" + i + "=" + dan*i);     아래 코드와 동일한 결과값을 가진다
				System.out.printf("%d * %d = %d\n", dan, i, dan*i);
			}
			// for 종료
			System.out.println();
			// 6단 출력 후 반복문 탈출
//			if(dan == 6) {
//				break;
//			}
		}
		
		// 1~10까지의 수 중 짝수의 합
		int sum = 0;
		System.out.println("=======짝수의 합 구하기=======");
		for(int i=1; i<=10; i++) {
			// 홀수이면 증감식으로 넘어감
			// % : 나머지연산자
			// 2로 나눈 나머지가 1이면 홀수, 0이면 짝수
			if(i%2 == 1) { // 홀수이면
				continue;  // 증감식으로 이동
			}
			System.out.println("i = " + i);
			sum += i;
			
//			if(i%2 == 0) {
//				sum += i;
//			}
		}
		System.out.println("1부터 10까지 짝수의 합: " + sum);

	}

}
