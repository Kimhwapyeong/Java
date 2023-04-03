package com.library;
//0403
import java.util.Scanner;

public class App {

	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		App app = new App();
		System.out.println("나이 입력");
		app.getInt();
		System.out.println("이름 입력");
		app.getString();
	}
	
	
	public int getInt() {
		int i = 0;
		while(true) {
			try {
				String str = sc.next();
				if(str.equalsIgnoreCase("q")){
					System.out.println("프로그램 종료합니다.");
					System.exit(0);
				}
				i = Integer.parseInt(str);
				return i;
			} catch (Exception e) {
				System.err.println("입력 중 오류\n숫자를 입력해주세요.");
			}
		}
	}
	
	public String getString() {
		while(true) {
			try {
				String str = sc.next();
				// 숫자인 경우 다시 받아오도록
				try {
					// 숫자로 변환합니다.
					Integer.parseInt(str);
					System.err.println("문자를 입력해주세요.");
					// 숫자로 변환 되면 입력을 다시 받아올 수 있도록 합니다.
					continue;
				}catch (Exception e){
					
				}
				if(str.equalsIgnoreCase("q")) {
					System.out.println("프로그램 종료합니다.");
					System.exit(0);
				}
				return str;
			} catch (Exception e) {
				System.err.println("입력 중 오류");
			}
			
		}
	}
	
	
	
}
