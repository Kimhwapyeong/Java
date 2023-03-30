package homework_0318;

public class Switch {
	
	public static void main(String[] args) {
		
		System.out.println("VIP 등급별 해택");
		char grade = 'C';
		switch(grade) {
			case 'A' : System.out.println("VVIP해택을 받을 수 있습니다.");
			case 'B' : System.out.println("VIP해택을 받을 수 있습니다."); break;
			case 'C' : System.out.println("우수 회원 해택을 받을 수 있습니다."); 
			case 'D' : System.out.println("일반 회원 해택을 받을 수 있습니다."); break;
			default : System.out.println("해택이 없습니다.");
		
		}
		System.out.println("감사합니다.");
		
	}

}
