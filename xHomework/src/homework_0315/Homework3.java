package homework_0315;

public class Homework3 {
	public static void main(String[] args) {
		
		String a = "2758";
		String b = "245.214";
		String c = "245252312144";
		
		System.out.println(a + 10);
		System.out.println(b + 10);
		System.out.println(c + 10);
		
		int aInt = Integer.parseInt(a);
		double bDouble = Double.parseDouble(b);
		Long cLong = Long.parseLong(c);
		
		System.out.println(aInt + 10);
		System.out.println(bDouble + 10);
		System.out.println(cLong + 10);
		
		System.out.println("====== 숫자를 문자열로 변환 ======");
		
		int var = 128;
		double var2 = 124.65;
		float var3 = 512.45f;
		long var4 = 2100000013109l;
		
		String str = String.valueOf(var);
		String str2 = String.valueOf(var2);
		String str3 = String.valueOf(var3);
		String str4 = String.valueOf(var4);
		
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str3 + 10);
		System.out.println(str4 + 10);
		
		int height = 181;
		int weight = 82;
		String name = "김화평";
		String nickName = "피스킴";
		
		System.out.printf("이름: %-5s \n별명: %-5s \n키: %5d \n몸무게: %5d",
				name, nickName, height, weight);
		
	}

}
