package arrayEx;
//0321
public class ArrayEx6 {

	public static void main(String[] args) {
		
		// 2차원 배열
		// 마치 행과 열로 구성된 배열
		// 타입[][] 변수명 = 타입[행][열];
		int[][] scores = new int[2][3];
		
		scores[0] = new int[] {1,2,3};
		scores[1] = new int[] {4,5,6};
		
		System.out.println("scores.length = " + scores.length);
		System.out.println("scores[0].length = " + scores[0].length);
		System.out.println("scores[1].length = " + scores[1].length);
		// 변수이름[몇행][몇열]

		for(int i=0; i<scores.length; i++) {
			int[] points = scores[i];
			for(int j=0; j<points.length; j++) {
				System.out.printf("(%d,%d)=%d ", i, j, points[j]);
			}
			System.out.println();
//			for(int j=0; j<scores[i].length; j++) {
//				System.out.printf("scores[%d][%d] = %d\n", i, j, scores[i][j]);
//			}
		}
		
	}

}
