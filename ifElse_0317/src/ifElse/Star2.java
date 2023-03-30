package ifElse;
//0317
public class Star2 {

	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {
			
			// 학원에서부터 안 돼서 굉장히 오랜시간을 붙들고 있었다. 
			// 집에 오는 전철에서도 생각해보고 답을 찾았다 생가했는데 되지 않았다.
			// star3에 코드를 새로 작성하니 제대로 나왔다.
			// 문제는 j++를 i++로 작성 했던 것.
			// 허무했지만 해결했음에 기쁨도 있었고, 사소한 것을 놓치지 말자는 교훈을 얻었다.
			for(int j = 1; j <= 5; j++) {
				if(j >= i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			
			}
			System.out.println();

		}

	}

}