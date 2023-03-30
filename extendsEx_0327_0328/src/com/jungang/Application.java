package com.jungang;

import java.util.Scanner;

//0327
public class Application {

	public static void main(String[] args) {
		
//		Student student1 = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
//		Student student2 = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
//		Student student3 = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");
		
		Student[] student = new Student[3];
		student[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
		student[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
		student[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");
		
		for(Student a : student) {
			System.out.println(a.information());
		}
		
		// 
		Employee[] employee = new Employee[10];
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int count = 1;
		out:
		while(true) {
			String name = sc.next();
			int age = sc.nextInt();
			double height = sc.nextDouble();
			double weight = sc.nextDouble();
			int salary = sc.nextInt();
			String dept = sc.next();
			
			System.out.println("현재 저장된 인원 : " + count);
			employee[i] = new Employee(name, age, height, weight, salary, dept);
			i++;
			if(i > employee.length) {
				break;
			}
			while(true) {
				System.out.println("계속 추가 하시겠습니까?(계속 : y 또는 Y, 스톱 : n)");
				String a = sc.next();
				if(a.equals("y") || a.equals("Y")) {
					count++;
					break;
				} else if(a.equals("n")) {
					break out;
				} else {
					System.out.println("다시 입력해 주세요.");
				}
			}
		}
		
		for(Employee a : employee) {
			if(a != null) {
				System.out.println(a.information());
			} 
			
		}
	}

}
