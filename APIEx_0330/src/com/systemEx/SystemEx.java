package com.systemEx;
//0331
public class SystemEx {
	public static void main(String[] args) throws InterruptedException {
		// 수행시간 구하기
		// 1/1000초를 구합니다
		double startTime = System.currentTimeMillis();
		
//		System.in;		//System이 가지고 있는 여러가지 메소드
//		System.out;
		
		int sum = 0;
		for(int i=0; i<5; i++){
			sum += i;
			if(i==4) {
				// JVM 강제 종료
				System.exit(0);
			}
			// 5초 대기
			Thread.sleep(1000);
		}
		System.out.println("총합계 : " + sum);
	
		double endTime = System.currentTimeMillis();
											//초로 환산해주기 위해 1000으로 나눈다
		System.out.println((endTime - startTime)/1000 + "초 소요되었습니다.");
	}
}
