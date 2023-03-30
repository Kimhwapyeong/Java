package loof;
//0317
public class ForLoop {

	public static void main(String[] args) {
		
		// 반복문 - for문
		// for(초기식; 조건식; 증감식;){코드블럭}
		// 초기식 -> 조건식 -> 코드블럭 -> 증감식 -> 조건식
		// 1~100까지의 합
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			
			sum += i;
			
		}
		System.out.println("1부터 100까지의 합: " + sum);
		
		sum = 0;
		for(int i = 1; i<= 100; i=i+2) {
			sum += i;
		}
		System.out.println("1부터 100중 홀수의 합: " + sum);
		
		int i = 0;
		while (i<5) {
			System.out.println("while 출력" + i);
			i++;
		}
		System.out.println("===========");
		i = 0;
		// while 조건문에 ++i로 작성하면 4개 출력 i++ 작성하면 5개 출력
		// ++i, i++는 연산에 쓰여질 때에는 값이 달라질 수 있으니 잘 생각해봐야 함
		while (++i < 5) {
			System.out.println("while 출력" + i);
		}

	}

}
