package homework_0322;

public class ArrayEx_2 {
	public static void main(String[] args) {
		
		int[][] scores = 
			{{1, 2, 3, 4, 5},
			{6, 7, 8, 9, 10},
			{11, 12, 13, 14, 15},
			{16, 17, 18, 19, 20}};
		
		int sum = 0;
		int count = 0;
		for(int i=0; i<scores.length; i++) {
			for(int j=0; j<scores[i].length; j++) {
				sum += scores[i][j];
				count++;
			}
		}
		System.out.println(sum);
		System.out.println(count);
	}
	
}
