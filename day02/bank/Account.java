package bank;

public class Account {
	private int no; // 계좌 번호
	private String owner; // 주인
	private String password; // 계좌 비밀번호
	private int balance; // 금액
	//---------------
	Account(int no, String owner, String password, int balance){
		this.no = no;
		this.owner = owner;
		this.password = password;
		this.balance = balance;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getOwner() {
		return owner;
	}
	public int getBalance() {
		return balance;
	}
		
	// 객체 정보 출력을 위한 toString() 메서드 오버라이딩
		@Override
		public String toString() {
			return "계좌번호: " + no + " | 예금주: " + owner + " | 잔액: " + balance + "원";
		}
}
