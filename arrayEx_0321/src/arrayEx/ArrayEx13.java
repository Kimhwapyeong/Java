package arrayEx;
//0321
public class ArrayEx13 {
	public static void main(String[] args) {
		int[] scores = {80, 90, 70, 100};
		
		int sum = 0;
		for(int score : scores) {
			sum += score;
		}
		System.out.println("총 합 : " + sum);
		System.out.println("평균 : " + sum/scores.length);
		
	}
}
