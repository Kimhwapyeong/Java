package sec02.exam03;
//0327 //0328
public class Tire {
	
	public int maxRotation;  // 최대 회전수 // 타이어가 생성될 때 매개변수에 의해 초기화
	public int accumulatedRotation;  // 누적 회전수
	public String location;  // 타이어의 위치
	
	public Tire(String location, int maxRotation) {
		// 필드를 초기화
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	/**
	 * 타이어 1회전 - accumulatedRotation 1 증가
	 * 1번 실행할 때마다 누적 회전수를 증가시킨다.
	 * 만약 maxRotation(최대회전수보다 크면 false를 리턴한다.) 
	 * @return
	 */
	public boolean roll() {
		accumulatedRotation++; // 타이어 1회전
		System.out.print(location + "누적 회전 수 : " + accumulatedRotation + "    ");
		System.out.println(location + "최대 회전 수 : " + maxRotation);
		if(accumulatedRotation >= maxRotation) {
			// 바퀴 교체해야 한다고 알려줌
			return false;
		}
		return true;
	}
	
}
