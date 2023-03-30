package sec01.exam05;
//0329
// implements 구현하겠다
// Vehicle    Vehicle인터페이스를
// 나는 인터페이스로 자동 형 변환이 가능하다
public class Bus implements Vehicle {

	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}

	public void checkFare() {
		System.out.println("승차 요금을 체크합니다.");
	}
	
}
