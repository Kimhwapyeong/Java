package sec02.exam03;
//0327  //0328
public class KumhoTire extends Tire{
	
	public KumhoTire(String location, int maxRotation) {
		// 부모가 가진 생성자를 호출
		// 생성자를 만들면 기본생성자가 생성되지 않는다
		// 따라서 직접 호출해주어야 한다.
		super(location, maxRotation + 2);
	}
	
	@Override
	public boolean roll() {
		accumulatedRotation++; // 타이어 1회전
		System.out.print("***** 금호타이어 " + location + " 누적 회전 수 : " + accumulatedRotation + "    ");
		System.out.println("***** 금호타이어 " + location + " 최대 회전 수 : " + maxRotation);
		if(accumulatedRotation >= maxRotation) {
			// 바퀴 교체해야 한다고 알려줌
			return false;
		}
		return true;
	}
	
}
