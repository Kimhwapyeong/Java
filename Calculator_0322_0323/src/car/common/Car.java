package car.common;
//0322
public class Car {
	
	// 필드 생성
	String model;
	String color;
	int maxSpeed;
	
	
	// 생성자의 오버로딩
	// 매개변수의 타입, 개수, 순서가 다르게 여러개를 선언
	
	// 생성자의 특징 2가지
	// 반환타입이 없다
	// 클래스명과 동일한 이름을 가진다
	public Car(){
		// 생성자 호출
		// this. 필드
		// this() 생성자
		// 생성자를 사용하기 위해서는 매개변수에 알맞은 파라미터를 넣어줘야 한다
	
		// 1. 생성자에서 다른 생성자를 호출할 수 있다
		// -> 중복되는 코드를 줄이기 위해
		this("기본모델", "블랙", 150);
	} // 기본생성자
	public Car(String model) {
		// model = model; // 코드블럭 안에서는 로컬변수가 우선되므로 아무런 의미 없음
		//this.model = model;
		this(model, "", 150);
	}
	
	// 생성자 오버로딩
	public Car(String model, String color) {
		// 생성자를 호출 하는것은 첫 번째 줄에서만 가능하다
		this(model, color, 150);  // 호출하고자 하는 생성자에 들어갈 파라미터와 같은 타입으로 입력
//		this.model = model;
//		this.color = color;
	}
	public Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	public Car(String model, int maxSpeed) {
		this(model, "", maxSpeed);
//		this.model = model;
//		this.maxSpeed = maxSpeed;
	}
//	public Car(Stirng medel, String test) {}   // 변수이름이 달라도 타입이 같으면 오버로딩 아님
	
	
	
}
