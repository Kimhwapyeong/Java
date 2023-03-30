package loof;
//0320
public class Ex04_03 {

	public static void main(String[] args) {
		// 두 개의 주사위를 던져서 나온 수
		// 1,2,3,4,5,6 6개의 수가 나올 수 있다
		// 0.00...1 <= Math.random() < 1
		// 0.00...1 <=           < 0.99...9
		// 0.00...6 <=           < 5.9....4     *6을 했을 때
		// 1.00...6 <=           < 6.9....4     +1을 해서 초기값 지정
		// 0보다 크거나 같고 5보다 작은 값을 추출 0,1,2,3,4,5
		// 초기값 지정(+) + 1
		while(true) {
			int i = (int)(Math.random()*6 + 1);
			int j = (int)(Math.random()*6 + 1);
		
			System.out.println("눈"+i+"눈"+j);
			// i,j 합이 5면 (i,j) 출력 후 종료
			// 아니면 계속 주사위를 굴린다.
			int sum = 0;
			sum = i+j;
			if(sum == 5)
				break;
		}
		
	}

}
