package dept;

import java.util.ArrayList;

public interface deptDAO {
	int insert(deptDTO user);
	ArrayList<deptDTO> getDeptList();
	int delete(String deptNo);
	deptDTO read(String deptNo);
}
