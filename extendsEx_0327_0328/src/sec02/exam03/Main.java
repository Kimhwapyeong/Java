package sec02.exam03;
//0328
public class Main {
	public static void main(String[] args) {
		// 자동차 객체를 생성한다
		Car car = new Car(new Tire("FR", 3),
				new Tire("FL", 3),
				new Tire("BR", 3),
				new Tire("BL", 3));
		
		// 10번 실행
		for(int i=0; i<10; i++) {
			// 자동차가 달린다
			int res = car.run();
			if(res > 0) {
				car.changeTire(res);
			}
		}
	}
}
