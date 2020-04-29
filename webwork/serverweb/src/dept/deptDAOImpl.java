package dept;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import fw.DBUtil;

public class deptDAOImpl implements deptDAO {
	//read
	public deptDTO read(String deptNo) {
		deptDTO dto = null;
		Connection con = null;
		PreparedStatement ptmt = null;
		String sql = "select * from mydept where deptno = ?";
		ResultSet rs = null;
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, deptNo);
			rs = ptmt.executeQuery();
			//�������� �ڹٰ�ü�� ��ȯ
			// - ���ڵ尡 ���� �� : DTO�� ���ڵ带 ��ȯ�ϰ� ArrayList�� add - while
			// - ���ڵ尡 �� �� : DTO�� ���ڵ� ��ȯ - if
			if(rs.next()) {
				dto = new deptDTO(rs.getString(1), rs.getString(2), rs.getString(3),
						rs.getString(4), rs.getString(5));
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(rs, ptmt, con);
		}
		return dto;
	}
	
	//delete
	public int delete(String deptNo) {
		int result = 0;
		Connection con = null;
		PreparedStatement ptmt = null;
		String sql = "delete from mydept where deptno = ?";
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, deptNo);
			result = ptmt.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(null, ptmt, con);
		}
		return result;
	}
	//��ü ��� ���
	public ArrayList<deptDTO> getDeptList(){
		System.out.println("getDeptListȣ��=> ������ �Ѱ��� �Ķ���� ���");
		ArrayList<deptDTO> deptlist = new ArrayList<deptDTO>();
		deptDTO dept = null;
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		String sql = "select * from mydept";
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			rs = ptmt.executeQuery();
			while(rs.next()) {
				System.out.println("while");
				dept = new deptDTO(rs.getString(1), rs.getString(2), rs.getString(3),
						rs.getString(4), rs.getString(5));
				deptlist.add(dept);
			}
			System.out.println("dao=>"+deptlist.size());
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			DBUtil.close(rs, ptmt, con);
		}
		return deptlist;
	}
	//�μ����
		public int insert(deptDTO user) {
			int result = 0;
			Connection con = null;
			PreparedStatement ptmt = null;
			String sql = "insert into mydept values(?,?,?,?,?)";
			try {
				con=DBUtil.getConnect();
				ptmt = con.prepareStatement(sql);
				ptmt.setString(1, user.getDeptNo());
				ptmt.setString(2, user.getDeptName());
				ptmt.setString(3, user.getLoc());
				ptmt.setString(4, user.getTel());
				ptmt.setString(5, user.getMgr());
				result = ptmt.executeUpdate();
			}catch(SQLException e) {
				e.printStackTrace();
			}finally {
				DBUtil.close(null,ptmt, con);
			}
			return result;
		}
	}
