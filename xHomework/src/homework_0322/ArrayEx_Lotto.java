package homework_0322;

public class ArrayEx_Lotto {
	public static void main(String[] args) {
		
		int[] scores = new int[45];
		for(int i=0; i<45; i++) {
			scores[i] = i+1;
		}
		
		int tmp = 0;
		int j = 0;
		
		for(int i=0; i<6; i++) {
			j = (int)(Math.random() * 45);
			tmp = scores[i];
			scores[i] = scores[j];
			scores[j] = tmp;
		}
			
		for(int i=0; i<6; i++) {
			System.out.print(scores[i] + " ");
					
		}
		
		
		
	}
}
