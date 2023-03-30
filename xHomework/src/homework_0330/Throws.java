package homework_0330;

import java.io.IOException;

public class Throws {
	public static void main(String[] args) {
		Throws t = new Throws();
		t.method2();
	}
	
	
	public void method1() throws  IOException, Exception, NullPointerException{
		System.out.println("method1() 호출");
		int num = (int)(Math.random()*3 + 1);
		if(num == 1) {
			throw new Exception();
		} else if(num == 2) {
			throw new IOException();
		} else if(num == 3) {
			throw new NullPointerException();
		}
		
	}
	
	public void method2() {
		System.out.println("method1 호출");
		try {
			method1();
		} catch (IOException e) {
			System.out.println("파일 입출력 도중 오류 발생");
			//e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("null값인 객체는 출력 불가");
			//e.printStackTrace();
		} catch (Exception e) {
			System.out.println("오류 발생");
			//e.printStackTrace();
		}
		
		System.out.println("method1 종료");
	}
	
}
