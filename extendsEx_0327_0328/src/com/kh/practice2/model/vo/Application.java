package com.kh.practice2.model.vo;

import java.util.Scanner;

//0328
public class Application {

	public static void main(String[] args) {
		Animal[] animal = new Animal[5];
		Scanner sc = new Scanner(System.in);
		int i = 0;
		while(i<animal.length) {
			int ran = (int)(Math.random()*2);
			if(ran == 0) {
				System.out.println("강아지 정보 입력");
				System.out.print("이름 : ");
				String name = sc.next();
				System.out.print("종류 : ");
				String kinds = sc.next();
				System.out.print("몸무게 : ");
				int weight = sc.nextInt();
				animal[i] = new Dog(name, kinds, weight);
			}else {
				System.out.println("고양이 정보 입력");
				System.out.print("이름 : ");
				String name = sc.next();
				System.out.print("종류 : ");
				String kinds = sc.next();
				System.out.print("지역 : ");
				String location = sc.next();
				System.out.print("색상 : ");
				String color = sc.next();
				animal[i] = new Cat(name, kinds, location, color);
			}
			i++;
		}
		for(Animal a : animal) {
			a.speak();
		}
		
	}

}
