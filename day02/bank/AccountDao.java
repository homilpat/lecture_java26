package bank;

public interface AccountDao {
	//계좌추가
	boolean insertAccount(String owner, String password, int balance);
	//계좌 읽기
	Account[] selectAll();
	Account selectByNo(int accountNo);
	
}
