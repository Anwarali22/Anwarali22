package Login.stud.registration;

public interface CustomerDAO {

	
	
	public int insertCustomer(Customer c);
	
	public Customer getCustomer(String username,String password);
}
