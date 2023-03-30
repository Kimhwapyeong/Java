package homework_0327;

public class Student extends Person{
	
	private int grade;
	private String major;
	
	public Student() {
		
	}

	public Student(String name, int age, double height, double weight, 
			int grade, String major) {
		super(age, height, weight);
		super.name = name;
		this.grade = grade;
		this.major = major;
	}
	
	public String information() {
		return super.name + " " + super.getAge() + " " + super.getHeight() +
				" " + super.getWeight() + " " + grade + " " + major;
	}
	
	
}
