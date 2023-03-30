package board.jungang;
//0322
public class BoardMain {
	
	public static void main(String[] args) {
		int[] intArr = {1,2,3,4,5};
		/*
		 * int[] intArr = new int[5];
		 * intArr[0] = 1;
		 * intArr[1] = 2;
		 * intArr[2] = 3;
		 * intArr[3] = 4;
		 * intArr[4] = 5;
		 */
		
		String[] strArr = new String[5];
		
		// [] : 배열
		// 타입[] 이름 = new 타입[갯수];
		// boardArr 배열에는 Board 타입이 저장된다
		// Board클래스로 생성된 객체를 boardArr 배열에 넣어준다. (Board클래스로부터 생성된 객체는 Board타입)
		Board[] boardArr = new Board[5];
		boardArr[0] = new Board("게시글1", "홍길동");
		boardArr[1] = new Board("게시글2", "홍길동");
		boardArr[2] = new Board("게시글3", "홍길동");
		boardArr[3] = new Board("게시글4", "홍길동");
		boardArr[4] = new Board("게시글5", "홍길동");
		
		for(Board board : boardArr) {
			System.out.println("=============");
			System.out.println(board.title);
			System.out.println(board.content);
			System.out.println(board.date);
			System.out.println(board.hitcount);
			System.out.println("=============");
		}
		
		
		
//		// 게시글을 생성
//		Board board1 = new Board("게시글1", "너무어려워요", "홍길동", "23-03-22", 10);
//		Board board2 = new Board("게시글1", "너무어려워요", "홍길동", "23-03-22", 10);
//		Board board3 = new Board("게시글1", "너무어려워요", "홍길동", "23-03-22", 10);
//		Board board4 = new Board("게시글1", "너무어려워요", "홍길동", "23-03-22", 10);
//		Board board5 = new Board("게시글1", "너무어려워요", "홍길동", "23-03-22", 10);
//		
//		// 배열에 담아줍니다
//		Board[] boardList = new Board[5];
//		boardList[0] = board1;
//		boardList[1] = board2;
//		boardList[2] = board3;
//		boardList[3] = board4;
//		boardList[4] = board5;
//		
//		// 게시글 리스트 생성
//		BoardList list = new BoardList(boardList);
		
	}
}
