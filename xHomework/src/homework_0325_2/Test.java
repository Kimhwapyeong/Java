package homework_0325_2;

public class Test {
	
	// 중복되는 수가 나오는디?
	public void lotto() {
		int[] numbers = new int[6];
		int i = 0;
		
		while(true) {
			int num = (int)(Math.random()*45+1);
			if(numbers[i] != num) {
				numbers[i] = num;
				i++;
			}if(numbers[5] != 0) {
				break;
			}
		}
		for(int j=0; j<numbers.length; j++) {
			System.out.print(numbers[j] + " ");
		}
	}
	
	public static void main(String[] args) {
		String str = "안녕하세요";
		String a = str.substring(1, 3);
		System.out.println(a);
		
		Test test = new Test();
		test.lotto();
		
	}
	
}
