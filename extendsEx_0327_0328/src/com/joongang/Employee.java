package com.joongang;
//0328
public class Employee extends Person{
	private int salary;
	private String dept;
	
	public Employee() {
		
	}
	
	// 초기화
	public Employee(String name, int age, double height, double weight,
			int salary, String dept) {
		// 부모생성자는 첫 번째 줄에서 호출
		super(age, height, weight);
		super.name = name;
		//this.name 가능.
		setSalary(salary);
		setDept(dept);
	}
	
	public String information() {
		// 부모 메서드 호출결과 반환된 String 값에
		// 자식 필드의 값을 추가하여 반환
		return super.information() + " " + getSalary() + " " + getDept();
	}
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
	
	
}
