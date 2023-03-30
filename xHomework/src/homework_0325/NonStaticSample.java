package homework_0325;

public class NonStaticSample {

	// 필드
	
	// 생성자
	
	// 메서드
	
	/**
	 * 1~45의 수 중 랜덤으로 중복되지 않는 6개의 숫자 출력
	 */
	public void printLottoNumbers() {
		int[] num = new int[45];
		for(int i=0; i<45; i++) {
			num[i] = i+1;
		}
		
		int tmp;
		for(int i=0; i<6; i++) {
			int j = (int)(Math.random() * 45);
			
			tmp = num[i];
			num[i] = num[j];
			num[j] = tmp;
		}
		
		for(int i=0; i<6; i++) {
			for(int j=i; j<6; j++) {
				if(num[i] > num[j]) {
					tmp = num[i];
					num[i] = num[j];
					num[j] = tmp;
				}
			}
		}
		for(int i=0; i<6; i++) {
			System.out.print(num[i] + " ");
		}
	}
	
	/**
	 * c 문자 num 개 출력
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
	 * @return 임의의 알파벳 영문자
	 */
	public char alphabette() {
		int num = (int)(Math.random() * 58 + 65);
		char c = (char)num;
		return c;
	}
	
	public String mySubstring(String str, int index1, int index2) {
		if(!str.equals(null)) {
			return str.substring(index1, index2);
		} else return null;
	}
	
}
