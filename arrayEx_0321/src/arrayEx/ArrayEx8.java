package arrayEx;
//0321
public class ArrayEx8 {
	public static void main(String[] args) {
		// new int[scores의 행의 갯수][];
		// 행의 갯수만 지정되고 열의 갯수는 아직 정해지지 않음
		int[][] scores = new int[2][];
		
//		scores[0] = new int[] {1,2,3};
//		scores[1] = new int[] {1,2};  // 열 값이 달라도 된다.
		scores = new int[][] {{1,2,3},{1,2}};
		
		for(int i=0; i<scores.length; i++) {
			System.out.println("방번호 : " + i);
			System.out.println("int배열의 길이 : " + scores[i].length);
			for(int j=0; j<scores[i].length; j++) {
				System.out.printf("(%d,%d)=%d ", i, j, scores[i][j]);
			}
			System.out.println();
		}
	}
}
