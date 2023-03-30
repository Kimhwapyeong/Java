package school;
//0322
public class Teacher {
	
	String name;
	String sex;
	String subject;
	String adress;
	int age;
	
	public Teacher(String name) {
		this(name, "", "", "", 0);
	}
	public Teacher(String name, String sex) {
		this(name, sex, "", "", 0);
	}
	public Teacher(String name, String sex, String subject) {
		this(name, subject, sex, "", 0);
	}
	public Teacher(String name, String sex, String subject, String adress) {
		this(name, sex, subject, adress, 0);
	}
	
	public Teacher(String name, String sex, String subject, String adress, int age) {
		this.name = name;
		this.sex = sex;
		this.subject = subject;
		this.adress = adress;
		this.age = age;
	}
	
}
