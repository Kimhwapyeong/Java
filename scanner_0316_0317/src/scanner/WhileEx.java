package scanner;
//0316
import java.io.IOException;

public class WhileEx {
	
	/**
	 * 키보드로부터 입력된 키코드를 출력합니다.
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		
		System.out.println("키보드 입력을 기다리는 중입니다.");
		
		// while : 반복문
		// ()안의 값이 참이면 코드블럭을 계속 실행
		while(true)	{
			// 사용자의 입력을 대기
			int input = System.in.read();
			// Q(81)가 입력되면 반복 종료
			// || : 이거나 또는
			// input 변수의 값이 81이거나 113이면 코드블럭을 실행
			if(input == 81 || input == 113) {
				// 반복문을 탈출 (내가 속해있는 코드블럭)
				break;
				
			}
			// 코드는 위에서 아래로 실행
			// q를 입력했을 때 q가 출력되지 않도록 if문장 아래로 출력 위치를 변경
			System.out.println("keyCode: " + input);
			
		}
		System.out.println("종료");
	}

}
