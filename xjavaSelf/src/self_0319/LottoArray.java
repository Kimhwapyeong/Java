package self_0319;

public class LottoArray {

	public static void main(String[] args) {

		// 숫자 45개를 담은 ball 배열 생성
		int ball[] = new int[45];
		
		// 조건문에 <=를 사용했었다.
		// ball.length는 45 이므로 0~45는 46이기 때문에 틀렸다.
		for(int i=0; i<ball.length; i++) {
			ball[i] = i+1;
		}
		// 배열을 섞어줄 변수와 랜덤한 숫자를 받아올 변수 생성
		int tmp = 0;
		int j = 0;
		
		for(int i=0; i<=5; i++) {
			j = (int)(Math.random() * 45);
			tmp = ball[i];
			ball[i] = ball[j];
			ball[j] = tmp;
		}
		for(int i=0; i<=5; i++) {
			System.out.print(ball[i] + " ");
		}
		
		
		
	}

}
