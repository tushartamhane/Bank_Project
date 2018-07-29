package ServiceImpl;

import java.util.Scanner;

import Model.User;

public class HDFC {
	
Scanner sc=new Scanner(System.in);
	
	User u=new User();
	
	public void createAccount(){
		
		System.out.println("Enter name");
		u.setName(sc.next());
		System.out.println("Enter Username");
		u.setUsername(sc.next());
		System.out.println("Enter password");
		u.setPassword(sc.next());
		System.out.println("Enter Account_number");
		u.setAccno(sc.next());
		System.out.println("Enter Address");
		u.setAddress(sc.next());
		
		System.out.println(u.getName());
		System.out.println(u.getUsername());
		System.out.println(u.getPassword());
		System.out.println(u.getAccno());
		System.out.println(u.getAddress());
		
	}

	public void deposite(){
		System.out.println("Enter Ammount no to deposite");
		u.setBalance(sc.nextInt());
		
		}
	
	public void withdrown(){
		
		int balance=u.getBalance();
		System.out.println("Enter Amount to withdraw");
		int ammount=sc.nextInt();
		int dd=balance - ammount;
		u.setBalance(dd);
		System.out.println(dd);
		}
	


}
