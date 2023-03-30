package homework_0322;

public class CarMain {

	public static void main(String[] args) {
		
		Car car = new Car();
		car.company = "현다이";
		car.name = "구아방";
		car.cc = 1600;
		car.maxSpeed = 120;
		
		car.speedUp();
		car.speedUp();
		car.speedUp();
		car.speedUp();
		car.speedUp();
		System.out.println(car.maxSpeed);
		
	}
	
}
