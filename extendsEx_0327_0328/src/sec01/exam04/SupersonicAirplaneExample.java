package sec01.exam04;
//0327
public class SupersonicAirplaneExample {
	
	
	public static void main(String[] args) {
		SupersonicAirplane superSonic = new SupersonicAirplane(SupersonicAirplane.NORMAL);
		// 이륙
		superSonic.takeOff();
		superSonic.fly();
		
		superSonic.flyMode = 2;  // SupersonicAirplane.SUPERSONIC
		superSonic.fly();
		
		// **가독성을 높이기 위해 상수 사용
		superSonic.flyMode = SupersonicAirplane.NORMAL;
		superSonic.fly();
		
		// 착륙
		superSonic.land();

	}
	
}
