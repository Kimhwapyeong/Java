package self_0318;
// 배열을 통한 로또번호 생성
public class LottoArray {

	public static void main(String[] args) {
		// 45개의 정수를 저장할 수 있는 배열 생성
		int[] ball = new int[45];
		
		// ball 배열에 1~45의 숫자를 저장
		for(int i=0; i < ball.length; i++) {
			ball[i] = i+1;
		}
		int tmp = 0; // 두 값을 바꾸는데 사용할 임시변수
		int j = 0;   // 임의의 값을 얻어서 저장할 변수
		
		for(int i = 0; i < 6; i++) {
			j = (int)(Math.random() * 45);
			tmp = ball[i];
			ball[i] = ball[j];
			ball[j] = tmp;
		}
		for(int i = 0; i < 6; i++) {
			System.out.printf("ball[%d]=%d\n", i, ball[i]);
		}
		

	}

}
