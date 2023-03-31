package sec01.verift.exam03;
//0331
public class Student {
	private String studentNum;
	
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			if(((Student)obj).studentNum.equals(studentNum)) {
				return true;
			}else {
				return false;
			}
		}
		return false;
		
	}
	
	@Override
	public int hashCode() {
		return Integer.parseInt(studentNum);
	}
	
	
}
