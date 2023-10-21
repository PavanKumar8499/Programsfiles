package bankapp;

import java.util.Scanner;
import java.io.*;
public class Copy {
public static void main(String[] args)throws IOException {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter Your mail id : ");
	String email = sc.nextLine();
	System.out.println("Enter Your pasw : ");
//	Console hi = System.console();
//	char[] chars=hi.readPassword();
	
	String pasw = sc.nextLine(); 
	if(email.equals("pophale8499@gmail.com")&& pasw.equals("Pavan@123")) {
		System.out.println("Login Successful...");
		System.out.println("******Welcome*****");
		
		
		//program
		
		
	}else {System.out.println("Try Again");}
}
}
