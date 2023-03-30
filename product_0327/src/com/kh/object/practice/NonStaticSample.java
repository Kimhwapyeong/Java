package com.kh.object.practice;
//0327
public class NonStaticSample {
	
	public void printLottoNumbers() {
		// 메서드
		// 1~45까지의 임의의 정수 출력
		// 중복을 제거
		
		// 6개의 수를 저장할 공간 생성
		int[] numbers = new int[6];
		// i : 0 ~ 5 
		for(int i=0; i<numbers.length; i++) {
			// 0 <= random < 1
			// 0 <= random < 45   (*45)
			// 1 <= random < 46   (+1)
			// 1 ~ 45
			// 새로운 임의의 수를 생성하여 배열에 저장
			numbers[i] = (int)(Math.random() * 45 + 1);
			
			// 중복 체크
			// 동일한 숫자가 입력되었는지 체크
			for(int j=0; j<i; j++) {  // 조건식에 j<numbers.length()로 하면 에러
				if(numbers[i] == numbers[j]) {
					i--;
				}
			}
		}

		// 방을 바꿀 때 필요한 저장공간을 생성
		int tmp = 0;
		// 순서대로 정렬하기
		for(int i=0; i<numbers.length; i++) {
			// 오름차순/내림차순
			for(int j=i; j<numbers.length; j++) {   // 초기값은 j=0 으로 하면 내림차순으로 됨
				if(numbers[j]<numbers[i]) {
					// 방 바꾸기
					tmp = numbers[i];
					// 작은수가 앞으로 올 수 있도록 자리 바꿈
					numbers[i] = numbers[j];
					// 큰수를 뒤로 이동
					numbers[j] = tmp;
				}
			}
		}
		// 반복문을 활용하여 배열을 출력
		System.out.println("Lotto Number");
		for(int num : numbers) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
	
	public void outputChar(int num, char c) {
		// 입력받은 숫자만큼 반복문을 실행
		for(int i=0; i<num; i++) {
			System.out.print(c + " ");
		}
		System.out.println();
	}
	
	public char alphabette() {
		// 임의의 알파벳 하나를 리턴
		// A = 65, z = 122
		// 임의의 수 생성
		// 숫자를 추출해서 char 타입으로 변환
		// 0 <= random < 1
		// *n을 했을 때 랜덤의 범위
		// 0 ~ n-1
		// 65 ~ 122    *58 + 65
		// 91 ~ 96 제외
		int a = 0;
		while(true) {
			a = (int)(Math.random() * 58 + 65);
			if(a >= 'A' && 'Z' >= a || a >= 'a' && 'z' >= a) {
				break;
			}
		}
		return (char)a;
		
	}
	
	public String mySubstring(String str, int index1, int index2) {
		// 문자열의 인덱스값을 이용하여 문자열을 추출
		// 시작 인덱스는 포함하고 끝 인덱스는 불포함
		// 문자열을 추출 시 사용
		
		return str.substring(index1, index2);
	}
	

}

















