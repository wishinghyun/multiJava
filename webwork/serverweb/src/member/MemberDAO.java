package member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import fw.DBUtil;

public class MemberDAO {
	//삭제
		public int delete(String id) {
			int result = 0;
			Connection con = null;
			PreparedStatement ptmt = null;
			String sql = "delete from member where id = ?";
			try {
				con = DBUtil.getConnect();
				ptmt = con.prepareStatement(sql);
				ptmt.setString(1, id);
				result = ptmt.executeUpdate();
			}catch (SQLException e) {
				e.printStackTrace();
			}finally {
				DBUtil.close(null, ptmt, con);
			}
			return result;
		}
	
	//회원상세조회
	public MemberDTO read(String id) {
		MemberDTO dto = null;
		Connection con = null;
		PreparedStatement ptmt = null;
		String sql = "select * from member where id = ?";
		ResultSet rs = null;
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, id);
			rs = ptmt.executeQuery();
			if(rs.next()) {
				dto = new MemberDTO(rs.getString(1), rs.getString(2), rs.getString(3),
						rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7));
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(rs, ptmt, con);
		}
		return dto;
	}
	
	//회원목록보기
	public ArrayList<MemberDTO> getMemberList(){
		ArrayList<MemberDTO> memberlist = new ArrayList<MemberDTO>();
		MemberDTO member = null;
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		String sql = "select * from member";
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			rs = ptmt.executeQuery();
			while(rs.next()) {
				member = new MemberDTO(rs.getString(1), rs.getString(2), rs.getString(3),
						rs.getString(4), rs.getString(5),rs.getString(6),rs.getInt(7));
				memberlist.add(member);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			DBUtil.close(rs, ptmt, con);
		}
		return memberlist;
	}
	
	//가입
	public int insert(MemberDTO member) {
		int result = 0;
		Connection con = null;
		PreparedStatement ptmt = null;
		String sql = "insert into member values(?,?,?,?,?,?,?)";
		try {
			con=DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, member.getId());
			ptmt.setString(2, member.getPass());
			ptmt.setString(3, member.getName());
			ptmt.setString(4, member.getAddr());
			ptmt.setString(5, member.getDeptNo());
			ptmt.setString(6, member.getGrade());
			ptmt.setInt(7, member.getPoint());
			result = ptmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(null,ptmt, con);
		}
		return result;
	}
}
