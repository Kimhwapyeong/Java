package com.kh.practice2;
//0329
import com.kh.practice2.mode.vo.Animal;
import com.kh.practice2.mode.vo.Cat;
import com.kh.practice2.mode.vo.Dog;

public class Application {
	public static void main(String[] args) {
		// Animal 타입의 객체배열 크기 5로 생성
		Animal[] animalArr = new Animal[5];
		// 각 인덱스에 무작위로 Dog객체 또는 Cat객체로 생성
		Dog dog = new Dog("멍뭉이", "말라뮤트", 25);
		Cat cat = new Cat("야옹이", "길냥이", "구로구", "검정");
		
		// 0~4
		// 배열의 각 방에 고양이 혹은 멍멍이를 입력
		for(int i=0; i<5; i++) {
			int index = (int)(Math.random()*2);
			if(index == 1) {
				animalArr[i] = dog;
			}else {
				animalArr[i] = cat;
			}
		}
		// 반복문을 통하여 해당 배열의 0번 인덱스부터 마지막 인덱스까지의
		// 객체의 speak() 메소드 호출
		for(Animal a : animalArr) {
			// 자식 객체에서 오버라이딩(재정의) 되어진 메소드가 호출
			a.speak();
		}
		
	}
	
}
