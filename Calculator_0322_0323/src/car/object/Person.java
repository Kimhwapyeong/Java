package car.object;
//0322
public class Person {
	public static void main(String[] args) {
		
		Car car = new Car();
		car.company = "르노삼성";
		System.out.println("company : " + car.company);
		
		System.out.println("speed : " + car.speed);
		car.speedUp();
		System.out.println("car.speedUp()");
		System.out.println("speed : " + car.speed);
		car.speed = 60;
		System.out.println("car.speed = 60");
		System.out.println("speed : " + car.speed);

//		public void test() {    // 메서드 안에 메서드를 작성하면 오류
//			
//		}
		
//		Car carKia = new Car("기아자동차");
//		
//		System.out.println("car.company : " + car.company);
//		car.speedUp();
//		System.out.println("car.speed : " + car.speed);
//		
//		
//		System.out.println("carKia.company : " + carKia.company);
		
		
		
		
	}
	
}
