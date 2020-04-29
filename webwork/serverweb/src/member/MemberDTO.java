package member;

public class MemberDTO {
	private String Id;
	private String Pass;
	private String Name;
	private String Addr;
	private String DeptNo;
	private String Grade;
	private int Point;
	
	public MemberDTO() {
		
	}
	public MemberDTO(String id, String pass, String name, String addr, String deptNo, String grade, int point) {
		super();
		Id = id;
		Pass = pass;
		Name = name;
		Addr = addr;
		DeptNo = deptNo;
		Grade = grade;
		Point = point;
	}
	
	@Override
	public String toString() {
		return "MemberDTO [Id=" + Id + ", Pass=" + Pass + ", Name=" + Name + ", Addr=" + Addr + ", DeptNo=" + DeptNo
				+ ", Grade=" + Grade + ", Point=" + Point + "]";
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getPass() {
		return Pass;
	}
	public void setPass(String pass) {
		Pass = pass;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddr() {
		return Addr;
	}
	public void setAddr(String addr) {
		Addr = addr;
	}
	public String getDeptNo() {
		return DeptNo;
	}
	public void setDeptNo(String deptNo) {
		DeptNo = deptNo;
	}
	public String getGrade() {
		return Grade;
	}
	public void setGrade(String grade) {
		Grade = grade;
	}
	public int getPoint() {
		return Point;
	}
	public void setPoint(int point) {
		Point = point;
	}
	
	
}
