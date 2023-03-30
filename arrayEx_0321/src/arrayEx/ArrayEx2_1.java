package arrayEx;
//0321
public class ArrayEx2_1 {
	public static void main(String[] args) {
		int[] score = new int[100];
		for(int i=0; i<score.length; i++) {
			score[i] = i+1;
		}
		int sum = 0;
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}
		System.out.println("score 배열 총 합: " + sum);
		System.out.println("score 배열 평균: " + (double)sum/score.length);
	}
	
}
