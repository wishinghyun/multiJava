package jdbc.basic;

import java.sql.*;
import java.util.Scanner;

public class PreparedUpdateTest {
	public void update(String id, int boardnum) {
		Connection con = null;
		PreparedStatement stmt = null;
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String password = "tiger";
		String sql = "update tb_board set id = ? where boardnum = ? ";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공");
			con = DriverManager.getConnection(url, user, password);
			System.out.println("연결성공" + con);
			stmt = con.prepareStatement(sql);
			stmt.setString(1, id);
			stmt.setInt(2, boardnum);
			int result = stmt.executeUpdate();
			System.out.println(result + "개 행이 수정됐습니다");
		} catch (ClassNotFoundException e) {
			System.out.println("로딩실패");
		} catch (SQLException e) {
			System.out.println("연결실패");
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null)
					stmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		PreparedUpdateTest udt = new PreparedUpdateTest();
		System.out.print("아이디:");
		String id = key.next();
		System.out.print("번호:");
		int boardnum = key.nextInt();
		System.out.println();
		udt.update(id, boardnum);
	}

}
