package operator;
//0316
public class OperatorEx3 {

	public static void main(String[] args) {
		int x=10, y=5, z=3;
		
		// 삼항연산자
		// (조건)?참:거짓
		int score = 75;
		String res = (score>90)?"A":(score>80)?"B":(score>70)?"C":"D";
		System.out.println(res);
		
		
		// 대입연산자
		// 왼쪽의 값을 오른쪽에 대입
		x=10;
		x+=10; // x=x+10
		x*=10; // x=x*10 
		x%=10; // x=x%10
		
		boolean t = true;
		t = false; // t = true | false
		
		
		
		// 그리고 : 두 개의 항이 모두 true일 때
		// true  true
		// false 
		if(x>y && x>z) {
			
		}
		// 또는 : 두 개의 항중 하나만 true여도 true
		// true 
		// 논리연산자가 하나(|)일때는 첫 항이 true여도 두 번째 항을 확인
		// 논리연산자가 두 개(||)일때는 첫항이 true이면 두 번째 항을 확인하지 않음
		if(x>y || x>z) {
			
		}

	}

}
