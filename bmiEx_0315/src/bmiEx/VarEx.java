//230315
package bmiEx;

public class VarEx {

	public static void main(String[] args) {
		
		int value = 0;
		if(value == 0) {  // value 값이 0이면 코드블럭 실행)
			int value2 = value + 20;
		}
		int sum = value;
		// int sum2 = value2;
		// value2 는 if 코드블럭 내에 생성되었기 때문에 밖에서 사용할 수 없음

	}
	// int sum = value;
	// value 는 메인메소드 코드블럭 내에 생성되었기 때문에 사용 불가
	// 안쪽 블럭에서 생성된 변수는 바깥쪽 블럭에서 사용할 수 없음. 반대는 가능
}
