package homework_0322;

public class ArrayCopy {
	public static void main(String[] args) {
		
		int[] scores = new int[10];
		for(int i=0; i<10; i++) {
			scores[i] = (int)(Math.random()*100);
			System.out.print(scores[i] + " ");
		}
		
		System.out.println();
		
		int[] scores2 = new int[20];
		for(int i=0; i<scores.length; i++) {
			scores2[i+5] = scores[i];
		}
		for(int i=0; i<scores2.length; i++) {
			System.out.print(scores2[i] + " ");
		}
		
		System.out.println();
		// 배열 복사
		int[] scores3 = new int[30];
		// 배열카피메소드를 이용 , 매개값으로 (원본, 시작인덱스, 복자본, 시작인덱스, 복제길이)
		System.arraycopy(scores, 0, scores3, 11, 10);
		for(int i=0; i<scores3.length; i++) {
			System.out.print(scores3[i] + " ");
		}
		
		
		
	}
}
