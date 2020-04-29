package jdbc.boare.exam;

import java.util.ArrayList;

public interface BoardDAO {
	int insert(BoardDTO board);//�Խñ� ��� - C
	int insert(String id, String title, String content);//�Խñ� ���
	int update(String id, int boardNum);//�Խñ� ���� - U
	int delete(int boardNum);//�Խñ� ���� -D
	ArrayList<BoardDTO> select();//��ü �Խñ� ��ȸ - L
	BoardDTO read(int boardNum);//�Խñ� ��ȸ - R
	ArrayList<BoardDTO> findByTitle(String title);//�Խñ� �˻� - L 
}