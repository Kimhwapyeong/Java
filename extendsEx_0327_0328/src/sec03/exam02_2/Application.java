package sec03.exam02_2;
//0328
public class Application {
	public static void main(String[] args) {
		
		Animal[] animal = new Animal[5];
		int i=0;
		while(i<animal.length) {
			int ran = (int)(Math.random()*2);
			if(ran == 0) {
				animal[i] = new Dog("개", "진돗개", 20);
			}else {
				animal[i] = new Cat("고양이", "러시안블루", "어딘가", "블루");
			}
			i++;
		}
		
		for(Animal a : animal) {
			a.speak();
		}
	}
}
