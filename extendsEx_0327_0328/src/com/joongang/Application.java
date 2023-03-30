package com.joongang;

import java.util.Scanner;

//0328
public class Application {

	public static void main(String[] args) {
		// 3명의 학생 정보를 기록할 수 있게 객체 배열을 할당
		// 데이터를 참고하여 3명의 학생 객체 생성
		// 반복문을 통해 출력
		// 배열 선언 : 같은 타입의 데이터를 여러 개 보관
		// 배열 선언 : 타임[] 변수명 = new 타입();
		Student[] sArry = new Student[3];
		
		// 학생 객체를 생성 후 배열에 담기
		Student s1 = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
		sArry[0] = s1;
		
		sArry[1] = new Student("김말동", 21, 187.3, 80.0, 2, "경영학과");
		sArry[2] = new Student("강개똥", 23, 167.0, 45.0, 4, "정보통신공학과");
		
		for(Student a : sArry) {
			System.out.println(a.information());
		}
		
		// 1. 최대 10명의 사원 정보를 기록할 객체 배열 생성
		// 2. 키보드로 사원 정보를 입력 받도록 구현
		// Employee 타입을 담을 수 있는 10개의 방이 생성되고
		// 참조변수의 초기값인 null로 초기화 된다
		Employee[] employee = new Employee[10];
		Scanner sc = new Scanner(System.in);
		 
		int index = 0;
		out:
		while(true) {
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("나이 : ");
			int age = sc.nextInt();
			System.out.print("신장 : ");
			double height = sc.nextDouble();
			System.out.print("몸무게 : ");
			double weight = sc.nextDouble();
			System.out.print("급여 : ");
			int salary = sc.nextInt();
			System.out.print("부서 : ");
			String dept = sc.next();
			
			// 매개변수 생성자를 이용하여 필드를 초기화
			Employee emp = new Employee(name, age, height, weight, salary, dept);
			// 사용자로부터 입력받은 값으로 사원을 생성하고
			// 배열에 입력
			employee[index] = emp;
			System.out.println("저장된 인원 : " + (index+1));
			// 사원이 입력된 후 다음번 방을 가르킴
			index++;
			
			// 반복문 탈출
			while(true) {
				System.out.println("종료 : n, 계속 y 또는 Y");
				String str = sc.next();
				if(str.equals("n") || index == 10) {
					break out;
				} else if(str.equals("y") || str.equals("Y")) {
					break;
				} else {
					System.out.println("다시 입력해 주세요.");
				}
				
			}
			
		}
		
		for(Employee e : employee) {
			// null 체크
			// 배열이 초기화 될 때 null값으로 초기화
			// e. <-- 주소접근연산자인 .을 이용한 경우
			// null은 주소를 가지고 있지 않으므로 오류가 발생
			if(e != null) {
				System.out.println(e.information());
			}
		}
	}
}




















