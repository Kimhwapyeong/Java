package exceptionEx;
//0329
import java.util.Scanner;

public class TryCatchEx {
	public static void main(String[] args) {
	/**
	 * try - catch
	 * 
	 * try{
	 * 		// 예외가 발생할 소지가 있는 코드
	 * } catch(Exception e){
	 * 		// try 블럭에서 예외가 발생 시 실행을 멈추고 catch 블럭으로 이동하여
	 * 		   예외처리 코드를 실행
	 * }
	 *
	 */
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
				System.out.println("숫자를 입력해주세요.");
				// 사용자가 문자를 입력했을 경우, 숫자로 변환 시 오류가 발생
				int num = sc.nextInt();
				System.out.println(num + "입력되었습니다.");
				break;
			} catch (Exception e) {
				// e.printStackTrace();
				sc.next();
				System.out.println("입력이 잘못되었습니다.");
			} 
			
		}


			
		

	}

	
	
}
