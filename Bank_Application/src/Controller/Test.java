package Controller;

import java.util.Scanner;

import ServiceImpl.HDFC;
import ServiceImpl.SBI;

public class Test {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		while(true){
		System.out.println("1:SBI");
		System.out.println("2:HDFC");
		System.out.println("Choose your Bank");
		int ch=sc.nextInt();
		
		switch(ch){
		
		
		case 1:SBI s=new SBI();
		while(true){
			System.out.println("1:createAccount");
			System.out.println("2:deposite");
			System.out.println("3:withdrown");
			System.out.println("4:changepassword");
			//System.out.println("5:exit");
			System.out.println("Enter your Choise");
		
			
			//while(true){
			int x=sc.nextInt();
		
			switch(x){
			
			case 1:s.createAccount();break;
			case 2:s.deposite();break;
			case 3:s.withdrown();break;
			case 4:s.changePassword();break;	
			//case 5:System.exit(0);
			}}
			//}
			
		case 2:HDFC f=new HDFC();
		while(true){
		System.out.println("1:createAccount");
		System.out.println("2:deposite");
		System.out.println("3:withdrown");
		
		
		System.out.println("Enter your Choise");
		
		
		int y=sc.nextInt();
		switch(y){
		
		case 1:f.createAccount();break;
		case 2:f.deposite();break;
		case 3:f.withdrown();break;
		}
		}
		
		default:System.out.println("Invalid Choice");
		}
		}
		
	}
}


