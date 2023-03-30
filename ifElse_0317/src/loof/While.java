package loof;

public class While {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		while(i <= 100) {
			sum += i;
			i++;
		}
		System.out.println("1부터 100까지의 합:" + sum);
		
		System.out.println("======");
		
		sum = 0;
		i = 0;
		while(i <= 100) {
			sum += i;
			i=i+2;
		}
		System.out.println("1부터 100까지 짝수의 합:" + sum);
		
		System.out.println("=========");
		
		sum = 0;
		i = 1;
		while(i < 10) {
			System.out.println(i);
			++i;
		}
		
	}

}
