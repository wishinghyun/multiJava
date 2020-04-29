package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jdbc.boare.exam.BoardDTO;
import jdbc.boare.exam.DBUtil;

public class CustomerDAOImpl implements CustomerDAO{
	public int insert(CustomerDTO customer) {
		System.out.println("dto사용메소드:"+customer);
		Connection con = null;
		PreparedStatement stmt = null;
		int result = 0;//메소드 실행결과가 저장될 변수
		String sql 
		= "insert into customer values(?,?,?,?,?,?)";
		try {
			con = DBUtil.getConnect();//DBMS연결
			stmt = con.prepareStatement(sql);
			stmt.setString(1, customer.getId());
			stmt.setString(2, customer.getPass());
			stmt.setString(3, customer.getName());
			stmt.setDate(4, customer.getRegdate());
			stmt.setInt(5, customer.getPoint());
			stmt.setString(6, customer.getAddr());
			result = stmt.executeUpdate();
			System.out.println(result+"개 행 삽입성공");
		}catch(SQLException e) {
			e.printStackTrace();//오류추적
		}finally {
			DBUtil.close(null, stmt, con);
		}
		return result;
	}	
	
	public int delete(String id) {
		Connection con = null;
		PreparedStatement stmt = null;
		int result = 0;
		String sql = "delete from customer where id = ? ";
		
		try {
			con = DBUtil.getConnect();
			System.out.println("연결성공" + con);
			stmt = con.prepareStatement(sql);
			stmt.setString(1, id);
			result = stmt.executeUpdate();
			System.out.println(result + "개 행이 삭제됐습니다");
		} catch (SQLException e) {
			System.out.println("연결실패");
			e.printStackTrace();
		} finally {
			DBUtil.close(null, stmt, con);
		}
		return result;
	}
	
	
	public int update(String id, String addr) {
		Connection con = null;
		PreparedStatement stmt = null;
		int result = 0;
		String sql = "update customer set  = ? where boardnum = ? ";

		try {
			con = DBUtil.getConnect();
			System.out.println("연결성공" + con);
			stmt = con.prepareStatement(sql);
			stmt.setString(1, id);
			stmt.setInt(2, boardNum);
			result = stmt.executeUpdate();
			System.out.println(result + "개 행이 수정됐습니다");		
		} catch (SQLException e) {
			System.out.println("연결실패");
			e.printStackTrace();
		} finally {
			DBUtil.close(null, stmt, con);
		}
		return result;
	}
	
	
	public int insert(String id, String title,String content) {		
		Connection con = null;
		PreparedStatement stmt = null;
		int result = 0;//메소드 실행결과가 저장될 변수
		String sql 
		= "insert into tb_board values(board_seq.nextval,?,?,?,sysdate,0)";
		try {
			con = DBUtil.getConnect();//DBMS연결
			stmt = con.prepareStatement(sql);
			stmt.setString(1, id);
			stmt.setString(2, title);
			stmt.setString(3, content);
			result = stmt.executeUpdate();
			System.out.println(result+"개 행 삽입성공");
		}catch(SQLException e) {
			e.printStackTrace();//오류추적
		}finally {
			DBUtil.close(null, stmt, con);
		}
		return result;
	}
}
