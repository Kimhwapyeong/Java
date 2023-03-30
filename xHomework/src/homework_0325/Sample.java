package homework_0325;

public class Sample {
	
	// 필드
	
	// 생성자
	
	// 메서드
	public void printLottoNumbers() {
		
		int[] numbers = new int[45];
		for(int i=0; i<45; i++) {
			numbers[i] = i+1;
		}
		
		int tmp = 0;
		for(int i=0; i<6; i++) {
			int j = (int)(Math.random() * 45);
			tmp = numbers[i];
			numbers[i] = numbers[j];
			numbers[j] = tmp;
		}
		
		for(int i=0; i<6; i++) {
			for(int j=i; j<6; j++) {
				if(numbers[j]<numbers[i]) {
					tmp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = tmp;
				}
			}
		}
		
		for(int i=0; i<6; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		
        // 드라이브에 이렇게 올라와 있는데 이러면 중복 숫자가 출력될 수 있다.
		// 국취지 때문에 7교시를 못 들어서 왜 이 코드를 올려줬는지 알 수 없다.
		// 그리고 if문에서 numbers[i]가 배열의 크기를 초과할 수 있는데 
		// nullpoint 오류가 나지 않는다. 그냥 false가 되기 때문일까?
//		int[] numbers = new int[6];
//		int i = 0;
//		while(true) {
//			int num = (int)(Math.random() * 45 + 1);
//			if(numbers[i] != num) {
//				numbers[i] = num;
//				i++;
//			}
//			if(numbers[5] != 0) {
//				break;
//			}
//		}
//		for(int num : numbers) {
//			System.out.print(num + " ");
//		}
		
	}
	
	public void outputChar(int num, char c) {
		for(int i=0; i<num; i++) {
			System.out.print(c + " ");
		}
		System.out.println();
	}
	
	public char alphabette() {
		char a = (char)(Math.random() * 58 + 65);
		return a;
	}
	
	public String mySubstring(String str, int index1, int index2) {
		String s = str.substring(index1, index2);
		return s;
	}
}











