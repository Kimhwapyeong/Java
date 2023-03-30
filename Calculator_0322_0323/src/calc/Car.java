package calc;
//0323
public class Car {
	
	int gas;
	
	// 생성자 : gas 초기화
	public Car(int gas) {
		this.gas = gas;
	}
	
	public void run() {
		while(true) {
			if(gas >0) {
				gas -= 1; // gas--;
				System.out.println("달립니다.");
				System.out.println("남은 기름양 : " + gas);
				
				if(gas == 0) {
					System.out.println("기름이 떨어졌어요!");
					System.out.println("남은 기름양 : " + gas);
					return;
				}
			}
		}
	}
	
	// 메서드는 '기능'
	// 달립니다 출력
	public void run1() {
		System.out.println("달립니다.");
		// 내부 메서드를 호출합니다.
		stop();
		// 이름, 매개변수의 갯수, 타입이 일치하는 메서드를 찾아서 실행
		sound("뿡뽕빵");
	}
	// stop 멈춥니다 출력
	public void stop() {
		System.out.println("멈춥니다.");
	}
	// sound 빵빵 출력
	public void sound(String sound) {
		System.out.println(sound);
	}
	
	
	// boolean 타입의 메서드는 이름 앞에 is가 올 확률이 높다.
	// 기름이 0이면 false를 반환
	public boolean isLeftGas() {   
		if(gas>0) {
			return true;
		} else {
			return false;
		}
	}
	
	
	
	
	
	
	
	
}
