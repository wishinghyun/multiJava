package jdbc.member.exam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAOImpl implements MemberDAO {
	@Override
	public MemberDTO login(String id, String pass) {
		MemberDTO member = null;
		Connection con = null;
		PreparedStatement stmt = null;
		String sql = "select * from member where id = ? and pass = ?";
		ResultSet rs = null;
		try {
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, id);
			stmt.setString(2, pass);
			rs = stmt.executeQuery();
			while(rs.next()) {
				member = new MemberDTO(rs.getString(1),rs.getString(2),rs.getString(3),
						rs.getString(4),rs.getString(5),rs.getDate(6),rs.getInt(7));
				
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(rs, stmt, con);
		}
		return member;
	}

	@Override
	public ArrayList<MemberDTO> memberList() {
		ArrayList<MemberDTO> memberlist = new ArrayList<MemberDTO>();
		MemberDTO member = null;
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String sql = "select * from member";
		try {
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			while(rs.next()) {
				member = new MemberDTO(rs.getString(1), rs.getString(2), rs.getString(3),
						rs.getString(4), rs.getString(5), rs.getDate(6), rs.getInt(7));
				memberlist.add(member);
		}
		return memberlist;
	}catch(SQLException e) {
		e.printStackTrace();
	}finally {
		DBUtil.close(rs, stmt, con);
	}return memberlist;
	}

	@Override
	public ArrayList<MemberDTO> findByAddr(String addr) {
		ArrayList<MemberDTO> memberlist = new ArrayList<MemberDTO>();
		Connection con = null;
		PreparedStatement stmt = null;
		MemberDTO member = null;
		ResultSet rs = null;
		String sql = "select * from member where addr like ?";
		try {
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, "%"+addr+"%");
			rs = stmt.executeQuery();
			while(rs.next()) {
				member = new MemberDTO(rs.getString(1) ,rs.getString(2),rs.getString(3),
						rs.getString(4),rs.getString(5),rs.getDate(6),rs.getInt(7));
				memberlist.add(member);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(rs, stmt, con);
		}
		return memberlist;
	}

	public int insert(MemberDTO user) {
		System.out.println("dto사용메소드:"+user);
		Connection con = null;
		PreparedStatement stmt = null;
		int result = 0;
		String sql = "insert into member values(?,?,?,?,?,sysdate,1000)";
		try {
			con=DBUtil.getConnect();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, user.getId());
			stmt.setString(2, user.getPass());
			stmt.setString(3, user.getAddr());
			stmt.setString(4, user.getName());
			stmt.setString(5, user.getDeptno());
			result = stmt.executeUpdate();
			System.out.println(result+"개 행 삽입성공");
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(null,stmt, con);
		}
		return result;
	}
	
	public int delete(String id) {
		Connection con = null;
		PreparedStatement stmt = null;
		int result = 0;
		String sql = "delete from member where id = ?";
		try {
			con = DBUtil.getConnect();
			System.out.println("연결성공"+con);
			stmt = con.prepareStatement(sql);
			stmt.setString(1, id);
			result = stmt.executeUpdate();
			System.out.println(result+"개 행이 삭제됐습니다");
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(null, stmt, con);
		}return result;
	}
	
	public int update(String id, String addr) {
		Connection con = null;
		PreparedStatement stmt = null;
		int result = 0;
		String sql = "update member set id = ? where addr = ?";
		try {
			con = DBUtil.getConnect();
			System.out.println("연결성공"+con);
			stmt = con.prepareStatement(sql);
			stmt.setString(1, id);
			stmt.setString(2, addr);
			result = stmt.executeUpdate();
			System.out.println(result+"개 행이 수정됐습니다");
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(null, stmt, con);
		}
		return result;
	}
}
