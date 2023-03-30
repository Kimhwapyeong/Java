package arrayEx;
//0321
public class ArrayEx11 {
	public static void main(String[] args) {
		String[] oldStrArr = {"java", "array", "copy"};
		String[] newStrArr = new String[5];
		
		// (원본배열, 복사시작index, 새배열, 새배열시작index, 복사할개수)
		System.arraycopy(oldStrArr, 0, newStrArr, 0, oldStrArr.length);
		
		for(int i=0; i<newStrArr.length; i++) {
			// 배열의 값에 접근할 때는 배열이름[index]
			System.out.println(newStrArr[i]);
		}
		// 향상된 for문을 이용하는 방법
		// (타입 변수명 : 배열의이름)
		// 배열의 요소를 모두 순회한다. 0~끝까지
		System.out.println("===== 향상된 for문 =====");
		for(String str : newStrArr) {
			System.out.println(str);
		}
		
		
	}
}
