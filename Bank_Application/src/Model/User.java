package Model;

public class User {
	
	private String name;
	private String username;
	private String password;
	private String address;
	private String accno;
	private int Balance;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAccno() {
		return accno;
	}
	public void setAccno(String accno) {
		this.accno = accno;
	}
	public int getBalance() {
		return Balance;
	}
	public void setBalance(int balance) {
		Balance = balance;
	}
	
	
}