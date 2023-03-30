package ifElse;
//01317
public class Random {

	public static void main(String[] args) {
		
		// Math.random()
		// 0.0 ~ 1.0 사이의 무작위수를 추출하여 double타입으로 반환
		// 0.00000000....1 ~0.9999999999...9
		// x 10 = 0~9  
		// x 100 = 00~99
		// 곱하기는 범위, 더하기는 시작점
		double lotto1 = Math.random();
		double lotto2 = Math.random();
		double lotto3 = Math.random();
		double lotto4 = Math.random();
		double lotto5 = Math.random();

		System.out.println(lotto1);
		System.out.println(lotto2);
		System.out.println(lotto3);
		System.out.println(lotto4);
		System.out.println(lotto5);
		
		//주사위 코드
		System.out.println("==== 주사위 뽑기 ====");
		int num = (int)(Math.random() * 6) + 1;
		
		if(num == 1) {
			System.out.println("1번이 나왔습니다.");
		}else if(num == 2) {
			System.out.println("2번이 나왔습니다.");
		}else if(num == 3) {
			System.out.println("3번이 나왔습니다.");
		}else if(num == 4) {
			System.out.println("4번이 나왔습니다.");
		}else if(num == 5) {
			System.out.println("5번이 나왔습니다.");
		}else {
			System.out.println("6번이 나왔습니다.");
		}
		
		System.out.printf("%d번이 나왔습니다.\n", num);
		
		
		
		System.out.println("===== 랜덤 숫자 6개 출력 =====");
		for(int i = 0; i < 6; i++) {
			int num2 = (int)(Math.random() * 45) + 1;
			System.out.println(num2);
		}
		
		System.out.println("==========================");
		
		int i = 0;
		while(i < 6) {
			int num2 = (int)(Math.random() * 45 + 1);
			System.out.print(num2 + " ");
			i++;
		}
		
		System.out.println("\n======= switch =======");
		
		
		// break를 넣지 않으면 switch문을 빠져나가지 않고 순서대로 계속 진행된다.
		// default는 case에 맞는 값이 없으면 실행된다.
		switch(num) {
		case 1:
			System.out.println("1번이 나왔습니다.");
			break;
		case 2:
			System.out.println("2번이 나왔습니다.");
			break;
		case 3:
			System.out.println("3번이 나왔습니다.");
			break;
		case 4:
			System.out.println("4번이 나왔습니다.");
			break;
		case 5:
			System.out.println("5번이 나왔습니다.");
			break;
		default:
			System.out.println("6번이 나왔습니다.");
			break;
		}
		
		
	}

}
