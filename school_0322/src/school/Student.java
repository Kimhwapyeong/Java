package school;
//0322
public class Student {

	String name;
	int age;
	String sex;
	String year;
	String clas;
	String adress;
	
	public Student(String name) {
		this(name,0,"","","","");
	}
	public Student(String name, int age) {
		this(name,age,"","","","");
	}
	public Student(String name, int age, String sex) {
		this(name,0,sex,"","","");
	}
	public Student(String name, int age, String sex, String year) {
		this(name,0,sex,year,"","");
	}
	public Student(String name, int age, String sex, String year, String clas) {
		this(name,0,sex,year,clas,"");
	}
	public Student(String name, int age, String sex, String year, String clas, String adress) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.year = year;
		this.clas = clas;
		this.adress = adress;
	}
	
}
