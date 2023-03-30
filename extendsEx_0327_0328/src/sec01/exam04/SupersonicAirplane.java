package sec01.exam04;
//0327
// 상속받을 때 사용하는 키워드
// extends + 부모클래스명
public class SupersonicAirplane extends Airplane {

	public int flyMode;
	// 상수
	// 한번 정의후 값을 변경할 수 없다
	// 대문자로 작성하고 단어를 연결할 경우 _를 붙여준다
	// 비행모드를 숫자타입으로 정의
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	// 매개변수를 받아서 flyMode를 세팅
	public SupersonicAirplane(int flyMode){
		// 부모 생성자 호출, 부모가 먼저 만들어져야 하기 때문에
		// super(); // 자동으로 호출(기본생성자일 경우)
		System.out.println("=======SupersonicAirplane 생성합니다.");
		if(flyMode == NORMAL || flyMode == SUPERSONIC) {
			this.flyMode = flyMode;
		} else {
			flyMode = NORMAL;
		}
	}
	
	@Override
	public void fly() {
		// 부모가 가지고 있는 메서드를 자식 클래스에서 재정의
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속비행 입니다.");
		} else {
			// fly()를 재작성 했지만
			// 부모가 가지고 있는 fly()메서드를 호출할 수 있다
			// super를 이용해서 접근
			super.fly();
		}
	}
	
	public void booster() {
		System.out.println("부스터 작동!!!!");
	}
	
}
