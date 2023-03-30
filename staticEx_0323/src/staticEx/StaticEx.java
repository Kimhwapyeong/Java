package staticEx;
//0323
public class StaticEx {
	
	public String name;
	public static String name2;
	
	public static void main(String[] args) {
		
		// name; 인스턴스 필드는 생성하지 않고는 사용할 수 없다.
		// name 에 static을 넣어주면 생성하지 않아도 사용할 수 있다.
		// static은 정적 멤버로 프로그램 시작과 동시에 메모리에 올라간다.
		//name = "김"; // name은 static이 붙지 않았기 때문에 사용 불가
		name2 = "김";
	}
	
}
