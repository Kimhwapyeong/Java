package exceptionEx;
//0330
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * UnCheckedException
 * 	  - RuntimeException을 상속하고 있는 예외들 ==>> 실행예외
 * 	  - 컴파일 시 예외 처리코드가 있는지 검사하지 않는다
 * 	  - 프로그램 실행 도중 문제가 발생되므로 오류를 예측해서 조건문을 통해 처리 해주어야 한다
 *    - 보통 예측 가능한 범주에 속하므로 어느정도 예측하여 처리하는 것이 가능하다
 *    
 * RuntimeException의 후손들
 *	- ArrayIndexOutOfBoundsException : 배열의 접근에 잘못된 인덱스 값을 이용한 경우
 *	- NegativeArraySizeException : 배열의 사이즈를 음수로 지정한 경우
 *	- ArithmeticException : 0으로 나눈 경우
 *  - NullPointerException : 참조변수의 값이 null인 경우에 주소접근연산자를 사용시
 *  - ClassCastException : 잘못된 Cast연산자 사용시
 * 
 * @author user
 */
public class D_UnCheckedException {
	public static void main(String[] args) {
		D_UnCheckedException d = new D_UnCheckedException();
//		d.method1();
//		d.method2();
		d.method3();
	}

	public void method1() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
				System.out.println("숫자를 입력해주세요!");
				int num = sc.nextInt();
				break;
			// scanner.nextInt()에 문자로 입력한 경우
			} catch (InputMismatchException e) {
				// num으로 넘어가지 못한 입력값이 버려지지 않고 남아있어서 catch문의 sc.next()에 들어올 수 있다
				// 라는 선생님의 '의견'
				String str = sc.next();
				System.out.println(str + "은 입력 불가능 합니다.");
			}
			
		}
		
		System.out.println("문자를 입력해주세요.");
		// nextInt()를 이용해서 숫자값을 받아올 경우
		// 엔터가 그냥 남아있어서 nextLine()이 자동으로 실행이 됨
		String str = sc.nextLine();
		String str2 = sc.nextLine();
	}
	
	public void method2() {
		
		int i = 10;
		int j = 0;
		if(j == 0) {
			System.out.println("0으로는 나눌 수 없습니다.");
			return; // 메소드 종료
		}
		int k = i/j;
	
	}
	
	public void method3() {
		int size = 0;
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
				System.out.println("숫자를 입력해주세요!");
				size = sc.nextInt();
				break;
			// scanner.nextInt()에 문자로 입력한 경우
			} catch (InputMismatchException e) {
				System.out.println(sc.next() + "은 입력 불가능 합니다.");
			}
		}
		
		// 배열을 생성하는데 배열의 사이즈를 음수로 설정할 경우
		// NegativeArraySizeException 이 발생할 소지가 있으므로
		// 입력된 값이 양수인지 체크한다
		if(size < 0) {
			System.out.println("음수는 입력할 수 없습니다.");
			return;
		}
		
		int[] arr = new int[size];
		// 0 ~ n-1
		// ArrayIndexOutOfBoundsException
		try {
			// 배열의 방번호는 0부터 시작하므로
			// 배열의 생성길이 size보다 1 작은 수 까지 참조가 가능하다
			// 유효하지 않은 방번호에 접근하려고 할 경우
			int num = arr[size];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("잘못된 배열의 길이를 입력하였습니다.");
		}
	
	}
	
}



















