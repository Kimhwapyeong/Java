package com.jungang.common;
//0323
public class PersonMain {

	public static void main(String[] args) {
		
		Person person = new Person();
		Person hong = new Person("홍길동", 10, 150, 70);
		
		System.out.println(person.information());
		System.out.println(hong.information());
		
		Person[] personArr = new Person[5];
		personArr[0] = new Person("김지민", 30, 0, 0);
		personArr[1] = new Person("한가인", 20, 0, 0);
		personArr[2] = new Person("김종민", 15, 0, 0);
		personArr[3] = new Person("김종국", 70, 0, 0);
		personArr[4] = new Person("서태지", 40, 0, 0);
		
		// 타입 변수명 : 배열
		for(Person per : personArr) {
			System.out.println(per.information());
			System.out.println("===========");
		}
		
	}

}
