package homework_0322;

public class KoreanMain {
	public static void main(String[] args) {
		
		Korean korean = new Korean("김화평", "930807", "남");
		System.out.println("이름:" + korean.name);
		
		korean.name = "김하늘";
		
		System.out.println(korean.name);
		System.out.println(korean.ssn);
		System.out.println(korean.sex);
		
	}

}
