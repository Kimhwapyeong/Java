package bmi;
//0317
public class Test {

	public static void main(String[] args) {

		int res = 1;
		String s = (true)?"정상":"비정상";
		
		if(true) {
			res = 0;
			s = "정상";
		}else {
			s = "비정상";
		}

	}

}
