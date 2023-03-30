package arrayEx;
//0321
public class ArrayEx10 {
	public static void main(String[] args) {
		// 배열의 길이를 변경할 수 없으므로 배열의 길이를 늘이거나 줄이기
		// 위해서는 새로운 배열을 만들고 기존 배열을 복사한다
		
		// int 타입의 값{1,2,3}을 갖는 배열 선언
		int[] oldArr = {1,2,3};
		int[] newArr = new int[5];
		
		for(int i=0; i<oldArr.length; i++) {
			newArr[i] = oldArr[i];
			System.out.println("oldArr"+i+":"+oldArr[i]);
		}
		// newArr 출력
		System.out.println("===== newArr =====");
		for(int i=0; i<newArr.length; i++) {
			System.out.println("newArr"+i+":"+newArr[i]);
		}
		
	}
}
