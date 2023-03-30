package sec01.exam05;
//0329
public class Driver {
	
	public static void main(String[] args) {
		Driver driver = new Driver();
		// 구현체를 생성하여 매개변수에 넣어준다
		driver.drive(new Taxi());
		
		
	}
	
	public void drive(Vehicle vehicle) {
		vehicle.run();
		// 강제 형변환 시 castingException이 발생할 소지가 있으므로
		// 객체의 생성 타입을 먼저 체크한다
		// 객체 instanceof 타입 : 객체가 타입으로 생성되었는지를 체크
		if(vehicle instanceof Bus) {
			// 원래 타입으로 강제 형변환
			Bus bus = (Bus)vehicle;
			bus.checkFare();
		}
	}
}
