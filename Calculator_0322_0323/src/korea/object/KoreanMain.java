package korea.object;
//0322
public class KoreanMain {
	public static void main(String[] args) {
		
		Korean korean = new Korean();
		korean.name = "전도연";
		korean.ssn = "121212-1212121";
		System.out.println("korean =========");
		System.out.println(korean.name);
		System.out.println(korean.ssn);
		System.out.println(korean.nation);
		
		// 객체 초기화
		Korean kim = new Korean("김화평", "123456-1234567");
		System.out.println("kim =========");
		System.out.println(kim.name);
		System.out.println(kim.ssn);
		System.out.println(kim.nation);

		
		Korean lee = new Korean("이동휘", "111111-2222222");
		System.out.println("이동휘 =========");
		System.out.println(lee.name);
		System.out.println(lee.ssn);
		System.out.println(lee.nation);

		
	}

}
