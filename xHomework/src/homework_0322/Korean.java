package homework_0322;

public class Korean {
	
	String nation = "대한민국";
	String name;
	String ssn;
	String sex;
	
	public Korean() {
		this("이름", "주민번호", "성별");
	}
	public Korean(String name) {
		this(name, "주민번호", "성별");
	}
	public Korean(String name, String ssn) {
		this(name, ssn, "성별");
	}

	public Korean(String name, String ssn, String sex) {
		this.name = name;
		this.ssn = ssn;
		this.sex = sex;
	}
	
}
