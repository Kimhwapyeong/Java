package arrayEx;
//0321
public class ArrayEx12 {
	public static void main(String[] args) {
		int[] scores = {80, 90, 70, 100};
		
		// 향상된 for문을 이용해 출력
		// for(타입 변수명 : 배열이름){}
		int sum = 0;
		for(int a : scores) {
			sum += a;
		}
		System.out.println("점수의 총합 : " + sum);
		System.out.println("평균 점수 : " + sum/scores.length);
	}
}
