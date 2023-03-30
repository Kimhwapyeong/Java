package sec01.exam01;
//0329
public abstract class Television implements RemoteControl {
// 구현 클래스
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
		
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	
	
	// 인터페이스에서 정의한 추상 메소드를 모두 구현해야 하는데
	// 하나라도 구현하지 않은 경우 ==> 추상 클래스가 된다.
//	@Override
//	public void setVolume(int volume) {
//		if(volume > MAX_VOLUME) {
//			this.volume = MAX_VOLUME;
//		}else if(volume < MIN_VOLUME) {
//			this.volume = MIN_VOLUME;
//		}else {
//			this.volume = volume;
//		}
//		
//		System.out.println("현재 TV볼륨 : " + this.volume);
//	}
}
