package homework_0330;

public class Member {
	public static void main(String[] args) {
		Member member1 = new Member("김두한");
		Member member2 = new Member("김두한");
	
		System.out.println(member1.equals(member2));
	
	}
	
	private String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Member) {
			if(((Member)(obj)).getId().equals(id)){
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
//		return super.equals(obj);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
}
