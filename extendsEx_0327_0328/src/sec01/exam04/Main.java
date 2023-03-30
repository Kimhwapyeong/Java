package sec01.exam04;
//0327
public class Main {
	public static void main(String[] args) {
		// 부모타입으로 자식객체를 생성한다
		// 자동형변환 된다
		Airplane airplane = new SupersonicAirplane(SupersonicAirplane.SUPERSONIC);
	
		// 부모타입으로 변환 시 
		// 1. 부모가 가지고 있는 필드 또는 메서드에만 접근 가능
		// 2. 재정의 메서드 호출 시 - 자식 클래스에서 재정의한 메서드가 호출
		// 3. 자식 클래스에서 정의된 메서드는 호출 불가
		System.out.println("재정의 메서드 호출");
		airplane.fly();
		// airplane.booster(); // 호출 불가
		
		// 자식타입으로 형변환 -> 강제형변환(명시적 형변환)
		SupersonicAirplane superSonic = (SupersonicAirplane)airplane;
		
		// 원래 타입으로 변환 시
		// 자식클래스가 가지고 있는 필드 또는 메서드에 접근이 가능해진다
		superSonic.booster();
		System.out.println(superSonic.flyMode);
		
	}
}
