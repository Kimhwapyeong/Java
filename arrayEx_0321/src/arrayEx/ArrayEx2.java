package arrayEx;
//0321
public class ArrayEx2 {
	public static void main(String[] args) {
		// 배열을 생성
		String[] names = {"김대중", "정해자", "김하늘", "김화평", "김두환"};
		
		// 반복문을 이용해서 배열에 입력된 값을 출력
		// 초기화;조건식;증감식;
		// names.length : names 배열의 값의 갯수
		for(int i=0; i<names.length; i++){
			// 배열의 값에 접근 : 변수이름[index]
			System.out.println(names[i]);
		}
		
	}
}
