package sec01.exam01;
//0329
public interface RemoteControl {
	// 생성자를 가질 수 없음
	// 인스턴스 필드도 가질 수 없음
	// -> 상수 사용 가능
	// 추상메소드를 가지고 있음
	
	// static final을 자동으로 붙여준다
	// 상수 : 대문자로 작성하고 문자가 연결될 경우 언더바(_)를 이용
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	// 추상메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
}
