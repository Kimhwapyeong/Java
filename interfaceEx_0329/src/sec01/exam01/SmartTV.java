package sec01.exam01;
//0329
public class SmartTV extends Television	implements Searchable{
	@Override
	public void turnOn() {
		System.out.println("Smart TV를 켭니다.");
	}
	@Override
	public void turnOff() {
		System.out.println("Smart TV를 끕니다.");
	}
	@Override
	public void setVolume(int volume) {
		if(volume > MAX_VOLUME) {
			super.setVolume(MAX_VOLUME); 
		}else if(volume < MIN_VOLUME) {
			super.setVolume(MIN_VOLUME);
		}else {
			super.setVolume(volume);
		}
		
		System.out.println("현재 TV볼륨 : " + super.getVolume());
	}

	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
		
	}

}
