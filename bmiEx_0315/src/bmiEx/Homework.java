package bmiEx;

public class Homework {

	public static void main(String[] args) {
		
		String a = "125";
		String b = "123.89";
		String c = "46";
		
		int aInt = Integer.parseInt(a);
		double bDouble = Double.parseDouble(b);
		double cDouble = Double.parseDouble(c);
		
		System.out.println(aInt + 10);
		System.out.println(bDouble + 10);
		System.out.println(cDouble + 10);
		
		System.out.printf("%d \n%f \n%5.1f \n%f \n", aInt, bDouble, bDouble, cDouble);
		
		String aStr = String.valueOf(aInt);
		String bStr = String.valueOf(bDouble);
		String cStr = String.valueOf(cDouble);
		
		System.out.println("=========");
		System.out.println(aStr + 10);
		System.out.println(bStr + 10);
		System.out.println(cStr + 10);
		
		String str1 = "250";
		String str2 = "251.15";
		
		int aa = Integer.parseInt(str1);
		double bb = Double.parseDouble(str2);
		
		System.out.println(aa);
		System.out.println(bb);
		
		
		
		
		

	}

}
