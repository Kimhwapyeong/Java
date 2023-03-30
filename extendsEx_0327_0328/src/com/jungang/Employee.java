package com.jungang;
//0327
public class Employee extends Person{

	private int salary;
	private String dept;
	
	public Employee() {
	
	}
	
	public Employee(String name, int age, double height,
			double weight, int salary, String dept) {
		super(age, height, weight);
		super.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	
	public String information() {
		return name + " " + getAge() + " " + getHeight() + " " + 
				getWeight() + " " + salary + " " + dept;
	}
	
}
