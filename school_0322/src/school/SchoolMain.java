package school;
//0322
public class SchoolMain {
	public static void main(String[] args) {
		
		Student[] student = new Student[5];
		student[0] = new Student("김화평", 13, "남", "6학년", "5반", "인천");
		student[1] = new Student("김하늘", 12, "남", "5학년", "4반", "인천");
		student[2] = new Student("김두환", 12, "남", "5학년", "4반", "인천");
		student[3] = new Student("김좌진", 11, "남", "4학년", "1반", "인천");
		student[4] = new Student("김정은", 8, "남", "1학년", "2반", "평양");
		
		System.out.println("=====학생=====");
		for(Student stu : student) {
			System.out.printf("%s : %d, %s, %s, %s, %s\n", stu.name, 
					stu.age, stu.sex, stu.year, stu.clas, stu.adress );
		}
		
		Teacher[] teacher = new Teacher[5];
		teacher[0] = new Teacher("오바마", "남", "영어", "미국", 30);
		teacher[1] = new Teacher("김세종", "남", "국어", "조선", 31);
		teacher[2] = new Teacher("맥아더", "남", "교련", "미국", 32);
		teacher[3] = new Teacher("빌게이츠", "남", "컴퓨터", "미국", 29);
		teacher[4] = new Teacher("김동현", "남", "체육", "서울", 27);
		
		System.out.println("=====교사=====");
		for(Teacher tea : teacher) {
			System.out.printf("%s : %s, %s, %s, %d\n", tea.name, tea.sex, 
					tea.subject, tea.adress, tea.age);
		}
		
	}
	
}
