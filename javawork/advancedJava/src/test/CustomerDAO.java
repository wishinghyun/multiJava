package test;

public interface CustomerDAO {
	int insert(CustomerDTO customer);
	int update(String id, String addr);
	int delete(String id);
}
