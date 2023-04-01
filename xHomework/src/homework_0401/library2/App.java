package homework_0401.library2;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Library lib = new Library();
		Scanner sc = new Scanner(System.in);
		
		out:
		while(true) {
				System.out.println("도서관 어플\n1: 책 추가\n2: 책 삭제\n3: 책 대여\n4: 책 반납");
			int num = 0;
			try {
				num = sc.nextInt();
			} catch (Exception e) {
				String str = sc.next();
				System.out.println(str + "은(는) 숫자가 아닙니다.");
				continue;
			}
			if(1 <= num && num <= 4) {
				switch(num) {
				case 1 :
					outto:
					while(true) {
						System.out.println("책 추가");
						System.out.print("책 제목: ");
						String name = sc.next();
						System.out.print("작가 : ");
						String author = sc.next();
						lib.addBook(name, author);
						System.out.println("계속 추가 : r , 그만 추가 : q");
						String a = sc.next();
						if(a.equalsIgnoreCase("q")) {
							while(true) {
								System.out.println("프로그램 종료 : q , 계속 : r");
								String b = sc.next();
								if(b.equalsIgnoreCase("q")) {
									break out;
								}else if(b.equalsIgnoreCase("r")) {
									break outto;
								}else {
									System.out.println("잘못 입력되었습니다.");
									continue;
								}
							}
						}else if(a.equalsIgnoreCase("r")) {
							continue;
						}else {
							System.out.println("잘못 입력되었습니다.");
						}
						System.out.println("프로그램 종료 : q , 계속 : r");
						String b = sc.next();
						if(b.equalsIgnoreCase("q")) {
							break out;
						}else if(b.equalsIgnoreCase("r")) {
							continue;
						}else {
							System.out.println("잘못 입력되었습니다.");
						}
					}
					break;
					
				case 2 :
					outtt:
					while(true) {
						System.out.println("책 삭제");
						System.out.print("책의 인덱스: ");
						try {
							int index = sc.nextInt();
							lib.removeBook(index);
						} catch (Exception e) {
							String str = sc.next();
							System.out.println(str + "은(는) 숫자가 아닙니다.");
							continue;
						}
						System.out.println("계속 제거 : r , 그만 제거 : q");
						String a = sc.next();
						if(a.equalsIgnoreCase("q")) {
							while(true) {
								System.out.println("프로그램 종료 : q , 계속 : r");
								String b = sc.next();
								if(b.equalsIgnoreCase("q")) {
									break out;
								}else if(b.equalsIgnoreCase("r")) {
									break outtt;
								}else {
									System.out.println("잘못 입력되었습니다.");
									continue;
								}
							}
						}else if(a.equalsIgnoreCase("r")) {
							continue;
						}else {
							System.out.println("잘못 입력되었습니다.");
						}
						System.out.println("프로그램 종료 : q , 계속 : r");
						String b = sc.next();
						if(b.equalsIgnoreCase("q")) {
							break out;
						}else if(a.equalsIgnoreCase("r")) {
							continue;
						}else {
							System.out.println("잘못 입력되었습니다.");
						}
					}
					break;
				case 3 :
					outty:
					while(true) {
							System.out.println("책 대여");
						System.out.print("책의 인덱스: ");
						try {
							int index = sc.nextInt();
							lib.rentBook(index);
						} catch (Exception e) {
							String str = sc.next();
							System.out.println(str + "은(는) 숫자가 아닙니다.");
							continue;
						}
						System.out.println("계속 대여 : r, 그만 대여: q");
						String a = sc.next();
						if(a.equalsIgnoreCase("q")) {
							while(true) {
								System.out.println("프로그램 종료 : q , 계속 : r");
								String b = sc.next();
								if(b.equalsIgnoreCase("q")) {
									break out;
								}else if(b.equalsIgnoreCase("r")) {
									break outty;
								}else {
									System.out.println("잘못 입력되었습니다.");
									continue;
								}
							}
						}else if(a.equalsIgnoreCase("r")) {
							continue;
						}else {
							System.out.println("잘못 입력되었습니다.");
						}
						System.out.println("프로그램 종료 : q , 계속 : r");
						String b = sc.next();
						if(b.equalsIgnoreCase("q")) {
							break out;
						}else if(b.equalsIgnoreCase("r")) {
							continue;
						}else {
							System.out.println("잘못 입력되었습니다.");
						}
					}
					break;
					
				}
			}else {
				System.out.println("숫자는 1~4까지 입력해주세요.");
			}
		}
		lib.toString();
		
	}
	
}
