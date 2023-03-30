package arrayEx;
//0321
public class ArrayEx9 {
	public static void main(String[] args) {
		String[] names = new String[3];
		names[0] = new String("Java");
		names[1] = new String("Java");
		names[2] = "C#";
		
//		if(names[0] == names[1]) {		      		// == 으로 비교하면 false
		if(names[0].equals(names[1])) {             // .equals로 비교하면 true
			System.out.println("0번방 == 1번방");		// 참조타입에서 == 은 변수의 주소값을 비교
		} else {									// .equals는 문자열을 비교
			System.out.println("0번방 != 1번방");
		}
	}
	
}
