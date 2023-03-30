package homework_0325;

public class NonSample {
	
	// 필드
	// 생성자
	// 메서드
	
	/**
	 * 1부터 45까지의 숫자 중 랜덤의 6개 숫자를 오름차순으로 출력
	 */
	public void printLottoNumbers() {
		int[] numbers = new int[45];
		for(int i=0; i<45; i++) {
			numbers[i] = i+1;
		}
		
		int tmp;
		int j;
		
		for(int i=0; i<6; i++) {
			j = (int)(Math.random() * 45);
			tmp = numbers[i];
			numbers[i] = numbers[j];
			numbers[j] = tmp;
		}
		
		for(int i=0; i<6; i++) {
			for(int n=i; n<6; n++) {
				if(numbers[i] > numbers[n]) {
					tmp = numbers[i];
					numbers[i] = numbers[n];
					numbers[n] = tmp;
				}
			}
		}
		for(int i=0; i<6; i++) {
			System.out.print(numbers[i] + " ");
		}
		
	}
	
	/**
	 * 매개변수로 전달받은 문자 c를 전달받은 num 갯수만큼 출력
	 * @param num
	 * @param c
	 */
	public void outputChar(int num, char c) {
		for(int i=0; i<num; i++) {
			System.out.print(c + " ");
		}
		
	}
	
	/**
	 * 알파벳 범위의 임의의 영문자 하나를 발생시켜 리턴
	 * @return 알파벳
	 */
	public char alphabette() {
		char a = (char)(Math.random()*58 + 65);
		return a;
	}
	
	/**
	 * 매개변수로 받은 문자열의 시작 인덱스와 끝 인덱스 까지의 문자열 추출
	 * @param str
	 * @param index1
	 * @param index2
	 * @return 매개변수로 받은 문자열의 시작 인덱스와 끝 인덱스 까지의 문자열 추출하여 리턴
	 */
	public String mySubstring(String str, int index1, int index2) {
		if(!str.equals(null)) {
			return str.substring(index1, index2);
		} else {
			return null;
		}
		
	}
	
}
