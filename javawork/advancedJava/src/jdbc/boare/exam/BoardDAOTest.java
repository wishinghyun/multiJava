package jdbc.boare.exam;

import java.util.Scanner;

import jdbc.basic.PreparedDeleteTest;
import jdbc.basic.PreparedInsertTest;
import jdbc.basic.PreparedSelectTest;
import jdbc.basic.PreparedUpdateTest;

public class BoardDAOTest {
/*	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		BoardDAO dao = new BoardDAO();
		System.out.println("*******게시글 등록************");
		System.out.print("아이디:");
		String id = key.next();
		System.out.print("제목:");
		String title = key.next();
		System.out.print("내용:");
		String content = key.next();
		System.out.println();
		dao.insert(id, title, content);
	}
}*/

/*	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		BoardDAO dao = new BoardDAO();
		System.out.print("아이디:");
		String id = key.next();
		System.out.print("번호:");
		int boardnum = key.nextInt();
		System.out.println();
		dao.update(id, boardnum);
}
}*/
	
/*	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		BoardDAO dao = new BoardDAO();
		System.out.print("번호: ");
		int boardnum = key.nextInt();
		System.out.println();
		dao.delete(boardnum);

	}*/
	
	public static void main(String[] args) {		
		PreparedSelectTest se = new PreparedSelectTest();		
		se.select();
	}

}
