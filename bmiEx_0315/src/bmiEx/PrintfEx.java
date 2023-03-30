//230315
package bmiEx;

public class PrintfEx {

	public static void main(String[] args) {
		String name = "자바라";
		int age = 20;
		String id = "java";
		double height = 1.6;
		long money = 10000000000000L;
		
		System.out.println(money);
		// 3자리 수 마다 , 출력
		System.out.printf("%,d\n", money);
		
		System.out.println("이름:" + name + "나이: " + age + " 아이디: " + id);
		
		// 형식문자열
		// 지정한 형식문자열에 맞게 값 또는 변수를 대입할 수 있다
		// %s : 문자열, %d : 정수, %f : 실수
		// 자릿수를 정해줄 때 
		// %5d : 왼쪽자리 공백
		// %-5d : 오른쪽자리 공백
		// %05d : 빈자리를 0으로 채움
		// %10.2f : 소수점 이상 7자리 소수 2자리
		System.out.printf("이름: %s \n나이: %d \n아이디: %s \n키: %f \n", name, age, id, height);
		System.out.printf("이름: %s 나이: %d 아이디: %s 키: %f \n", "김화평", 7, "xksxhsl", 120f);
		System.out.printf("이름: %5s 나이: %d 아이디: %s 키: %f \n", "김화평", 7, "xksxhsl", 120f);
		System.out.printf("이름: %-5s 나이: %d 아이디: %s 키: %f \n", "김화평", 7, "xksxhsl", 120f);
		System.out.printf("이름: %5s 나이: %05d 아이디: %s 키: %f \n", "김화평", 7, "xksxhsl", 120f);
		System.out.printf("이름: %5s 나이: %05d 아이디: %s 키: %10.2f \n", "김화평", 7, "xksxhsl", 120f);
		
		
		
		
	}

}
